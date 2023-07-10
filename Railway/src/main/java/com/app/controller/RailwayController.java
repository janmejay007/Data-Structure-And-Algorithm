package com.app.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailwayDTO;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.services.RailwayService;

@RestController
@RequestMapping("railways")
public class RailwayController {
	
	@Autowired
	private RailwayService serv;
	
	public RailwayController() {
		System.out.println("inside "+getClass());
	}

	@RequestMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(serv.getAllRails());
	}
	
	@PostMapping
	public ResponseEntity<?> addRail(@RequestBody @Valid RailwayDTO rt){
				return new ResponseEntity<>(serv.addNewRail(rt),HttpStatus.CREATED);
	}
	
	@GetMapping("/{name}")
	public List<Railway> getRailByName(@PathVariable Category name){
		
		return serv.getRailByCategory(name);
	}
	

}
