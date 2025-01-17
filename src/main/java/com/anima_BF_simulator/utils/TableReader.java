package com.anima_BF_simulator.utils;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Objects;

@Component
public class TableReader {

    public File readResultsTable (){
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource("tableResults.json")).getFile());
    }
}
