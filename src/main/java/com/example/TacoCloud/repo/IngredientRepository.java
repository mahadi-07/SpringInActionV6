package com.example.TacoCloud.repo;

import com.example.TacoCloud.pojo.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
