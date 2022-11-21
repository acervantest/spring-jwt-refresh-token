package com.act.springjwtrefreshtoken.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.act.springjwtrefreshtoken.model.AppRole;

public interface RoleRepo extends JpaRepository<AppRole, Long> {

	AppRole findByName(String name);
}
