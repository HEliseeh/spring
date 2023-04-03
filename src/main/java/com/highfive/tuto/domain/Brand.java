package com.highfive.tuto.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "model")
@Getter
@Setter
@NoArgsConstructor

public class Brand {
    
    @Id
    @GeneratedValue(strategy = GeneerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand", cascade = cascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private list<Model> models = new ArrayList<>();

    public Brand(string name) {this.name = name;}
}
