package com.example.postgreSQL.reponsitory;

import com.example.postgreSQL.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRes extends JpaRepository<Student,Integer> {
}
