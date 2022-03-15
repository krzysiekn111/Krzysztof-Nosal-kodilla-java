package com.kodilla.testing.collection;


import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer digit : numbers) {
            if (digit % 2 == 0) {
                resultList.add(digit);
            }
        }
        return resultList;
    }
}
