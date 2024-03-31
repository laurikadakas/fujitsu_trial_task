package com.example.fujitsu_trial_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FujitsuTrialTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(FujitsuTrialTaskApplication.class, args);
	}

}
