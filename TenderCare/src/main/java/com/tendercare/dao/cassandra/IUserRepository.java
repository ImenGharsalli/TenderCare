package com.tendercare.dao.cassandra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tendercare.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	
}
