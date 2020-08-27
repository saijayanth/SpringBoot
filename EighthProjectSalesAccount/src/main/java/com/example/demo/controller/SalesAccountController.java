package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.SalesAccountRepo;
import com.example.demo.model.SalesAccount;


@RestController
public class SalesAccountController {

	@Autowired
	SalesAccountRepo repo;
	
	@GetMapping("/salesaccount")
	public List<SalesAccount> getAllSalesAccounts(){
		return repo.findAll();
	}
	
	@GetMapping("/salesaccount/{sid}")
	public Optional<SalesAccount> getSalesAccountById(@PathVariable("sid") int sid) {
		return repo.findById(sid);
	}
	
	@PostMapping("/salesaccount")
	public SalesAccount createOrUpdateSalesAccount(@RequestBody SalesAccount salesaccount) {
		return repo.save(salesaccount);
	}
	
	@DeleteMapping("/salesaccount/{sid}")
	public String deleteSalesAccount(@PathVariable("sid") int sid) {
		repo.deleteById(sid);
		return "SalesAccount with Id:"+ sid +" deleted successfully";
	}
	
	@GetMapping("/salesaccountby/{name}")
	public List<SalesAccount> getSalesAccountByName(@PathVariable("name") String name){
		return repo.findByName(name);
	}
	
	//JPQL custom query for method
	@GetMapping("/salesaccountby/{name}/{organisation}")
	public List<SalesAccount> getByNameAndOrganisation(@PathVariable("name") String name, @PathVariable("organisation") String org){
		return repo.findByNameAndOrganisation(name, org);
	}
	
	//JPQL custom query for method
	@GetMapping("/salesaccountgreaterby/{sid}")
	public List<SalesAccount> getSalesAccountsGreateThanSid(@PathVariable("sid") int sid){
		return repo.findBySidGreaterThan(sid);
	}
}
