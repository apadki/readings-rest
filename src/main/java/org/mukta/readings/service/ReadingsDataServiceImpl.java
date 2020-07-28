package org.mukta.readings.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.mukta.readings.domain.ReadingData;
import org.mukta.readings.domain.Readings;
import org.springframework.stereotype.Service;

@Service

public class ReadingsDataServiceImpl implements ReadingDataService {

	public Readings getReadingData() {
		 
		Readings readings = new Readings();
		List <ReadingData> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			ReadingData readingData = new ReadingData(9.0, 120.0, 140.0, "Kenny Rogers", "1211", new Date());
			list.add(readingData);
		}
		readings.setData(list);
		return readings;
	}

}
