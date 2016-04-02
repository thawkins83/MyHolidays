package me.tjhawkins.holidays;

import java.time.LocalDate;

import me.tjhawkins.holidays.utils.ObservedUtils;

public class Holidays {
	
	private Holidays() {
		
	}
	
	public static LocalDate newYearsDay(int year) {
		return LocalDate.of(year, 1, 1);
	}
	
	public static LocalDate newYearsDayObserved(int year) {
		LocalDate newYearsDay = newYearsDay(year);
		switch(newYearsDay.getDayOfWeek()) {
			case MONDAY:
				return newYearsDay;
			case TUESDAY:
				return newYearsDay;
			case WEDNESDAY:
				return newYearsDay;
			case THURSDAY:
				return newYearsDay;
			case FRIDAY:
				return newYearsDay;
			case SATURDAY:
				return newYearsDay;
			default:
				return newYearsDay;
			case SUNDAY:
				return newYearsDay.plusDays(1);
		}
		
	}
	
	public static LocalDate martinLutherKingDay(int year) {
		return ObservedUtils.mondayObserved(LocalDate.of(year, 1, 15));
	}
	
	public static LocalDate presidentsDay(int year) {
		return ObservedUtils.mondayObserved(LocalDate.of(year, 2, 15));
	}
	
	public static LocalDate mothersDay(int year) {
		return ObservedUtils.sundayObserved(LocalDate.of(year, 5, 8));
	}
	
	public static LocalDate memorialDay(int year) {
		return ObservedUtils.mondayObserved(LocalDate.of(year, 5, 25));
	}
	
	public static LocalDate fathersDay(int year) {
		return ObservedUtils.sundayObserved(LocalDate.of(year, 6, 15));
	}
	
	public static LocalDate independenceDay(int year) {
		return LocalDate.of(year, 7, 4);
	}
	
	public static LocalDate independenceDayObserved(int year) {
		return ObservedUtils.weekendObserved(independenceDay(year));
	}
	
	public static LocalDate laborDay(int year) {
		return ObservedUtils.mondayObserved(LocalDate.of(year, 9, 1));
	}
	
	public static LocalDate columbusDay(int year) {
		return ObservedUtils.mondayObserved(LocalDate.of(year, 10, 8));
	}
	
	public static LocalDate veteransDay(int year) {
		return LocalDate.of(year, 11, 11);
	}
	
	public static LocalDate veteransDayObserved(int year) {
		return ObservedUtils.weekendObserved(veteransDay(year));
	}
	
	public static LocalDate thanksgiving(int year) {
		LocalDate ld = LocalDate.of(year, 11, 22);
		switch(ld.getDayOfWeek()) {
			case MONDAY:
				return ld.plusDays(3);
			case TUESDAY:
				return ld.plusDays(2);
			case WEDNESDAY:
				return ld.plusDays(1);
			case THURSDAY:
				return ld;
			case FRIDAY:
				return ld.plusDays(6);
			case SATURDAY:
				return ld.plusDays(5);
			case SUNDAY:
				return ld.plusDays(4);
			default:
				return ld;
		}
	}
	
	public static LocalDate thanksgivingFriday(int year) {
		return thanksgiving(year).plusDays(1);
	}
	
}
