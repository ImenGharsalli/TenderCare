package com.tendercare.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tendercare.business.DateUtility;
import com.tendercare.dao.h2.IJobRepository;
import com.tendercare.model.h2.Job;

@RestController
public class JobController {
	private String midnightToday = DateUtility.midnightToday();
	private String midnightyesterday = DateUtility.midnightYesterday();
	@Autowired
	private IJobRepository jobRepository;

	@RequestMapping("/saveJob")
	public Job save(Job job) {
		jobRepository.save(job);
		return job;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping("/allJobs")
	public Iterable<Job> getJobs() {
		return jobRepository.findAll();
	}

	@RequestMapping("/countJobs")
	public int countJobs() {
		return jobRepository.countJobs();
	}

	@RequestMapping("/expireTodayJobs")
	public Iterable<Job> getexpireTodayJobs() {
		return jobRepository.findExpireTodayJobs(midnightToday, midnightyesterday);
	}

	@RequestMapping("/postedTodayJobs")
	public Iterable<Job> getPostedTodayJobs() {
		return jobRepository.findPostedTodayJobs(midnightToday, midnightyesterday);
	}
}
