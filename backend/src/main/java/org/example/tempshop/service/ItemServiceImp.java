package org.example.tempshop.service;

import org.example.tempshop.repository.ItemsRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImp implements ItemService{
    private final ItemsRepository itemsRepository;

    public ItemServiceImp(ItemsRepository itemsRepository){
        this.itemsRepository = itemsRepository;
    }


}
