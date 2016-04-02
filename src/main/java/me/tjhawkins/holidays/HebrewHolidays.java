package me.tjhawkins.holidays;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import me.tjhawkins.holidays.utils.HebrewUtils;

public class HebrewHolidays {

	/**
	 * Formula for Rosh Hashana retreived from here:
	 * http://quasar.as.utexas.edu/BillInfo/ReligiousCalendars.html 
	 * @param year
	 * @return
	 */
	public static LocalDate roshHashana(int year) {
		BigDecimal date = HebrewUtils.calculateRoshHashanaDate(year);
		BigDecimal fraction = date.remainder(BigDecimal.ONE);
		int integerDate = date.intValue();
		int month = 9;
		if(integerDate > 30) {
			month++;
			integerDate -= 30;
		}
		
		LocalDate roshHashana = LocalDate.of(year, month, integerDate);
		switch(roshHashana.getDayOfWeek()) {
			case SUNDAY:
				return roshHashana.plusDays(1);
			case MONDAY:
				if(fraction.compareTo(HebrewUtils.ROSH_HASHANA_MONDAY) >= 0 
						&& HebrewUtils.leapYear(year) > 11) {
					return roshHashana.plusDays(1);
				}
				return roshHashana;
			case TUESDAY:
				if(fraction.compareTo(HebrewUtils.ROSH_HASHANA_TUESDAY) < 0 && HebrewUtils.leapYear(year) > 6) {
					return roshHashana.plusDays(2);
				}
				return roshHashana;
			case WEDNESDAY:
				return roshHashana.plusDays(1);
			case THURSDAY:
				return roshHashana;
			case FRIDAY:
				return roshHashana.plusDays(1);
			case SATURDAY:
				return roshHashana;
			default:
				return roshHashana;
		}
	}
	
	public static LocalDate roshHashana() {
		return roshHashana(LocalDate.now().getYear());
	}
	
	public static LocalDate yomKippur(int year) {
		return roshHashana(year).plusDays(HebrewUtils.YOM_KIPPUR_AFTER_ROSH_HASHANA);
	}
	
	public static LocalDate yomKippur() {
		return yomKippur(LocalDate.now().getYear());
	}
	
	public static LocalDate chanukah(int year) {
		LocalDate currentRoshHashana = roshHashana(year);
		LocalDate nextRoshHashana = roshHashana(year+1);
		
		switch((int)ChronoUnit.DAYS.between(currentRoshHashana, nextRoshHashana)) {
			//353, 354, 383 or 384
			case 353:
			case 354:
			case 383:
			case 384:
				return currentRoshHashana.plusDays(HebrewUtils.CHESHVAN_SHORT 
						+ HebrewUtils.KISLEV_TWENTY_FIFTH);
			//355 or 385
			case 355:
			case 385:
				return currentRoshHashana.plusDays(HebrewUtils.CHESHVAN_LONG 
						+ HebrewUtils.KISLEV_TWENTY_FIFTH);
		}
		return null;
	}
	
	public static LocalDate chanukah() {
		return chanukah(LocalDate.now().getYear());
	}
	
	public static LocalDate hanukkah(int year) {
		return chanukah(year);
	}
	
	public static LocalDate hanukkah() {
		return hanukkah(LocalDate.now().getYear());
	}
	
	public static LocalDate passover(int year) {
		return roshHashana(year).minusDays(HebrewUtils.PASSOVER_BEFORE_ROSH_HASHANA);
	}
	
	public static LocalDate passover() {
		return passover(LocalDate.now().getYear());
	}
	
}
