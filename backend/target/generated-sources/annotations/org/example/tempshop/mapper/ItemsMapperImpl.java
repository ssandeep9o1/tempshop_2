package org.example.tempshop.mapper;

import javax.annotation.processing.Generated;
import org.example.tempshop.dtos.adminDto.AddItemDto;
import org.example.tempshop.entity.Items;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T18:49:48+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ItemsMapperImpl implements ItemsMapper {

    @Override
    public Items addItemsRequest(AddItemDto add) {
        if ( add == null ) {
            return null;
        }

        Items items = new Items();

        items.setItemName( add.getItemName() );
        items.setStocks( add.getStocks() );

        return items;
    }
}
