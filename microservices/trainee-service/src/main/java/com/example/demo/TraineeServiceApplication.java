package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.Trainee;
import com.example.demo.repo.TraineeRepository;

@SpringBootApplication
@EnableEurekaClient
public class TraineeServiceApplication implements CommandLineRunner {

	private TraineeRepository traineeRepository;

	@Autowired
	public TraineeServiceApplication(TraineeRepository traineeRepository) {
		this.traineeRepository = traineeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TraineeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		traineeRepository.save(new Trainee("Pooja"));
		traineeRepository.save(new Trainee("Indu"));
		traineeRepository.save(new Trainee("Sravs"));

	}

}