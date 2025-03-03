package com.anima_BF_simulator.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class AttackMod implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id_mod;

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
