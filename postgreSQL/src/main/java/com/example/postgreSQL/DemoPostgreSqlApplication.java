package com.example.postgreSQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgreSQL.entity.Student;
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
	@GetMapping(value = "/content")
	public List<Student> getContent() {
		
		return res.findAll();
	}
	@PostMapping(value = "/content")
	public void vv(@RequestParam("name")String name) {
		res.save(new Student(name));
		
	}
}
