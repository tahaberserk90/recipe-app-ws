package com.springframework.recipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.recipeapp.domain.Category;
import com.springframework.recipeapp.domain.UnitOfMeasure;
import com.springframework.recipeapp.repositories.CategoryRepository;
import com.springframework.recipeapp.repositories.UnitOfMeasureRepository;
import com.springframework.recipeapp.service.RecipeService;

@Controller
public class IndexController {
	
	private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }


	/*
	 * @RequestMapping({"/index","/",""}) public String getIndexPage() {
	 * 
	 * Optional<Category> category=categoryRepository.findByDescription("American");
	 * Optional<UnitOfMeasure>
	 * unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Tablespoon")
	 * ;
	 * 
	 * System.out.println("cat id ="+category.get().getId());
	 * System.out.println("unit id ="+unitOfMeasureOptional.get().getId());
	 * 
	 * return "index"; }
	 */

}
