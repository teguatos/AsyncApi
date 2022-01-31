package com.app.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.EmployeeDTO;
import com.app.model.Employee;
import com.app.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	@Autowired
	ModelMapper modelMapper;

	@GetMapping("")
	public CompletableFuture<ResponseEntity<List<Employee>>> getAll() {
		return service.findAll().thenApply(ResponseEntity::ok);
	}

	@GetMapping("{id}")
	public CompletableFuture<ResponseEntity<Employee>> getOne(@PathVariable("id") Long id) {
		return service.findById(id).thenApply(ResponseEntity::ok);
	}

	@PostMapping
	public CompletableFuture<ResponseEntity<Employee>> save(@RequestBody EmployeeDTO usr) {
		return service.save(modelMapper.map(usr, Employee.class)).thenApply(ResponseEntity::ok);
	}

	@DeleteMapping("{id}")
	public CompletableFuture<ResponseEntity<Boolean>> delete(@PathVariable("id") Long id) {
		return service.delete(id).thenApply(ResponseEntity::ok);
	}

	@PutMapping("{id}")
	public CompletableFuture<ResponseEntity<Employee>> update(@PathVariable("id") Long id,
			@RequestBody EmployeeDTO usr) {
		return service.update(id, modelMapper.map(usr, Employee.class)).thenApply(ResponseEntity::ok);

	}

}
