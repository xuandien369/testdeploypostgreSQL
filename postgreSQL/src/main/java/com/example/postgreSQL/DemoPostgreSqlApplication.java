package com.example.postgreSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgreSQL.reponsitory.StudentRes;

@SpringBootApplication
@RestController
public class DemoPostgreSqlApplication implements CommandLineRunner {

	@Autowired
	private StudentRes res;

	public static void main(String[] args) {
		SpringApplication.run(DemoPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student = res.findById(1).get();
//		student.setName("Luan");
//		res.save(student);
//		res.save(new Student("Teo"));
	}
	@GetMapping(value = "/test")
	public String getContent() {
		
		return res.findById(1).get().getName();
	}
}
