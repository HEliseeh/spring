package com.highfive.tuto.domain;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="model")
@Getter
@Setter
@NoArgsConstructor

public class Model {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="brand")
    private Brand brand;

    @OneToMany(mappedBy = "model")
    private List<Car> cars = new ArrayList<>();
    public Model(String name) {
        this.name = name;
    }
}
