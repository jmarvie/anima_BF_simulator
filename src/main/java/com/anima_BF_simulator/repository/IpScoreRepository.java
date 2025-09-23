package com.anima_BF_simulator.repository;

import com.anima_BF_simulator.model.Fighter;
import com.anima_BF_simulator.model.IpScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IpScoreRepository extends JpaRepository<IpScore, Long> {

    List<IpScore> findAllByFighter(Fighter fighter);

}
