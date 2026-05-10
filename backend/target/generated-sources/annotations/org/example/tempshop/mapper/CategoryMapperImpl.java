package org.example.tempshop.mapper;

import javax.annotation.processing.Generated;
import org.example.tempshop.dto.adminDto.AddCategoryDto;
import org.example.tempshop.entity.Category;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-09T21:01:52+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Oracle Corporation)"
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
}
