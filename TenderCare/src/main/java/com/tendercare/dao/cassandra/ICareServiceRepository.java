package com.tendercare.dao.cassandra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tendercare.model.h2.CareService;

public interface ICareServiceRepository extends JpaRepository<CareService, Long> {
}
