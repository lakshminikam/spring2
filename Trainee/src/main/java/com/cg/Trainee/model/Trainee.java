package com.cg.Trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Trainee")

public class Trainee {
	@Override
	public String toString() {
		return "Trainee[traineeId=" +traineeId+ ",traineeName=" +traineeName +",traineeDomain" +traineeDomain+ ",traineeLocation" +traineeLocation;
		
		
	}
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="trainee_id")
 private Integer traineeId;
 
  @Column(name = "trainee_name")
 private String traineeName;
  
  @Column(name = "trainee_Domain")
  private String traineeDomain;
   
  @Column(name = "trainee_Location")
  private String traineeLocation ;

public Integer getTraineeId() {
	return traineeId;
}

public void setTraineeId(Integer traineeId) {
	this.traineeId = traineeId;
}

public String getTraineeName() {
	return traineeName;
}

public void setTraineeName(String traineeName) {
	this.traineeName = traineeName;
}

public String getTraineDomain() {
	return traineeDomain;
}

public void setTraineDomain(String traineeDomain) {
	this.traineeDomain = traineeDomain;
}

public String getTraineeLocation() {
	return traineeLocation;
}

public void setTraineeLocation(String traineeLocation) {
	this.traineeLocation = traineeLocation;
}
   
}
