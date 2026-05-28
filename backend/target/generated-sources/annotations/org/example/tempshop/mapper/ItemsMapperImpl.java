package org.example.tempshop.mapper;

import javax.annotation.processing.Generated;
import org.example.tempshop.dtos.responceDto.ItemResponse;
import org.example.tempshop.entity.Category;
import org.example.tempshop.entity.Items;
import org.example.tempshop.entity.Owner;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-18T15:48:25+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class ItemsMapperImpl implements ItemsMapper {

    @Override
    public ItemResponse toResponse(Items item) {
        if ( item == null ) {
            return null;
        }

        ItemResponse itemResponse = new ItemResponse();

        itemResponse.setOwnerId( itemOwnerOwnerId( item ) );
        itemResponse.setCategoryId( itemCategoryId( item ) );
        itemResponse.setItemName( item.getItemName() );
        itemResponse.setStocks( item.getStocks() );

        return itemResponse;
    }

    private Long itemOwnerOwnerId(Items items) {
        if ( items == null ) {
            return null;
        }
        Owner owner = items.getOwner();
        if ( owner == null ) {
            return null;
        }
        Long ownerId = owner.getOwnerId();
        if ( ownerId == null ) {
            return null;
        }
        return ownerId;
    }

    private Long itemCategoryId(Items items) {
        if ( items == null ) {
            return null;
        }
        Category category = items.getCategory();
        if ( category == null ) {
            return null;
        }
        Long id = category.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
