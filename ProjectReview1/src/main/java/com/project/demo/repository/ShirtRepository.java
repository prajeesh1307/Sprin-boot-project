package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Shirt;

@Repository
public interface ShirtRepository extends JpaRepository<Shirt,Integer> {

}
