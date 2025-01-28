package com.anima_BF_simulator.utils;

import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

@Component
public class TableReader {

    public File readFileResultsTable (){
        ClassLoader classLoader = getClass().getClassLoader();
        File resultsFile = new File(Objects.requireNonNull(classLoader.getResource("tableResults.json")).getFile());
        resultsFile.setWritable(false);
        return resultsFile;
    }

    public String extractResultsFromFile(File file) {
        try {
            return Files.readString(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JSONArray parseStringIntoJSONArray() {
        String JSONString = extractResultsFromFile(readFileResultsTable());
        JSONObject obj = new JSONObject(JSONString);
        return obj.getJSONArray("results");
    }

}
