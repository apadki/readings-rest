package org.mukta.readings.controller;

import java.util.Date;

import org.mukta.readings.domain.Readings;
import org.mukta.readings.service.ReadingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
 
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
@Slf4j
@CrossOrigin

public class ReadingsController {
	
	private final ReadingDataService readingDataService;
	
	@GetMapping(value="/readings/all")	
	public Readings getAllReadings() {
		 log.info("Request Received at " , new Date());
		 return readingDataService.getReadingData();
	}
	
}
