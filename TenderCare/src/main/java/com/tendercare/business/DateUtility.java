package com.tendercare.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtility {

	public static void main(String[] args) {
		System.out.println(dateTimeNow());
	}

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss+SSSS");
	public static LocalDate dateToday = LocalDate.now(ZoneId.of("Europe/Berlin"));

	public static String dateTimeNow() {
		LocalTime timeNow = LocalTime.now();
		return LocalDateTime.of(dateToday, timeNow).format(formatter);

	}

	private static LocalDateTime midnightTodayLDT() {
		LocalTime midnight = LocalTime.MIDNIGHT;
		return LocalDateTime.of(dateToday, midnight);
	}

	public static String midnightToday() {
		return midnightTodayLDT().format(formatter);
	}

	public static String midnightYesterday() {
		LocalDateTime yesterdayMidnight = midnightTodayLDT().minusDays(1);
		return yesterdayMidnight.format(formatter);

	}
}
