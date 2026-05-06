package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.tempshop.enums.PaymentStatus;

@Entity
@Getter
@Setter
public class Transactions extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaction_id;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payments payment;
}
