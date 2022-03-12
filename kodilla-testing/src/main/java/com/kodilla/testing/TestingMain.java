package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
import org.testng.annotations.Test;
//import org.junit.jupiter.api.Assertions;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
//       kalkulator
        int addingResult = Calculator.add(2,4);
        double subtractingResult = Calculator.subtract(6,7);

        if (addingResult != 2+4 || subtractingResult != 6-7) {
            System.out.println("Kalkulator działa nieprawidłowo");
        } else {
            System.out.println("Kalkualtor działa prawidłowo");
        }
    }
}