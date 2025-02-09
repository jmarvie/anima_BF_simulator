package com.anima_BF_simulator.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "fighter_group")
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_group;

    @Column(nullable=false, unique=true)
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User user;

    @ManyToMany(mappedBy = "groups")
    private List<Fighter> fighters;

}
