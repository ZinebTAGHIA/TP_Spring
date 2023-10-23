package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findById(int id);

    @Query("select year(s.dateNaissance) as annee, count(s) as nbr from Student s group by year(s.dateNaissance) order by year(s.dateNaissance)")
    Collection<?> findNbrStudentByYear();
}
