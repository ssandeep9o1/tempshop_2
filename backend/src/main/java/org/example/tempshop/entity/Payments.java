package org.example.tempshop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payments extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    private String payment_type;
}
