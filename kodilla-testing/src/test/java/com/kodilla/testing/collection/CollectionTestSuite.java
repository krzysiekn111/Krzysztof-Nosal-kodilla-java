package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @Test
    @DisplayName("test checking if list is empty")
    void testOddNumbersExterminatorEmptyList() {
        //given
        List<Integer> integerList = new ArrayList<>();

        //when
        List<Integer> resultList = OddNumbersExterminator.exterminate(integerList);

        //then
        Assertions.assertTrue(resultList.isEmpty());
    }
    @DisplayName("test to delete odd numbers from Integer list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //given
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);

        //when
        List<Integer> resultList = OddNumbersExterminator.exterminate(integerList);

        //then
        List<Integer> expectedList = List.of(2, 4, 6);
        Assertions.assertEquals(expectedList, resultList);
    }
}
