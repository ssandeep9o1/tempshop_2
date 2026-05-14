package org.example.tempshop.mapper;

import javax.annotation.processing.Generated;
import org.example.tempshop.dtos.requestDto.AddItemDto;
import org.example.tempshop.entity.Items;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-14T12:59:06+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Oracle Corporation)"
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
