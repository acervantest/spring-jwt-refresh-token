package com.act.springjwtrefreshtoken.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.act.springjwtrefreshtoken.model.AppUser;

public interface UserRepo extends JpaRepository<AppUser, Long> {
	
	AppUser findByUsername(String username);
	
}
