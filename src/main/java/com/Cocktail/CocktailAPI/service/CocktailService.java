package com.Cocktail.CocktailAPI.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class CocktailService {

    public static String getInformationAPI(){
        return "An API that gives information about " + getRandom("Information");
    }

    public static String getConvertAPI(){
        return "An API that converts " + getRandom("Converts") + " to " + getRandom("Converts");
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
        JSONArray Information = (JSONArray) jsonObject.get(type);
        return Information.get(new Random().nextInt(Information.size())).toString();
    }
}
