package com.example.mongodbtest.domain.recipe.service;

import com.example.mongodbtest.domain.recipe.entity.Recipe;
import com.example.mongodbtest.domain.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    // 모든 레시피 조회
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // ID로 레시피 조회
    public Optional<Recipe> getRecipeById(String recipeId) {
        return recipeRepository.findById(recipeId);
    }

    // 새로운 레시피 추가
    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    // 레시피 삭제
    public void deleteRecipe(String recipeId) {
        recipeRepository.deleteById(recipeId);
    }

}
