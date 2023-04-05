package com.highfive.tuto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import java.math.BigInteger;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "price")
    private BigInteger price;

    @ManyToMany
    @JoinTable(
        name = "carEngine",
        joinColumns = @JoinColumn(name = "car"),
        inverseJoinColumns = @JoinColumn(name = "engine")
    )
    private Set<Engine> engines = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "carFeature",
        joinColumns = @JoinColumn(name = "car"),
        inverseJoinColumns = @JoinColumn(name = "feature")
    )
    private Set<Feature> features = new HashSet<>();


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="model")
    private Model model;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Sale> sales = new ArrayList<>();
    

}