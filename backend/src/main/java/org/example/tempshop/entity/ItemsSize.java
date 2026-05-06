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
public class ItemsSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_size_id;

    @Enumerated(EnumType.STRING)
    private ItemSize size;

    private BigDecimal price_per_size;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Items items;

    @OneToMany(mappedBy = "itemsSize")
    private List<OrderItems> orderItems;
}
