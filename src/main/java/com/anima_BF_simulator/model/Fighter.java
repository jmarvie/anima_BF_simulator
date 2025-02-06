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
public class Fighter implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_fighter;

    private String name;

    private String description;

    private int hp_total;

    private boolean is_player;

    private boolean is_alive;

    private int init_score;

    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User user;

    @OneToMany(mappedBy = "fighter")
    private List<AttackMod> mods;

    @OneToMany(mappedBy = "fighter")
    private List<IpScore> ip_scores;

    @ManyToMany
    @JoinTable(
            name = "fighter_groups",
            joinColumns = @JoinColumn(name = "id_fighter"),
            inverseJoinColumns = @JoinColumn(name = "id_group"))
    private List<Group> groups;

}
