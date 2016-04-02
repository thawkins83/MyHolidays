package me.tjhawkins.holidays.utils;

public class ChristianUtils {

	
	public final static int ASH_WEDNESDAY_BEFORE_EASTER = 46;
	public static int EASTER_DAY = 0;
	public static int EASTER_MONTH = 0;
	
	public static void calculateEasterDayAndMonth(int year) {
		int k = year / 100;
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		
		int q = k / 4;
		int p = (13 + 8*k) / 25;
		int m = (15 - p + k - q) % 30;
		int d = (19*a + m) % 30;
		int n = (4+k-q) % 7;
		int e = (2*b + 4*c + 6*d + n) % 7;
		
		EASTER_MONTH = 4;
		
		if((d + e) <= 9) {
			EASTER_DAY = (22 + d + e);
			EASTER_MONTH = 3;
		} else if(d == 29 && e == 6) {
			EASTER_DAY = 19;
		} else if(d == 28 && e == 6 && a > 10) {
			EASTER_DAY = 18;
		} else {
			EASTER_DAY = (d + e - 9);
		}
	}
	
}
