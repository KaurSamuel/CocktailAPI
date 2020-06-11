package com.Cocktail.CocktailAPI.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Ingredient {
    private final UUID id;
    private final String Name;

    public Ingredient(UUID id, String name) {
        this.id = id;
        Name = name;
    }
}
