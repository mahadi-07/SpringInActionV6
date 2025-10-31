package com.example.TacoCloud.repo;

import com.example.TacoCloud.pojo.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class IngredientRepositoryTest {

    @Autowired
    private IngredientRepository ingredientRepo;

    @Test
    void findAll() {
        var ingredients = ingredientRepo.findAll();
        ingredients.forEach(ingredient -> log.info(ingredient.getName()));

    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }
}