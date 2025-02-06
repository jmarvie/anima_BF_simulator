package com.anima_BF_simulator.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Fighter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    private String description;

    private int hpTotal;

    private boolean isAPlayer;

    private boolean isAlive;

    @Transient
    private int initScore;

}
