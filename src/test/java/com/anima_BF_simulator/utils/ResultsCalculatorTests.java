package com.anima_BF_simulator.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
public class ResultsCalculatorTests {

    @Autowired
    public ResultsCalculator calculator;

    @Test
    void test(){
        assertSame('1','1');
    }
}
