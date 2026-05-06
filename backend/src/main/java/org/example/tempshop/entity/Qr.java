package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Qr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qr_id;
    private String qr_image;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
