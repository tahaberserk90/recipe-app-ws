package com.springframework.recipeapp.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.springframework.recipeapp.domain.Recipe;
import com.springframework.recipeapp.repositories.RecipeRepository;

public class RecipeServiceImplTest {
	
	RecipeServiceImpl recipeServiceImpl;
	
	@Mock
	RecipeRepository recipeRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeServiceImpl=new RecipeServiceImpl(recipeRepository);
	}

	@Test
	public void testGetRecipes() {
		Recipe recipe=new Recipe();
		HashSet<Recipe> recipeData=new HashSet<>();
		recipeData.add(recipe);
		
		when(recipeRepository.findAll()).thenReturn(recipeData);
		
		Set<Recipe> recipes=recipeServiceImpl.getRecipes();
		assertEquals(recipes.size(), 1);
		verify(recipeRepository,times(1)).findAll();
	}

}
