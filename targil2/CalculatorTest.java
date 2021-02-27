package com.company;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test

    public void testAdd_small_numbers() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        double actual_result = calculator.add(3,4);
        //assert
        double expected_result = 7;

        assertEquals(expected_result, actual_result);
        }
        public void test_minus_big_numbers(){

        Calculator calculator = new Calculator();

        double actual_result = calculator.minus(62,53);
        double expected_result = 9;
        assertEquals(expected_result, actual_result);
        }

        public void testMultiply_small_numbers(){

        Calculator calculator = new Calculator();
        double actual_result = calculator.multiply(6,5);
        double expected_result = 30;
        assertEquals(expected_result, actual_result);
        }
        public void testDiv_small_numbers(){

        Calculator calculator = new Calculator();
        double actual_result = calculator.div(5,5);
        double expected_result = 1;
        assertEquals(expected_result, actual_result);
        }


    }
