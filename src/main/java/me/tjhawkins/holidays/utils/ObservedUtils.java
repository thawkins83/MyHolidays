package me.tjhawkins.holidays.utils;

import java.time.LocalDate;

public class ObservedUtils {

	public static LocalDate weekendObserved(LocalDate ld) {
		switch(ld.getDayOfWeek()) {
			case MONDAY:
				return ld;
			case TUESDAY:
				return ld;
			case WEDNESDAY:
				return ld;
			case THURSDAY:
				return ld;
			case FRIDAY:
				return ld;
			case SATURDAY:
				return ld.minusDays(1);
			case SUNDAY:
				return ld.plusDays(1);
			default:
				return ld;
		}
	}
	
	public static LocalDate mondayObserved(LocalDate ld) {
		switch(ld.getDayOfWeek()) {
			case MONDAY:
				return ld;
			case TUESDAY:
				return ld.plusDays(6);
			case WEDNESDAY:
				return ld.plusDays(5);
			case THURSDAY:
				return ld.plusDays(4);
			case FRIDAY:
				return ld.plusDays(3);
			case SATURDAY:
				return ld.plusDays(2);
			case SUNDAY:
				return ld.plusDays(1);
			default:
				return ld;
		}
	}
	
	public static LocalDate sundayObserved(LocalDate ld) {
		switch(ld.getDayOfWeek()) {
		case MONDAY:
			return ld.plusDays(6);
		case TUESDAY:
			return ld.plusDays(5);
		case WEDNESDAY:
			return ld.plusDays(4);
		case THURSDAY:
			return ld.plusDays(3);
		case FRIDAY:
			return ld.plusDays(2);
		case SATURDAY:
			return ld.plusDays(1);
		case SUNDAY:
			return ld;
		default:
			return ld;
		}
	}
}
