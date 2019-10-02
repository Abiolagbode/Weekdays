package com.etz.weekdays.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.etz.weekdays.model.User;
import com.etz.weekdays.repository.UserRepository;


@RestController
public class MainController {
	

	@Autowired
	UserRepository UserRepository;
	
	@GetMapping("/home")
	public ResponseEntity<?> home(){
		
		return new ResponseEntity<String>
		("This is a demo string response.", HttpStatus.OK);
	}
	
	//post done
	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		UserRepository.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<?>save(){
		List <User> users = (List) UserRepository.findAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?>saveOne(@PathVariable String id){
		List <User> userss = (List) UserRepository.findAll();
		return new ResponseEntity<List<User>>(userss, HttpStatus.OK);
		
	}
	
	

}
