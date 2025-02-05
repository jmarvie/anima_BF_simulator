package com.anima_BF_simulator.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ResultsCalculatorTests {

    @Autowired
    public ResultsCalculator calculator;

    @Test
    void testResultsFromTable(){
        assertEquals(0, calculator.getResultFromTable(1, 0));
        assertEquals(0, calculator.getResultFromTable(1, 10));
        assertEquals(50, calculator.getResultFromTable(50, 0));
        assertEquals(50, calculator.getResultFromTable(59, 0));
        assertEquals(0, calculator.getResultFromTable(50, 5));
        assertEquals(200, calculator.getResultFromTable(205, 0));
        assertEquals(100, calculator.getResultFromTable(209, 10));
        assertEquals(400, calculator.getResultFromTable(400, 0));
        assertEquals(340, calculator.getResultFromTable(1000, 6));
        assertEquals(0, calculator.getResultFromTable(-1, 0));
        assertEquals(0, calculator.getResultFromTable(-10, 0));
        assertEquals(50, calculator.getResultFromTable(-101, 0));
        assertEquals(50, calculator.getResultFromTable(-110, 0));
        assertEquals(100, calculator.getResultFromTable(-201, 0));
        assertEquals(100, calculator.getResultFromTable(-210, 0));
        assertEquals(125, calculator.getResultFromTable(-255, 0));
        assertEquals(150, calculator.getResultFromTable(-303, 0));
        assertEquals(150, calculator.getResultFromTable(-1000, 0));
    }

    @Test
    void testGetDmgScore(){
        assertEquals(0, calculator.getDmgScore(10,0,0));
        assertEquals(0, calculator.getDmgScore(1000,0,10));
        assertEquals(0, calculator.getDmgScore(10,20,0));
        assertEquals(0, calculator.getDmgScore(100,29,5));
        assertEquals(8, calculator.getDmgScore(20,50,1));
        assertEquals(0, calculator.getDmgScore(150,50,6));
        assertEquals(16, calculator.getDmgScore(20,100,2));
        assertEquals(45, calculator.getDmgScore(150,100,7));
        assertEquals(105, calculator.getDmgScore(50,250,4));
        assertEquals(425, calculator.getDmgScore(250,250,8));
    }

    @Test
    void testCounterAttackScore(){
        assertEquals(0, calculator.getCounterAttackScore(-1));
        assertEquals(0, calculator.getCounterAttackScore(-10));
        assertEquals(5, calculator.getCounterAttackScore(-15));
        assertEquals(20, calculator.getCounterAttackScore(-41));
        assertEquals(20, calculator.getCounterAttackScore(-50));
        assertEquals(45, calculator.getCounterAttackScore(-100));
        assertEquals(95, calculator.getCounterAttackScore(-200));
        assertEquals(150, calculator.getCounterAttackScore(-1000));
    }
}
