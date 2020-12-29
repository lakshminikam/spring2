package com.cg.Trainee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.Trainee.model.Trainee;


@Service
@Transactional
public interface TraineeService {

    List<Trainee> ListAllTrainee();
    Trainee findTraineeById(Integer traineeId);
    Trainee findTraineeByName(String traineeName);
    Trainee updateNameById(Integer traineeId,String traineeName);
    boolean deleteTraineeById(Integer traineeId);
   Trainee  InsertTrainee(Trainee trainee);

}
