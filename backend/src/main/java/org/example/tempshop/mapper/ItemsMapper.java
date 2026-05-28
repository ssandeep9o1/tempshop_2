package org.example.tempshop.mapper;


import org.example.tempshop.dtos.responceDto.ItemResponse;
import org.example.tempshop.entity.Items;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemsMapper {

    @Mapping(source = "owner.ownerId", target = "ownerId")
    @Mapping(source = "category.id", target = "categoryId")
    ItemResponse toResponse(Items item);

}
