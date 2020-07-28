package org.mukta.readings.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ReadingData {
	
	double sugar;
	double bp;
	double cholesterol;
	String name;
	String id;
	Date date;
}
