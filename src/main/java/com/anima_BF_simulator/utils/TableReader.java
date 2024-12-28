package com.anima_BF_simulator.utils;

import java.io.File;
import java.util.Objects;

public class TableReader {

    private String readResultsTable (){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource("fileTest.txt")).getFile());

        return "";
    }
}
