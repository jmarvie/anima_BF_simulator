package com.anima_BF_simulator.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class IpScore implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_score;

    private String name;

    private String description;

    private int tr;

    private int con;

    private int per;

    private int cha;

    private int ele;

    private int fr;

    private int ene;

    @ManyToOne
    @JoinColumn(name="id_fighter", nullable=false)
    private Fighter fighter;

}
