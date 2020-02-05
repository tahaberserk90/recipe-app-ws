package com.springframework.recipeapp.service;

import java.util.Set;

import com.springframework.recipeapp.domain.Recipe;

public interface RecipeService {
	
	Set<Recipe> getRecipes();

}
