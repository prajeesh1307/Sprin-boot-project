package com.project.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Shirt;

@Repository
public interface ShirtRepository extends JpaRepository<Shirt,Integer> {
	//positional parameter
	@Query("select s from Shirt s where s.color=?1 and s.brand=?2")
	public List<Shirt>getShirtByColor(String color,String brand);
	
	//named parameter
	@Query("select s from Shirt s where s.color=:color ")
	public List<Shirt>getShirtByColor(String color);
	
	//DML'
	@Modifying
	@Query("delete from Shirt s where s.color=?1")
	public int deleteShirtByColor(String color);
	@Modifying
    @Query("update Shirt s set s.color=?1 where s.brand=?2")
	public int updateShirtByColor(String color,String brand);
	List<Shirt> findByBrandStartingWith(String prefix);
	List<Shirt> findByBrandEndingWith(String suffix);
	List<Shirt> findByColor(String color);
}
