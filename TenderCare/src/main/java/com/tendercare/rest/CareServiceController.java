package com.tendercare.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tendercare.dao.h2.ICareServiceRepository;
import com.tendercare.model.h2.CareService;

@RestController
public class CareServiceController {
	@Autowired
	private ICareServiceRepository careServiceRepository;

	@RequestMapping("/TestCareService")
	public String test() {
		return "test";
	}

	@RequestMapping("/saveCareService")
	public CareService save(CareService careService) {
		careServiceRepository.save(careService);
		return careService;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping("/allCareService")
	public List<com.tendercare.model.h2.CareService> getCareServices() {
		return careServiceRepository.findAll();
	}

	@RequestMapping("/countCareService")
	public int countCareServices() {
		return careServiceRepository.countCareServices();

	}

}
