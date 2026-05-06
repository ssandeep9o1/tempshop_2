package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.tempshop.enums.OrderStatus;

import java.util.List;

@Entity
@Getter
@Setter
public class Orders extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;
    private Long token;
    private double total;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItems> items;

}
