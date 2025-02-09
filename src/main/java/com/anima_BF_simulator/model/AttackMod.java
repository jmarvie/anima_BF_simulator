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
public class AttackMod implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_mod;

    @Column(nullable=false, unique=true)
    private String name;

    private String description;

    @Column(nullable=false)
    private int attack_score;

    @Column(nullable=false)
    private int dmg_score;

    @ManyToOne
    @JoinColumn(name="id_fighter", nullable=false)
    private Fighter fighter;

}
