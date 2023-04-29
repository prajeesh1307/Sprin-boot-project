package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Login;

@Repository
public interface Loginrepository extends JpaRepository<Login,Integer>{

	Login findByUsername(String username);
}
