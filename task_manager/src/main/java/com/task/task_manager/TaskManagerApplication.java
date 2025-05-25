package com.task.task_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class TaskManagerApplication {

	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(TaskManagerApplication.class);
        app.setAdditionalProfiles("prod");  // Force prod profile regardless of environment
        System.out.println("🌐 Render ENV - DB URL = " + System.getenv("SPRING_DATASOURCE_URL"));
        app.run(args);
	}

}
