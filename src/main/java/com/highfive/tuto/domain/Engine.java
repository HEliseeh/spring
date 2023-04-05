package com.highfive.tuto.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "engine")
@Getter
@Setter
@NoArgsConstructor


public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name = "type")
    private String type;

    @ManyToMany
    @JoinTable(
        name = "carEngine",
        joinColumns = @JoinColumn(name = "engime"),
        inverseJoinColumns = @JoinColumn(name = "car")
    )
    private List<Car> cars = new ArrayList<>();
    
}
