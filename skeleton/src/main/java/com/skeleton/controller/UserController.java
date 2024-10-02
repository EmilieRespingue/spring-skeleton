package com.skeleton.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user/home")
	public String userHome() {
		return "Bienvenue, utilisateur !";
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin/home")
	public String adminHome() {
		return "Bienvenue, administrateur !";
	}
}
