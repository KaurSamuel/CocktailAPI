package com.Cocktail.CocktailAPI.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class APIService {

    public static List<String> getInformationAPI(int amount){

        List<String> APIs = new ArrayList<String>();
        for (int i = 0; i < amount; i++) {
            String API = "An API that gives information about " + getRandom("Information");
            if (new Random().nextInt(2) == 1) {
                API = API.concat(" based on "+ getRandom("Based"));
            }
            APIs.add(API);
        }
        return APIs;
    }

    public static List<String> getConvertAPI(int amount){

        List<String> APIs = new ArrayList<String>();
        for (int i = 0; i < amount; i++) {
            String API = "An API that converts " + getRandom("Converts") + " to " + getRandom("Converts");
            if (new Random().nextInt(2) == 1) {
                API = API.concat(" based on "+ getRandom("Based"));
            }
            APIs.add(API);
        }
        return APIs;
    }

    public static List<String> getCalculateAPI(int amount){
        List<String> APIs = new ArrayList<String>();
        for (int i = 0; i < amount; i++) {
            String API = "An API that calculates " + getRandom("Calculates");
            if (new Random().nextInt(2) == 1) {
                API = API.concat(" based on "+ getRandom("Based"));
            }
            APIs.add(API);
        }
        return APIs;
    }

    public static List<String> getRandomAPI(int amount){
        List<String> APIs = new ArrayList<String>();
        for (int i = 0; i < amount; i++) {
            APIs.add(getFullRandomAPI());
        }
        return APIs;
    }

    private static String getFullRandomAPI(){
        String [] types = {"Information","Converts","Calculates"};
        switch (types[new Random().nextInt(types.length)]){
            case "Information":
                return getInformationAPI(1).get(0);
            case "Converts":
                return getConvertAPI(1).get(0);
            case "Calculates":
                return getCalculateAPI(1).get(0);
        }
        return getInformationAPI(1).get(0);
    }

    public static String getRandom(String type){
        Object obj = new Object();
        try{
            obj = new JSONParser().parse(new FileReader("src/main/resources/Strings.json"));
        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray apiArray = (JSONArray) jsonObject.get(type);
        return apiArray.get(new Random().nextInt(apiArray.size())).toString();
    }
}
