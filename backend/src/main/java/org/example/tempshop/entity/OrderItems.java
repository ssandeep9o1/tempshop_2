package org.example.tempshop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_items_id;
    private int order_quantity;
    private double sub_total;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "item_size_id")
     private ItemsSize itemsSize;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Items items;
}
