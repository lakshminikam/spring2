package com.cg.Trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.Trainee.model.Trainee;

@Repository
public interface TraineeJpaDao extends JpaRepository<Trainee,Integer>{
 
@Query("select t from Trainee t where t.traineeName=:traineeName")	
Trainee findByName(String traineeName);
	
}


