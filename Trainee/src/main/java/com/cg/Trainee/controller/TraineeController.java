package com.cg.Trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Trainee.model.Trainee;
import com.cg.Trainee.service.TraineeService;

@RestController
@RequestMapping("/Trainee")
public class TraineeController {

@Autowired
private TraineeService traineeService;

@GetMapping("/ListAllTrainee")
public List<Trainee> ListAllTrainee(){
	return (List<Trainee>) traineeService.ListAllTrainee();
}

@GetMapping("/ListTraineeById/{traineeId}")
public List<Trainee> ListTraineeById(@PathVariable Integer traineeId){
	return (List<Trainee>) traineeService.findTraineeById(traineeId);
}
@GetMapping("/ListTraineeByName/{traineeName}")
	public List<Trainee> ListTraineeByName(@PathVariable String traineeName){
	return (List<Trainee>) traineeService.findTraineeByName(traineeName);
	
}
@PutMapping("/updateNamebyId/{name:.+}/trainee/{traineeId}")
public Trainee updateNameById(@PathVariable String  traineeName, @PathVariable Integer traineeId){
    return traineeService.updateNameById(traineeId, traineeName);
}

@PostMapping("/insertTrainee")
public Trainee insertTrainee(@RequestBody Trainee trainee){
    return traineeService.InsertTrainee(trainee);
}

@DeleteMapping("/deleteTraineeById/trainee/{traineeId}")
public boolean deleteTraineeById(@PathVariable Integer traineeId){
	return traineeService.deleteTraineeById(traineeId);
	
}





}






