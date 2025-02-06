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
@Table(name = "master")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_user;

    @Column(unique = true)
    private String login;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Fighter> fighters;

    @OneToMany(mappedBy = "user")
    private List<Group> groups;

}
