package org.example.tempshop.controller;

import jakarta.validation.Valid;
import org.example.tempshop.dtos.requestDto.AddCategoryDto;
import org.example.tempshop.dtos.responceDto.CategoryResponse;
import org.example.tempshop.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<String> addCategory(@Valid @RequestBody AddCategoryDto addCategoryDto){
        String response = categoryService.createCategory(addCategoryDto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/allCategories")
    public ResponseEntity<List<CategoryResponse>> allCategory(){
        List<CategoryResponse> categoryResponses = categoryService.fetchAllCategories();
        return ResponseEntity.ok(categoryResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id){
        CategoryResponse response = categoryService.fetchCategoryById(id);
        return ResponseEntity.ok(response);
    }

}
