package me.tjhawkins.holidays.utils;

import java.math.BigDecimal;

public class HebrewUtils {
	
	public static final BigDecimal ROSH_HASHANA_MONDAY = new BigDecimal(23269.0/25920.0);
	public static final BigDecimal ROSH_HASHANA_TUESDAY = new BigDecimal(1367.0/2160.0);
	public static final int CHESHVAN_SHORT = 58;
	public static final int CHESHVAN_LONG = 59;
	public static final int KISLEV_TWENTY_FIFTH = 25;
	public static final int PASSOVER_BEFORE_ROSH_HASHANA = 163;
	public static final int YOM_KIPPUR_AFTER_ROSH_HASHANA = 9;

	public static int goldenNumber(int year) {
		return year % 19 + 1;
	}
	
	public static int leapYear(int year) {
		return (12*goldenNumber(year)) % 19;
	}
	
	public static BigDecimal calculateRoshHashanaDate(int year) {
		double const1 = 765433.0;
		double const2 = 492480.0;
		double const3 = 89081.0;
		double const4 = 98496.0;
		
		int k = year / 100;
		int q = k / 4;
		
		int a = k - q - 2;
		BigDecimal b = new BigDecimal(const1/const2);
		
		int rem1 = leapYear(year);
		double rem2 = (year%4) / 4.0;
		BigDecimal c = new BigDecimal(((313 * year) + const3) / const4);
		
		BigDecimal date = new BigDecimal(a)
				.add(b.multiply(new BigDecimal(rem1)))
				.add(new BigDecimal(rem2))
				.subtract(c);
		
		return date;
	}
	
}
