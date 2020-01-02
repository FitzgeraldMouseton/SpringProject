package com.example.SpringProject.dao;


import com.example.SpringProject.repositories.IngredientRepository;
import com.example.SpringProject.repositories.JdbcIngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepo;;

    public IngredientConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String s) {
        return ingredientRepo.findOne(s);
    }
}
