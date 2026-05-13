package org.example.tempshop.mapper;

import org.example.tempshop.dtos.requestDto.AddCategoryDto;
import org.example.tempshop.dtos.responceDto.CategoryResponse;
import org.example.tempshop.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category mapToCategory(AddCategoryDto addCategoryDto);

    CategoryResponse mapFromCategory(Category category);
}