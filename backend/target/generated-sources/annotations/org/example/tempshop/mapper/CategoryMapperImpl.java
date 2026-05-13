package org.example.tempshop.mapper;

import javax.annotation.processing.Generated;
import org.example.tempshop.dtos.requestDto.AddCategoryDto;
import org.example.tempshop.dtos.responceDto.CategoryResponse;
import org.example.tempshop.entity.Category;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T19:41:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category mapToCategory(AddCategoryDto addCategoryDto) {
        if ( addCategoryDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryType( addCategoryDto.getCategoryType() );

        return category;
    }

    @Override
    public CategoryResponse mapFromCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse categoryResponse = new CategoryResponse();

        categoryResponse.setId(category.getId());
        categoryResponse.setCategoryType( category.getCategoryType() );
        categoryResponse.setCreatedAt( category.getCreatedAt() );
        categoryResponse.setUpdateAt( category.getUpdateAt() );

        return categoryResponse;
    }
}
