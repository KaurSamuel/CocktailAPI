package com.Cocktail.CocktailAPI.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Cocktail {
    private final UUID id;
    private final String name;

    public Cocktail(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
}
