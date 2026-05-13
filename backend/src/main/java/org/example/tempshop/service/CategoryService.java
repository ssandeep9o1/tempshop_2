package org.example.tempshop.service;

import org.example.tempshop.dtos.adminDto.AddCategoryDto;

public interface CategoryService {
    public String createCategory(AddCategoryDto addCategoryDto);
}
