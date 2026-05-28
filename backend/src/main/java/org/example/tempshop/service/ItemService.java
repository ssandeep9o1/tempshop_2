package org.example.tempshop.service;

import org.example.tempshop.dtos.requestDto.ItemRequest;
import org.example.tempshop.dtos.responceDto.ItemResponse;

public interface ItemService {
    public String createItem(ItemRequest itemRequest);
}
