package com.fertilesound.recipeapp.services;

import com.fertilesound.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
