package com.anima_BF_simulator.repository;

import com.anima_BF_simulator.model.Fighter;
import com.anima_BF_simulator.model.Group;
import com.anima_BF_simulator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    List<Group> findAllByUser(User user);

}
