package org.example.tempshop.service;

import jakarta.transaction.Transactional;
import org.example.tempshop.dtos.requestDto.AddCategoryDto;
import org.example.tempshop.dtos.responceDto.CategoryResponse;
import org.example.tempshop.entity.Category;
import org.example.tempshop.exceptions.CategoryNotFoundException;
import org.example.tempshop.exceptions.InvalidCategoryId;
import org.example.tempshop.mapper.CategoryMapper;
import org.example.tempshop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public List<CategoryResponse> fetchAllCategories() {
        List<Category> categoryList = categoryRepository.findAll();

        List<CategoryResponse> categoryResponses = new ArrayList<>();

        for(Category c : categoryList){
            categoryResponses.add(categoryMapper.mapFromCategory(c));
        }

         return categoryResponses;
    }

    @Override
    public CategoryResponse fetchCategoryById(Long id) {

        if(id < 1){
            throw new InvalidCategoryId("Invalid id given");
        }

        Category category = categoryRepository.findById(id).
                orElseThrow(() ->
                        new CategoryNotFoundException("No category present for the given id : " + id));


        return  categoryMapper.mapFromCategory(category);
    }

    @Override
    @Transactional
    public CategoryResponse updateCategoryById(Long id) {
        if(id < 1){
            throw new InvalidCategoryId("Invalid id given");
        }

        Category category = categoryRepository.findById(id).
                orElseThrow(() ->
                        new CategoryNotFoundException("No category present for the given id : " + id));





        return null;
    }

    @Override
    public String deleteCategoryById(Long id) {
        if(id < 1){
            throw new InvalidCategoryId("Invalid id given");
        }

        Category category = categoryRepository.findById(id).
                orElseThrow(() ->
                        new CategoryNotFoundException("No category present for the given id : " + id));

        categoryRepository.delete(category);

        return "Deleted successfully";
    }


}
