package com.anima_BF_simulator.utils;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TableReaderTests {

@Autowired
public TableReader reader;

    @Test
    void resultsFileExists(){
        assertTrue(reader.readFileResultsTable().exists());
    }

    @Test
    void resultsFileReadable(){
        assertTrue(reader.readFileResultsTable().canRead());
        assertFalse(reader.readFileResultsTable().canWrite());
    }

    @Test
    void resultsExists() {
        File file = reader.readFileResultsTable();
        assertFalse(reader.extractResultsFromFile(file).isEmpty());
    }

    @Test
    void JSONArrayExists() {
        JSONArray array = reader.parseStringIntoJSONArray();
        assertFalse(array.isNull(0));
        assertFalse(array.isNull(481));
        assertTrue(array.isNull(482));
    }
}
