package com.anima_BF_simulator.repository;

import com.anima_BF_simulator.model.AttackMod;
import com.anima_BF_simulator.model.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttackModRepository extends JpaRepository<AttackMod, Long> {

    List<AttackMod> findAllByFighter(Fighter fighter);

}
