package com.highfive.tuto.domain;

import java.util.ArrayList;
import java.util.List;
import com.highfive.tuto.domain.enums.EngineType;

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
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private EngineType type;

    @ManyToMany
    @JoinTable(
        name = "carEngine",
        joinColumns = @JoinColumn(name = "engime"),
        inverseJoinColumns = @JoinColumn(name = "car")
    )
    private List<Car> cars = new ArrayList<>();
    
}
