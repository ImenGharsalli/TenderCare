package com.tendercare.dao.h2;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.tendercare.model.h2.User;

public interface IUserRepository extends CassandraRepository<User>{
		@Query("select count (*) from user")
		public int countUsers();
}
