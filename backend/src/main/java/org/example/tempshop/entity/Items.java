package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.tempshop.enums.ItemStatus;

import java.util.List;

@Getter
@Setter
@Entity
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_id;

    private String item_name;
    private int stocks;

    @Enumerated(EnumType.STRING)
    private ItemStatus availability;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "items")
    private List<ItemsSize> sizes;
}
