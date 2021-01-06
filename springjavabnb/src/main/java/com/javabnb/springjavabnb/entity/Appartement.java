package com.javabnb.springjavabnb.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "APPARTEMENT_TBL")
public class Appartement {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String desc;
    private String lieu;
    private String residence;
    private String village;
    private String region;
    private String pays;
    private double price;

}
