package com.highfive.tuto.domain;

import jakarta.persistence.*;
// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="model")
@Getter
@Setter
@NoArgsConstructor

public class Brand {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Model> models = new ArrayList<>();

    public Brand(String name, long id) {this.name = name;}
}
