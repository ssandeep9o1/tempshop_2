package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.tempshop.enums.ItemSize;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
public class ItemsSize extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemSizeId;

    @Enumerated(EnumType.STRING)
    private ItemSize size;

    private BigDecimal pricePerSize;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Items items;

    @OneToMany(mappedBy = "itemsSize")
    private List<OrderItems> orderItems;
}
