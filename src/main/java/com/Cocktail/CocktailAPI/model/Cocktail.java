package com.Cocktail.CocktailAPI.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Cocktail {
    private final UUID id;
    private final String name;
    private final Ingredient[] Ingredients;

    public Cocktail(UUID id, String name, Ingredient[] ingredients) {
        this.id = id;
        this.name = name;
        Ingredients = ingredients;
    }
}
