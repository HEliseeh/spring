package com.highfive.tuto.domain;

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
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="brand")
    private Brand brand;

    public Model(String name) {
        this.name = name;
    }
}
