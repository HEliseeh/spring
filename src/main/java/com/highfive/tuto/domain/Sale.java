package com.highfive.tuto.domain;

import java.math.BigInteger;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Sale")
@Getter
@Setter
@NoArgsConstructor

public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price")
    private BigInteger price;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "created")
    private String created;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="car")
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="customer")
    private Customer customer;

    public Sale(BigInteger price,
    String created_by,
    String created){
        this.price=price;
        this.created_by = created_by;
        this.created = created;
    }
}
