package com.kodilla.testing2.crudapp;
import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://krzysiekn111.github.io/";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    //    @AfterEach
//    public void cleanUpAfterTest() {
//        driver.close();
//    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
    }

    @Test public void shouldDeleteTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTestTask(taskName);
    }

    private void deleteTestTask(String taskName) throws InterruptedException {
        driver.switchTo().alert().dismiss();
        while(0==driver.findElements(By.xpath("/html/body/main/section[2]/div/form/div/fieldset[2]/select[1]")).size());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteButton =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"datatable__button\")][4]"));
                    deleteButton.click();
                });

        Thread.sleep(1000);
    }

    private String createCrudAppTestTask() throws InterruptedException {
//        final String XPATH_TASK_NAME = "//form[contains(@action,\"api.trello.com\")]/fieldset[1]/input";
        final String XPATH_TASK_NAME = "//input[contains(@placeholder,\"Insert\")]";
//        final String XPATH_TASK_NAME = "//form[contains(@class,\"data\")]/fieldset[1]/input";
//        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_TASK_CONTENT = "/html/body/main/section[1]/form/fieldset[2]/textarea";
//        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        final String XPATH_ADD_BUTTON = "/html/body/main/section[1]/form/fieldset[3]/button";
        final String XPATH_PUT_EMAIL = "//*[@id=\"user\"]";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();                                         // [1]

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());   // [2]

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()           // [3]
                .filter(anyForm ->                                             // [4]
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")) // [5]
                                .getText().equals(taskName))                        // [6]
                .forEach(theForm -> {                                          // [7]
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));    // [8]
                    Select select = new Select(selectElement);                 // [9]
                    select.selectByIndex(1);                                   // [10]

                    WebElement buttonCreateCard =                              // [11]
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]")); // [12]
                    buttonCreateCard.click();                                  // [13]
                });                                                            // [14]
        Thread.sleep(1000);                                                  // [15]
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        final String XPATH_PUT_EMAIL = "//*[@id=\"user\"]";
        final String XPATH_SELECT_BOARD = "//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/ul/li/a/div";
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);	// [1]
        driverTrello.get(TRELLO_URL);                                                // [2]

        driverTrello.findElement(By.id("user")).sendKeys("krzysztofnosal1");		        // [3]
//        driverTrello.findElement(By.id("password")).sendKeys("krzysztofnosal1");		    // [4]
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();									                                // [5]

        Thread.sleep(2000);								                            // [6]

        driverTrello.findElement(By.id("username")).sendKeys("krzysiekn111@gmail.com");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(1000);

        driverTrello.findElement(By.id("password")).sendKeys("krzysztofnosal1");		    // [7]
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(8000);								                            // [8]

        driverTrello.findElements(By.xpath(XPATH_SELECT_BOARD)).stream()  // [9]
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Aplication\"]")).size() > 0)  // [10]
                .forEach(WebElement::click);						                        // [11]

        Thread.sleep(8000);								                            // [12]

        result = driverTrello.findElements(By.xpath("//span")).stream()		        // [13]
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));    		        // [14]

        driverTrello.close();							                            // [15]

        return result;
    }

}


