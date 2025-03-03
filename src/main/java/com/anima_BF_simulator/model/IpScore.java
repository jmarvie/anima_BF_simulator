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
public class IpScore implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id_score;

    @Column(nullable=false, unique=true)
    private String name;

    private String description;

    @Column(nullable=false)
    private int tr;

    @Column(nullable=false)
    private int con;

    @Column(nullable=false)
    private int per;

    @Column(nullable=false)
    private int cha;

    @Column(nullable=false)
    private int ele;

    @Column(nullable=false)
    private int fr;

    @Column(nullable=false)
    private int ene;

    @ManyToOne
    @JoinColumn(name="id_fighter", nullable=false)
    private Fighter fighter;

}
