package com.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.model.AdminModel;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel,String>{

}
