package org.example.tempshop.service;

import jakarta.transaction.Transactional;
import org.example.tempshop.dtos.adminDto.AddCategoryDto;
import org.example.tempshop.entity.Category;
import org.example.tempshop.mapper.CategoryMapper;
import org.example.tempshop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryImplementation implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryImplementation(CategoryRepository categoryRepository, CategoryMapper categoryMapper){
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    @Transactional
    public String createCategory(AddCategoryDto addCategoryDto) {
        String normalized = addCategoryDto.getCategoryType().toLowerCase().trim();
        Optional<Category> existingCategory = categoryRepository.findByCategoryType(normalized);

        if(existingCategory.isPresent()){
            return "Category is already present";
        }

        addCategoryDto.setCategoryType(normalized);

        Category category = categoryMapper.mapToCategory(addCategoryDto);

        categoryRepository.save(category);

        return "Category added successfully";
    }

    
}
