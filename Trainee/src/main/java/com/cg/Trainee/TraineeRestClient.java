package com.cg.Trainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.Trainee.model.Trainee;

@RestController

public class TraineeRestClient {
		

		   @Autowired
		   RestTemplate restTemplate;


		public void getTraineeDetails() {
			
		final String uri = "http://localhost:8085/Trainee/ListTraineeById";
	    RestTemplate restTemplate = new RestTemplate();
	    
	    
	    HttpHeaders headers = new HttpHeaders();
	   HttpEntity <String> entity = new HttpEntity<String>(headers);
	    
	     ResponseEntity<Trainee> response = restTemplate.getForEntity(uri, Trainee.class);
	   System.out.println(response.getBody().toString());


}
		public static void main(String[] args) {
			TraineeRestClient client=new TraineeRestClient();
			client.getTraineeDetails();
		}
}