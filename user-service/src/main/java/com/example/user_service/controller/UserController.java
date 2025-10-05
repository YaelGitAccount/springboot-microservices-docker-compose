
	package com.example.user_service.controller;

	import org.springframework.http.HttpStatus;
	import org.springframework.web.bind.annotation.*;
	import org.springframework.web.server.ResponseStatusException;

	import java.util.Map;

	@RestController
	@RequestMapping("/users")
	public class UserController {

	    private static final Map<Integer, String> users = Map.of(
	        1, "Dana",
	        2, "David",
	        3, "Noa"
	    );

	    @GetMapping("/{id}")
	    public Map<String, Object> getUser(@PathVariable int id) {
	        String name = users.get(id);
	        if (name == null) {
	            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
	        }
	        return Map.of("id", id, "name", name);
	    }
	}


