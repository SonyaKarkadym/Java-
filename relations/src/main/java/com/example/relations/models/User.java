package com.example.relations.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"products","cars"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String img;

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
            @JoinColumn(name="user_id")
            @JsonIgnore
    List<Product> productList = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "user_cars",
            joinColumns = {@JoinColumn(name = "users_id")},
            inverseJoinColumns = {@JoinColumn(name = "cars_id")}
    )
    @JsonIgnore
    private List<Car> cars = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public User(String name,List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public User(String name,String img){
        this.name = name;
        this.img = img;
    }


}
