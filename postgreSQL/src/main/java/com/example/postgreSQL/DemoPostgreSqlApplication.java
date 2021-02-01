package com.example.postgreSQL;

import com.example.postgreSQL.entity.Student;
import com.example.postgreSQL.reponsitory.StudentRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPostgreSqlApplication implements CommandLineRunner {

	@Autowired
	private StudentRes res;

	public static void main(String[] args) {
		SpringApplication.run(DemoPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = res.findById(1).get();
		student.setName("Ti");
		res.save(student);

//		res.save(new Student("Teo"));

	}
}
