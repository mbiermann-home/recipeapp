package com.fertilesound.recipeapp.repositories;

import com.fertilesound.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
