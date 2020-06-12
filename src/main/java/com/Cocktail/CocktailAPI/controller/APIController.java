package com.Cocktail.CocktailAPI.controller;

import com.Cocktail.CocktailAPI.service.APIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIController {

    @GetMapping("/getAPI/information/{amount}")
    public List<String> getInformationAPI(@PathVariable int amount){
        return APIService.getInformationAPI(amount);
    }

    @GetMapping("/getAPI/convert/{amount}")
    public List<String> getConvertAPI(@PathVariable int amount){
        return APIService.getConvertAPI(amount);
    }

    @GetMapping("/getAPI/calculate/{amount}")
    public List<String> getCalculateAPI(@PathVariable int amount){
        return APIService.getCalculateAPI(amount);
    }

    @GetMapping("/getAPI")
    public List<String> getRandomAPI(){
        return APIService.getRandomAPI(1);
    }

    @GetMapping("/getAPI/{amount}")
    public List<String> getRandomAPI(@PathVariable int amount){
        return APIService.getRandomAPI(amount);
    }
}
