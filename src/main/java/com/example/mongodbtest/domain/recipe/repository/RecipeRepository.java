package com.example.mongodbtest.domain.recipe.repository;

import com.example.mongodbtest.domain.recipe.entity.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
