package org.example.tempshop.mapper;

import org.example.tempshop.dtos.requestDto.AddItemDto;
import org.example.tempshop.entity.Items;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemsMapper {
    Items addItemsRequest(AddItemDto add);
}
