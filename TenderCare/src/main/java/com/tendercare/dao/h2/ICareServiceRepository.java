package com.tendercare.dao.h2;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tendercare.model.h2.CareService;

public interface ICareServiceRepository extends JpaRepository<CareService, Long>{
	@Query("select count (*) from careservice")
	public int countCareServices();
}
