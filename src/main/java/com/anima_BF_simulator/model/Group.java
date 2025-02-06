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
@Table(name = "fighter_group")
public class Group {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

}
