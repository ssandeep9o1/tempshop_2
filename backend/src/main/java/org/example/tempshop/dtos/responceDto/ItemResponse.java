package org.example.tempshop.dtos.responceDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemResponse {

    private String itemName;

    private int stocks;

    private Long ownerId;

    private Long categoryId;
}
