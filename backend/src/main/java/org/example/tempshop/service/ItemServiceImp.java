package org.example.tempshop.service;

import org.example.tempshop.dtos.requestDto.ItemRequest;
import org.example.tempshop.dtos.responceDto.ItemResponse;
import org.example.tempshop.entity.Items;
import org.example.tempshop.mapper.ItemsMapper;
import org.example.tempshop.repository.ItemsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImp implements ItemService{
    private final ItemsRepository itemsRepository;
    private final ItemsMapper itemsMapper;

    public ItemServiceImp(ItemsRepository itemsRepository, ItemsMapper itemsMapper){
        this.itemsRepository = itemsRepository;
        this.itemsMapper = itemsMapper;
    }


    @Override
    public String createItem(ItemRequest itemRequest) {



        return null;
    }
}
