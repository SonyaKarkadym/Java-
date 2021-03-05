package com.example.demo.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Calculate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int a;
    private int b;
    private String action;
    private int result;

    public Calculate(int a,int b,String action,int result) {
        this.a = a;
        this.b = b;
        this.action = action;
        this.result = result;
    }
}

