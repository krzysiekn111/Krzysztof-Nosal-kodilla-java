package com.kodilla.testing2.facebook;


import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE_ACCEPT = "//div[contains(@class, \"_9xo5\")]/button";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")][2]/a";
    public static final String XPATH_NAME = "//div[contains(@class,\"_5dbb\")]/input";
    public static final String XPATH_LASTNAME = "//div[contains(@class,\"_5dbb\")]/div/input";
    public static final String XPATH_EMAIL = "//input[contains(@name,\"_email\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@name,\"passwd\")]";
    public static final String XPATH_DAY = "//select[contains(@id,\"day\")]";
    public static final String XPATH_MONTH = "//select[contains(@id,\"month\")]";
    public static final String XPATH_YEAR = "//select[contains(@id,\"year\")]";
    public static final String XPATH_SEX = "//input[contains(@name,\"sex\") and contains(@value,\"2\")]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath(XPATH_COOKIE_ACCEPT)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(XPATH_NAME)).sendKeys("Jan");
        driver.findElement(By.xpath(XPATH_LASTNAME)).sendKeys("Kowalski");
        driver.findElement(By.xpath(XPATH_EMAIL)).sendKeys("janKowalski79.gmail.com");
        driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys("1234");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("1");

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(7);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1979");

        driver.findElement(By.xpath(XPATH_SEX)).click();

    }
}
