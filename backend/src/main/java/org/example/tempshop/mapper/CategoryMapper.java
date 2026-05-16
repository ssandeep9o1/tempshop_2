package org.example.tempshop.mapper;

import org.example.tempshop.dtos.requestDto.AddCategoryDto;
import org.example.tempshop.dtos.responceDto.CategoryResponse;
import org.example.tempshop.entity.Category;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category mapToCategory(AddCategoryDto addCategoryDto);

    CategoryResponse mapFromCategory(Category category);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCategoryFromResponse(AddCategoryDto addCategoryDto,@MappingTarget Category category);
}