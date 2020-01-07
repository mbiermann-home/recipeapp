package com.fertilesound.recipeapp.repositories;

import com.fertilesound.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
