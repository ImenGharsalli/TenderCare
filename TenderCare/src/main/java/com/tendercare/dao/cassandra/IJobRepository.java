package com.tendercare.dao.cassandra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tendercare.model.Job;

public interface IJobRepository extends JpaRepository<Job, Long> {

	@Query("select * from job where postdate <='?0' and postdate > '?1'")
	public Iterable<Job> findPostedTodayJobs(String less, String more);

	@Query("select * from job where expirationDate <='?0' and expirationDate > '?1'")
	public Iterable<Job> findExpireTodayJobs(String less, String more);

}
