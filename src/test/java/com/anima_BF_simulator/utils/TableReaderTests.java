package com.anima_BF_simulator.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TableReaderTests {

@Autowired
public TableReader reader;

@Test
void resultsFileExists(){
    assertTrue(reader.readResultsTable().exists());
}

@Test
void resultsFileReadable(){
    assertTrue(reader.readResultsTable().canRead());
}
}
