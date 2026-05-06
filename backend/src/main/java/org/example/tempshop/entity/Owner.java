package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owner_id;//shop owner.
    private String name;
    private String contact;
    private String shopName;
    private String address;
    private String image;

    @OneToOne(mappedBy = "owner", cascade = CascadeType.ALL)
    private Qr qr;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Items> items;
}
