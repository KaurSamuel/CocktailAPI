package com.Cocktail.CocktailAPI.controller;

import com.Cocktail.CocktailAPI.model.Cocktail;
import com.Cocktail.CocktailAPI.service.CocktailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocktailController {
    public CocktailService cocktailService;

    @GetMapping("/getAPI/information")
    public String getInformationAPI(){
        return cocktailService.getInformationAPI();
    }

    @GetMapping("/getAPI/convert")
    public String getConvertAPI(){
        return cocktailService.getConvertAPI();
    }
}
