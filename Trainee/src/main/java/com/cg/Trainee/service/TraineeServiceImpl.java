package com.cg.Trainee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Trainee.dao.TraineeJpaDao;
import com.cg.Trainee.model.Trainee;
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
@Autowired
private TraineeJpaDao traineeJpaDao;

	@Override
	public List<Trainee> ListAllTrainee() {
	
		return traineeJpaDao.findAll();
	}

	@Override
	public Trainee findTraineeById(Integer traineeId) {
			return traineeJpaDao.findById(traineeId).get();
	}

	@Override
	public Trainee findTraineeByName(String traineeName) {
		
		return traineeJpaDao.findByName(traineeName);
	}

	@Override
	public Trainee updateNameById(Integer traineeId, String traineeName) {
		Trainee trainee= traineeJpaDao.findById(traineeId).get();
		trainee.setTraineeName(traineeName);
		return traineeJpaDao.save(trainee);
	}

	@Override
	public boolean deleteTraineeById(Integer traineeId) {
		traineeJpaDao.deleteById(traineeId);
		Trainee trainee=traineeJpaDao.findById(traineeId).get();
		if(trainee!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Trainee InsertTrainee(Trainee trainee) {
			return traineeJpaDao.save(trainee);
	}

}
