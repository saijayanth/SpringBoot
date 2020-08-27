package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.SalesAccount;



public interface SalesAccountRepo extends JpaRepository<SalesAccount, Integer>{
	
	List<SalesAccount> findByName(String name);
	List<SalesAccount> findBySidGreaterThan(int sid);
	
	@Query("from SalesAccount where name=?1 and organisation=?2")
	List<SalesAccount> findByNameAndOrganisation(String name, String organisation);
	
}
