package org.example.tempshop.dto.adminDto;

import lombok.Getter;
import lombok.Setter;
import org.example.tempshop.entity.Category;


@Getter
@Setter
public class AddItemDto {

    private String item_name;

    private double item_price;

    private Category category;

    private int stocks;

    private String image;
}
