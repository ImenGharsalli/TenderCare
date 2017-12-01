package com.tendercare.dao.h2;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.tendercare.model.h2.Job;

public interface IJobRepository extends CassandraRepository<Job> {
	@Query("select count (*) from job")
	public int countJobs();

	@Query("select * from job where postdate <='?0' and postdate > '?1'")
	public Iterable<Job> findPostedTodayJobs(String less, String more);

	@Query("select * from job where expirationDate <='?0' and expirationDate > '?1'")
	public Iterable<Job> findExpireTodayJobs(String less, String more);

}
