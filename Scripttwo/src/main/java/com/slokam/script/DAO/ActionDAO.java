package com.slokam.script.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.script.entity.Action;
@Repository
public interface ActionDAO extends JpaRepository<Action, Integer> {

}
