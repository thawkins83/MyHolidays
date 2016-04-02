package me.tjhawkins.holidays;

import java.time.LocalDate;

import me.tjhawkins.holidays.utils.ChristianUtils;
import me.tjhawkins.holidays.utils.ObservedUtils;

public class ChristianHolidays {

	public static LocalDate ashWednesday(int year) {
		return easterSunday(year).minusDays(ChristianUtils.ASH_WEDNESDAY_BEFORE_EASTER);
	}
	
	public static LocalDate palmSunday(int year) {
		return easterSunday(year).minusDays(7);
	}
	
	public static LocalDate goodFriday(int year) {
		return easterSunday(year).minusDays(2);
	}
	
	/**
	 * Formula for calculating Easter Sunday was retrieved from here:
	 * http://mathforum.org/library/drmath/view/52575.html
	 * @param year
	 * @return
	 */
	public static LocalDate easterSunday(int year) {
		ChristianUtils.calculateEasterDayAndMonth(year);
		return LocalDate.of(year, ChristianUtils.EASTER_MONTH, ChristianUtils.EASTER_DAY);
	}
	
	public static LocalDate easterMonday(int year) {
		return easterSunday(year).plusDays(1);
	}
	
	public static LocalDate christmasEve(int year) {
		return LocalDate.of(year, 12, 24);
	}
	
	public static LocalDate christmasEveObserved(int year) {
		return ObservedUtils.weekendObserved(christmasEve(year));
	}
	
	public static LocalDate christmasDay(int year) {
		return LocalDate.of(year, 12, 25);
	}
	
	public static LocalDate christmasDayObserved(int year) {
		return ObservedUtils.weekendObserved(christmasDay(year));
	}
	
}
