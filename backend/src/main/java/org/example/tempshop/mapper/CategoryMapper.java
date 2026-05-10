package org.example.tempshop.mapper;

import org.example.tempshop.dto.adminDto.AddCategoryDto;
import org.example.tempshop.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category mapToCategory(AddCategoryDto addCategoryDto);
}