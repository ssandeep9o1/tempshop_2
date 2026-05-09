package org.example.tempshop.controller;

import jakarta.validation.Valid;
import org.example.tempshop.dto.adminDto.AddCategoryDto;
import org.example.tempshop.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
