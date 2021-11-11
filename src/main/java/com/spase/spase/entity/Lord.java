package com.spase.spase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Proxy;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Proxy(lazy = false)
@ToString
public class Lord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int age;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "lord_id")
    private List<Planet> planets = new ArrayList<>();
}
