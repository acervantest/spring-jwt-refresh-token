package com.act.springjwtrefreshtoken.service;

import java.util.List;

import com.act.springjwtrefreshtoken.model.AppRole;
import com.act.springjwtrefreshtoken.model.AppUser;

public interface UserService {

	AppUser saveUser(AppUser appUser);
	
	AppRole saveRole(AppRole appRole);
	
	void addRoleToUser(String username, String roleName);
	
	AppUser getUser(String username);
	
	List<AppUser> getUsers();
	
}
