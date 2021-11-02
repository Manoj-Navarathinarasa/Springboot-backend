package com.javaguides.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.demo.model.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe , Long> {

}
