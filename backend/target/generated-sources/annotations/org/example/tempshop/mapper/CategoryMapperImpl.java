package org.example.tempshop.mapper;

import javax.annotation.processing.Generated;
import org.example.tempshop.dtos.adminDto.AddCategoryDto;
import org.example.tempshop.entity.Category;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T18:49:47+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
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
