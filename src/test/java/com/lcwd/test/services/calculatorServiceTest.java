package com.lcwd.test.services;

import java.util.*;

import org.junit.*;

public class calculatorServiceTest {

    int counter = 0;
    
    // @BeforeClass before all test cases || static because runs at class level
    @BeforeClass
    public static void init(){
        System.out.println("Before all the cases: ");
        System.out.println("started test: "+ new Date());
    }

    @Before //executes the  method before each test case
    public void beforeEach(){
        System.out.println("Before each test case");
        counter = 0;
    }
    // test method of addTwoNumbers
    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException{
        for(int i =1; i<=20; i++){
            counter+=i;
        }
        Thread.sleep(3000);
        System.out.println("test for addTwoNumbersTest");
        int result = calculatorService.addTwoNumbers(26, 47);

        int expected = 73;
        System.out.println("counter in first test case: "+ counter);
        Assert.assertEquals(expected, result);
        // actual result

        // expected result
    }
    @Test
    public void sumAnyNumberTest(){
        for(int i =1; i<=100; i++){
            counter+=i;
        }
        System.out.println("test for sumAnyNumberTest");
        int result = calculatorService.sumAnyNumbers(2,7,8,9);
        int expectedResult = 26;
        System.out.println("counter in second test case: "+ counter);
        Assert.assertEquals(expectedResult, result);
    }

    @AfterClass // after all test cases
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("End test cases: "+ new Date());
    }
}
