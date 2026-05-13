package org.example.tempshop.service;

import org.example.tempshop.dtos.requestDto.AddCategoryDto;
import org.example.tempshop.dtos.responceDto.CategoryResponse;

import java.util.List;

public interface CategoryService {
    public String createCategory(AddCategoryDto addCategoryDto);
    public List<CategoryResponse> fetchAllCategories();
    public CategoryResponse fetchCategoryById(Long id);
}
