package com.project.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Integer>{

	List<UserDetails> findAll();

}
