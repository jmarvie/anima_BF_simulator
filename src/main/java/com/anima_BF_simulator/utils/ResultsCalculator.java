package com.anima_BF_simulator.utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ResultsCalculator {

    @Autowired
    public TableReader reader;

    public double getResultFromTable(int diceResult, int ip) {
        JSONArray resultsArray = reader.parseStringIntoJSONArray();
        double result = 0;
        for (int i = 0; i < resultsArray.length(); i++) {
            JSONObject resultArray = resultsArray.getJSONObject(i);
            if (diceResult >= resultArray.getInt("minLimit") && diceResult <= resultArray.getInt("maxLimit") && ip == resultArray.getInt("ipScore")) {
                result = resultArray.getDouble("score");
                break;
            }
        }
        return result;
    }

    public double getDmgScore(int dmg, int diceResult, int ip) {
        return ((getResultFromTable(diceResult, ip) / 100) * dmg);
    }

    public double getCounterAttackScore(int diceResult) {
        return Math.round(getResultFromTable(diceResult, 0));
    }

}
