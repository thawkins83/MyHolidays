package me.tjhawkins.holidays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.time.LocalDate;

import org.junit.Test;

public class TestHolidays {
	
	@Test
	public void testNewYearsDay() {
		assertTrue(LocalDate.of(2010, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2010).getDayOfWeek()));
		assertTrue(LocalDate.of(2011, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2011).getDayOfWeek()));
		assertTrue(LocalDate.of(2012, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2012).getDayOfWeek()));
		assertTrue(LocalDate.of(2013, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2013).getDayOfWeek()));
		assertTrue(LocalDate.of(2014, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2014).getDayOfWeek()));
		assertTrue(LocalDate.of(2015, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2015).getDayOfWeek()));
		assertTrue(LocalDate.of(2016, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2016).getDayOfWeek()));
		assertTrue(LocalDate.of(2017, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2017).getDayOfWeek()));
		assertTrue(LocalDate.of(2018, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2018).getDayOfWeek()));
		assertTrue(LocalDate.of(2019, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2019).getDayOfWeek()));
		assertTrue(LocalDate.of(2020, 1, 1).getDayOfWeek().equals(Holidays.newYearsDay(2020).getDayOfWeek()));
		
		assertFalse(LocalDate.of(2010, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2010).getDayOfWeek()));
		assertFalse(LocalDate.of(2011, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2011).getDayOfWeek()));
		assertFalse(LocalDate.of(2012, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2012).getDayOfWeek()));
		assertFalse(LocalDate.of(2013, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2013).getDayOfWeek()));
		assertFalse(LocalDate.of(2014, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2014).getDayOfWeek()));
		assertFalse(LocalDate.of(2015, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2015).getDayOfWeek()));
		assertFalse(LocalDate.of(2016, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2016).getDayOfWeek()));
		assertFalse(LocalDate.of(2017, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2017).getDayOfWeek()));
		assertFalse(LocalDate.of(2018, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2018).getDayOfWeek()));
		assertFalse(LocalDate.of(2019, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2019).getDayOfWeek()));
		assertFalse(LocalDate.of(2020, 1, 3).getDayOfWeek().equals(Holidays.newYearsDay(2020).getDayOfWeek()));
	}
	
	@Test
	public void testNewYearsDayObserved() {
		assertTrue(LocalDate.of(2010, 1, 1).equals(Holidays.newYearsDayObserved(2010)));
		assertTrue(LocalDate.of(2011, 1, 1).equals(Holidays.newYearsDayObserved(2011)));
		assertTrue(LocalDate.of(2012, 1, 2).equals(Holidays.newYearsDayObserved(2012)));
		assertTrue(LocalDate.of(2013, 1, 1).equals(Holidays.newYearsDayObserved(2013)));
		assertTrue(LocalDate.of(2014, 1, 1).equals(Holidays.newYearsDayObserved(2014)));
		assertTrue(LocalDate.of(2015, 1, 1).equals(Holidays.newYearsDayObserved(2015)));
		assertTrue(LocalDate.of(2016, 1, 1).equals(Holidays.newYearsDayObserved(2016)));
		assertTrue(LocalDate.of(2017, 1, 2).equals(Holidays.newYearsDayObserved(2017)));
		assertTrue(LocalDate.of(2018, 1, 1).equals(Holidays.newYearsDayObserved(2018)));
		assertTrue(LocalDate.of(2019, 1, 1).equals(Holidays.newYearsDayObserved(2019)));
		assertTrue(LocalDate.of(2020, 1, 1).equals(Holidays.newYearsDayObserved(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(Holidays.newYearsDayObserved(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(Holidays.newYearsDayObserved(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(Holidays.newYearsDayObserved(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(Holidays.newYearsDayObserved(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(Holidays.newYearsDayObserved(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(Holidays.newYearsDayObserved(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(Holidays.newYearsDayObserved(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(Holidays.newYearsDayObserved(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(Holidays.newYearsDayObserved(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(Holidays.newYearsDayObserved(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(Holidays.newYearsDayObserved(2020)));
	}
	
	@Test
	public void testMartinLutherKingDay() {
		assertTrue(LocalDate.of(2010, 1, 18).equals(Holidays.martinLutherKingDay(2010)));
		assertTrue(LocalDate.of(2011, 1, 17).equals(Holidays.martinLutherKingDay(2011)));
		assertTrue(LocalDate.of(2012, 1, 16).equals(Holidays.martinLutherKingDay(2012)));
		assertTrue(LocalDate.of(2013, 1, 21).equals(Holidays.martinLutherKingDay(2013)));
		assertTrue(LocalDate.of(2014, 1, 20).equals(Holidays.martinLutherKingDay(2014)));
		assertTrue(LocalDate.of(2015, 1, 19).equals(Holidays.martinLutherKingDay(2015)));
		assertTrue(LocalDate.of(2016, 1, 18).equals(Holidays.martinLutherKingDay(2016)));
		assertTrue(LocalDate.of(2017, 1, 16).equals(Holidays.martinLutherKingDay(2017)));
		assertTrue(LocalDate.of(2018, 1, 15).equals(Holidays.martinLutherKingDay(2018)));
		assertTrue(LocalDate.of(2019, 1, 21).equals(Holidays.martinLutherKingDay(2019)));
		assertTrue(LocalDate.of(2020, 1, 20).equals(Holidays.martinLutherKingDay(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(Holidays.martinLutherKingDay(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(Holidays.martinLutherKingDay(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(Holidays.martinLutherKingDay(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(Holidays.martinLutherKingDay(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(Holidays.martinLutherKingDay(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(Holidays.martinLutherKingDay(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(Holidays.martinLutherKingDay(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(Holidays.martinLutherKingDay(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(Holidays.martinLutherKingDay(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(Holidays.martinLutherKingDay(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(Holidays.martinLutherKingDay(2020)));
	}
	
	@Test
	public void testAshWednesday() {
		assertTrue(LocalDate.of(2010, 2, 17).equals(ChristianHolidays.ashWednesday(2010)));
		assertTrue(LocalDate.of(2011, 3, 9).equals(ChristianHolidays.ashWednesday(2011)));
		assertTrue(LocalDate.of(2012, 2, 22).equals(ChristianHolidays.ashWednesday(2012)));
		assertTrue(LocalDate.of(2013, 2, 13).equals(ChristianHolidays.ashWednesday(2013)));
		assertTrue(LocalDate.of(2014, 3, 5).equals(ChristianHolidays.ashWednesday(2014)));
		assertTrue(LocalDate.of(2015, 2, 18).equals(ChristianHolidays.ashWednesday(2015)));
		assertTrue(LocalDate.of(2016, 2, 10).equals(ChristianHolidays.ashWednesday(2016)));
		assertTrue(LocalDate.of(2017, 3, 1).equals(ChristianHolidays.ashWednesday(2017)));
		assertTrue(LocalDate.of(2018, 2, 14).equals(ChristianHolidays.ashWednesday(2018)));
		assertTrue(LocalDate.of(2019, 3, 6).equals(ChristianHolidays.ashWednesday(2019)));
		assertTrue(LocalDate.of(2020, 2, 26).equals(ChristianHolidays.ashWednesday(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(ChristianHolidays.ashWednesday(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(ChristianHolidays.ashWednesday(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(ChristianHolidays.ashWednesday(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(ChristianHolidays.ashWednesday(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(ChristianHolidays.ashWednesday(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(ChristianHolidays.ashWednesday(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(ChristianHolidays.ashWednesday(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(ChristianHolidays.ashWednesday(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(ChristianHolidays.ashWednesday(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(ChristianHolidays.ashWednesday(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(ChristianHolidays.ashWednesday(2020)));
	}
	
	@Test
	public void testPresidentsDay() {
		assertTrue(LocalDate.of(2010, 2, 15).equals(Holidays.presidentsDay(2010)));
		assertTrue(LocalDate.of(2011, 2, 21).equals(Holidays.presidentsDay(2011)));
		assertTrue(LocalDate.of(2012, 2, 20).equals(Holidays.presidentsDay(2012)));
		assertTrue(LocalDate.of(2013, 2, 18).equals(Holidays.presidentsDay(2013)));
		assertTrue(LocalDate.of(2014, 2, 17).equals(Holidays.presidentsDay(2014)));
		assertTrue(LocalDate.of(2015, 2, 16).equals(Holidays.presidentsDay(2015)));
		assertTrue(LocalDate.of(2016, 2, 15).equals(Holidays.presidentsDay(2016)));
		assertTrue(LocalDate.of(2017, 2, 20).equals(Holidays.presidentsDay(2017)));
		assertTrue(LocalDate.of(2018, 2, 19).equals(Holidays.presidentsDay(2018)));
		assertTrue(LocalDate.of(2019, 2, 18).equals(Holidays.presidentsDay(2019)));
		assertTrue(LocalDate.of(2020, 2, 17).equals(Holidays.presidentsDay(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(Holidays.presidentsDay(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(Holidays.presidentsDay(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(Holidays.presidentsDay(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(Holidays.presidentsDay(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(Holidays.presidentsDay(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(Holidays.presidentsDay(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(Holidays.presidentsDay(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(Holidays.presidentsDay(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(Holidays.presidentsDay(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(Holidays.presidentsDay(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(Holidays.presidentsDay(2020)));
	}
	
	@Test
	public void testPalmSunday() {
		assertTrue(LocalDate.of(2010, 3, 28).equals(ChristianHolidays.palmSunday(2010)));
		assertTrue(LocalDate.of(2011, 4, 17).equals(ChristianHolidays.palmSunday(2011)));
		assertTrue(LocalDate.of(2012, 4, 1).equals(ChristianHolidays.palmSunday(2012)));
		assertTrue(LocalDate.of(2013, 3, 24).equals(ChristianHolidays.palmSunday(2013)));
		assertTrue(LocalDate.of(2014, 4, 13).equals(ChristianHolidays.palmSunday(2014)));
		assertTrue(LocalDate.of(2015, 3, 29).equals(ChristianHolidays.palmSunday(2015)));
		assertTrue(LocalDate.of(2016, 3, 20).equals(ChristianHolidays.palmSunday(2016)));
		assertTrue(LocalDate.of(2017, 4, 9).equals(ChristianHolidays.palmSunday(2017)));
		assertTrue(LocalDate.of(2018, 3, 25).equals(ChristianHolidays.palmSunday(2018)));
		assertTrue(LocalDate.of(2019, 4, 14).equals(ChristianHolidays.palmSunday(2019)));
		assertTrue(LocalDate.of(2020, 4, 5).equals(ChristianHolidays.palmSunday(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(ChristianHolidays.palmSunday(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(ChristianHolidays.palmSunday(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(ChristianHolidays.palmSunday(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(ChristianHolidays.palmSunday(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(ChristianHolidays.palmSunday(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(ChristianHolidays.palmSunday(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(ChristianHolidays.palmSunday(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(ChristianHolidays.palmSunday(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(ChristianHolidays.palmSunday(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(ChristianHolidays.palmSunday(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(ChristianHolidays.palmSunday(2020)));
	}
	
	@Test
	public void testGoodFriday() {
		assertTrue(LocalDate.of(2010, 4, 2).equals(ChristianHolidays.goodFriday(2010)));
		assertTrue(LocalDate.of(2011, 4, 22).equals(ChristianHolidays.goodFriday(2011)));
		assertTrue(LocalDate.of(2012, 4, 6).equals(ChristianHolidays.goodFriday(2012)));
		assertTrue(LocalDate.of(2013, 3, 29).equals(ChristianHolidays.goodFriday(2013)));
		assertTrue(LocalDate.of(2014, 4, 18).equals(ChristianHolidays.goodFriday(2014)));
		assertTrue(LocalDate.of(2015, 4, 3).equals(ChristianHolidays.goodFriday(2015)));
		assertTrue(LocalDate.of(2016, 3, 25).equals(ChristianHolidays.goodFriday(2016)));
		assertTrue(LocalDate.of(2017, 4, 14).equals(ChristianHolidays.goodFriday(2017)));
		assertTrue(LocalDate.of(2018, 3, 30).equals(ChristianHolidays.goodFriday(2018)));
		assertTrue(LocalDate.of(2019, 4, 19).equals(ChristianHolidays.goodFriday(2019)));
		assertTrue(LocalDate.of(2020, 4, 10).equals(ChristianHolidays.goodFriday(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(ChristianHolidays.goodFriday(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(ChristianHolidays.goodFriday(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(ChristianHolidays.goodFriday(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(ChristianHolidays.goodFriday(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(ChristianHolidays.goodFriday(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(ChristianHolidays.goodFriday(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(ChristianHolidays.goodFriday(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(ChristianHolidays.goodFriday(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(ChristianHolidays.goodFriday(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(ChristianHolidays.goodFriday(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(ChristianHolidays.goodFriday(2020)));
	}
	
	/**
	 * Dates to test Easter Sunday were retrieved from here:
	 * https://en.wikipedia.org/wiki/Computus
	 */
	@Test
	public void testEasterSunday() {
		assertTrue(LocalDate.of(1996, 4, 7).equals(ChristianHolidays.easterSunday(1996)));
		assertTrue(LocalDate.of(1997, 3, 30).equals(ChristianHolidays.easterSunday(1997)));
		assertTrue(LocalDate.of(1998, 4, 12).equals(ChristianHolidays.easterSunday(1998)));
		assertTrue(LocalDate.of(1999, 4, 4).equals(ChristianHolidays.easterSunday(1999)));
		assertTrue(LocalDate.of(2000, 4, 23).equals(ChristianHolidays.easterSunday(2000)));
		assertTrue(LocalDate.of(2001, 4, 15).equals(ChristianHolidays.easterSunday(2001)));
		assertTrue(LocalDate.of(2002, 3, 31).equals(ChristianHolidays.easterSunday(2002)));
		assertTrue(LocalDate.of(2003, 4, 20).equals(ChristianHolidays.easterSunday(2003)));
		assertTrue(LocalDate.of(2004, 4, 11).equals(ChristianHolidays.easterSunday(2004)));
		assertTrue(LocalDate.of(2005, 3, 27).equals(ChristianHolidays.easterSunday(2005)));
		assertTrue(LocalDate.of(2006, 4, 16).equals(ChristianHolidays.easterSunday(2006)));
		assertTrue(LocalDate.of(2007, 4, 8).equals(ChristianHolidays.easterSunday(2007)));
		assertTrue(LocalDate.of(2008, 3, 23).equals(ChristianHolidays.easterSunday(2008)));
		assertTrue(LocalDate.of(2009, 4, 12).equals(ChristianHolidays.easterSunday(2009)));
		assertTrue(LocalDate.of(2010, 4, 4).equals(ChristianHolidays.easterSunday(2010)));
		assertTrue(LocalDate.of(2011, 4, 24).equals(ChristianHolidays.easterSunday(2011)));
		assertTrue(LocalDate.of(2012, 4, 8).equals(ChristianHolidays.easterSunday(2012)));
		assertTrue(LocalDate.of(2013, 3, 31).equals(ChristianHolidays.easterSunday(2013)));
		assertTrue(LocalDate.of(2014, 4, 20).equals(ChristianHolidays.easterSunday(2014)));
		assertTrue(LocalDate.of(2015, 4, 5).equals(ChristianHolidays.easterSunday(2015)));
		assertTrue(LocalDate.of(2016, 3, 27).equals(ChristianHolidays.easterSunday(2016)));
		assertTrue(LocalDate.of(2017, 4, 16).equals(ChristianHolidays.easterSunday(2017)));
		assertTrue(LocalDate.of(2018, 4, 1).equals(ChristianHolidays.easterSunday(2018)));
		assertTrue(LocalDate.of(2019, 4, 21).equals(ChristianHolidays.easterSunday(2019)));
		assertTrue(LocalDate.of(2020, 4, 12).equals(ChristianHolidays.easterSunday(2020)));
		assertTrue(LocalDate.of(2021, 4, 4).equals(ChristianHolidays.easterSunday(2021)));
		assertTrue(LocalDate.of(2022, 4, 17).equals(ChristianHolidays.easterSunday(2022)));
		assertTrue(LocalDate.of(2023, 4, 9).equals(ChristianHolidays.easterSunday(2023)));
		assertTrue(LocalDate.of(2024, 3, 31).equals(ChristianHolidays.easterSunday(2024)));
		assertTrue(LocalDate.of(2025, 4, 20).equals(ChristianHolidays.easterSunday(2025)));
		assertTrue(LocalDate.of(2026, 4, 5).equals(ChristianHolidays.easterSunday(2026)));
		assertTrue(LocalDate.of(2027, 3, 28).equals(ChristianHolidays.easterSunday(2027)));
		assertTrue(LocalDate.of(2028, 4, 16).equals(ChristianHolidays.easterSunday(2028)));
		assertTrue(LocalDate.of(2029, 4, 1).equals(ChristianHolidays.easterSunday(2029)));
		assertTrue(LocalDate.of(2030, 4, 21).equals(ChristianHolidays.easterSunday(2030)));
		assertTrue(LocalDate.of(2031, 4, 13).equals(ChristianHolidays.easterSunday(2031)));
		assertTrue(LocalDate.of(2032, 3, 28).equals(ChristianHolidays.easterSunday(2032)));
		assertTrue(LocalDate.of(2033, 4, 17).equals(ChristianHolidays.easterSunday(2033)));
		assertTrue(LocalDate.of(2034, 4, 9).equals(ChristianHolidays.easterSunday(2034)));
		assertTrue(LocalDate.of(2035, 3, 25).equals(ChristianHolidays.easterSunday(2035)));
		assertTrue(LocalDate.of(2036, 4, 13).equals(ChristianHolidays.easterSunday(2036)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(ChristianHolidays.easterSunday(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(ChristianHolidays.easterSunday(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(ChristianHolidays.easterSunday(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(ChristianHolidays.easterSunday(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(ChristianHolidays.easterSunday(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(ChristianHolidays.easterSunday(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(ChristianHolidays.easterSunday(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(ChristianHolidays.easterSunday(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(ChristianHolidays.easterSunday(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(ChristianHolidays.easterSunday(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(ChristianHolidays.easterSunday(2020)));
	}

	@Test
	public void testEasterMonday() {
		assertTrue(LocalDate.of(2010, 4, 5).equals(ChristianHolidays.easterMonday(2010)));
		assertTrue(LocalDate.of(2011, 4, 25).equals(ChristianHolidays.easterMonday(2011)));
		assertTrue(LocalDate.of(2012, 4, 9).equals(ChristianHolidays.easterMonday(2012)));
		assertTrue(LocalDate.of(2013, 4, 1).equals(ChristianHolidays.easterMonday(2013)));
		assertTrue(LocalDate.of(2014, 4, 21).equals(ChristianHolidays.easterMonday(2014)));
		assertTrue(LocalDate.of(2015, 4, 6).equals(ChristianHolidays.easterMonday(2015)));
		assertTrue(LocalDate.of(2016, 3, 28).equals(ChristianHolidays.easterMonday(2016)));
		assertTrue(LocalDate.of(2017, 4, 17).equals(ChristianHolidays.easterMonday(2017)));
		assertTrue(LocalDate.of(2018, 4, 2).equals(ChristianHolidays.easterMonday(2018)));
		assertTrue(LocalDate.of(2019, 4, 22).equals(ChristianHolidays.easterMonday(2019)));
		assertTrue(LocalDate.of(2020, 4, 13).equals(ChristianHolidays.easterMonday(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(ChristianHolidays.easterMonday(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(ChristianHolidays.easterMonday(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(ChristianHolidays.easterMonday(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(ChristianHolidays.easterMonday(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(ChristianHolidays.easterMonday(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(ChristianHolidays.easterMonday(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(ChristianHolidays.easterMonday(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(ChristianHolidays.easterMonday(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(ChristianHolidays.easterMonday(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(ChristianHolidays.easterMonday(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(ChristianHolidays.easterMonday(2020)));
	}
	
	@Test
	public void testMothersDay() {
		assertTrue(LocalDate.of(2010, 5, 9).equals(Holidays.mothersDay(2010)));
		assertTrue(LocalDate.of(2011, 5, 8).equals(Holidays.mothersDay(2011)));
		assertTrue(LocalDate.of(2012, 5, 13).equals(Holidays.mothersDay(2012)));
		assertTrue(LocalDate.of(2013, 5, 12).equals(Holidays.mothersDay(2013)));
		assertTrue(LocalDate.of(2014, 5, 11).equals(Holidays.mothersDay(2014)));
		assertTrue(LocalDate.of(2015, 5, 10).equals(Holidays.mothersDay(2015)));
		assertTrue(LocalDate.of(2016, 5, 8).equals(Holidays.mothersDay(2016)));
		assertTrue(LocalDate.of(2017, 5, 14).equals(Holidays.mothersDay(2017)));
		assertTrue(LocalDate.of(2018, 5, 13).equals(Holidays.mothersDay(2018)));
		assertTrue(LocalDate.of(2019, 5, 12).equals(Holidays.mothersDay(2019)));
		assertTrue(LocalDate.of(2020, 5, 10).equals(Holidays.mothersDay(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(Holidays.mothersDay(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(Holidays.mothersDay(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(Holidays.mothersDay(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(Holidays.mothersDay(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(Holidays.mothersDay(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(Holidays.mothersDay(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(Holidays.mothersDay(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(Holidays.mothersDay(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(Holidays.mothersDay(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(Holidays.mothersDay(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(Holidays.mothersDay(2020)));
	}
	
	@Test
	public void testMemorialDay() {
		assertTrue(LocalDate.of(2010, 5, 31).equals(Holidays.memorialDay(2010)));
		assertTrue(LocalDate.of(2011, 5, 30).equals(Holidays.memorialDay(2011)));
		assertTrue(LocalDate.of(2012, 5, 28).equals(Holidays.memorialDay(2012)));
		assertTrue(LocalDate.of(2013, 5, 27).equals(Holidays.memorialDay(2013)));
		assertTrue(LocalDate.of(2014, 5, 26).equals(Holidays.memorialDay(2014)));
		assertTrue(LocalDate.of(2015, 5, 25).equals(Holidays.memorialDay(2015)));
		assertTrue(LocalDate.of(2016, 5, 30).equals(Holidays.memorialDay(2016)));
		assertTrue(LocalDate.of(2017, 5, 29).equals(Holidays.memorialDay(2017)));
		assertTrue(LocalDate.of(2018, 5, 28).equals(Holidays.memorialDay(2018)));
		assertTrue(LocalDate.of(2019, 5, 27).equals(Holidays.memorialDay(2019)));
		assertTrue(LocalDate.of(2020, 5, 25).equals(Holidays.memorialDay(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(Holidays.memorialDay(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(Holidays.memorialDay(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(Holidays.memorialDay(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(Holidays.memorialDay(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(Holidays.memorialDay(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(Holidays.memorialDay(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(Holidays.memorialDay(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(Holidays.memorialDay(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(Holidays.memorialDay(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(Holidays.memorialDay(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(Holidays.memorialDay(2020)));
	}
	
	@Test
	public void testFathersDay() {
		assertTrue(LocalDate.of(2010, 6, 20).equals(Holidays.fathersDay(2010)));
		assertTrue(LocalDate.of(2011, 6, 19).equals(Holidays.fathersDay(2011)));
		assertTrue(LocalDate.of(2012, 6, 17).equals(Holidays.fathersDay(2012)));
		assertTrue(LocalDate.of(2013, 6, 16).equals(Holidays.fathersDay(2013)));
		assertTrue(LocalDate.of(2014, 6, 15).equals(Holidays.fathersDay(2014)));
		assertTrue(LocalDate.of(2015, 6, 21).equals(Holidays.fathersDay(2015)));
		assertTrue(LocalDate.of(2016, 6, 19).equals(Holidays.fathersDay(2016)));
		assertTrue(LocalDate.of(2017, 6, 18).equals(Holidays.fathersDay(2017)));
		assertTrue(LocalDate.of(2018, 6, 17).equals(Holidays.fathersDay(2018)));
		assertTrue(LocalDate.of(2019, 6, 16).equals(Holidays.fathersDay(2019)));
		assertTrue(LocalDate.of(2020, 6, 21).equals(Holidays.fathersDay(2020)));
		
		assertFalse(LocalDate.of(2010, 1, 3).equals(Holidays.fathersDay(2010)));
		assertFalse(LocalDate.of(2011, 1, 3).equals(Holidays.fathersDay(2011)));
		assertFalse(LocalDate.of(2012, 1, 3).equals(Holidays.fathersDay(2012)));
		assertFalse(LocalDate.of(2013, 1, 3).equals(Holidays.fathersDay(2013)));
		assertFalse(LocalDate.of(2014, 1, 3).equals(Holidays.fathersDay(2014)));
		assertFalse(LocalDate.of(2015, 1, 3).equals(Holidays.fathersDay(2015)));
		assertFalse(LocalDate.of(2016, 1, 3).equals(Holidays.fathersDay(2016)));
		assertFalse(LocalDate.of(2017, 1, 3).equals(Holidays.fathersDay(2017)));
		assertFalse(LocalDate.of(2018, 1, 3).equals(Holidays.fathersDay(2018)));
		assertFalse(LocalDate.of(2019, 1, 3).equals(Holidays.fathersDay(2019)));
		assertFalse(LocalDate.of(2020, 1, 3).equals(Holidays.fathersDay(2020)));
	}
	
	@Test
	public void testIndenpendenceDay() {
		assertTrue(LocalDate.of(2010, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2010).getDayOfWeek()));
		assertTrue(LocalDate.of(2011, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2011).getDayOfWeek()));
		assertTrue(LocalDate.of(2012, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2012).getDayOfWeek()));
		assertTrue(LocalDate.of(2013, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2013).getDayOfWeek()));
		assertTrue(LocalDate.of(2014, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2014).getDayOfWeek()));
		assertTrue(LocalDate.of(2015, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2015).getDayOfWeek()));
		assertTrue(LocalDate.of(2016, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2016).getDayOfWeek()));
		assertTrue(LocalDate.of(2017, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2017).getDayOfWeek()));
		assertTrue(LocalDate.of(2018, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2018).getDayOfWeek()));
		assertTrue(LocalDate.of(2019, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2019).getDayOfWeek()));
		assertTrue(LocalDate.of(2020, 7, 4).getDayOfWeek().equals(Holidays.independenceDay(2020).getDayOfWeek()));
		
		assertFalse(LocalDate.of(2010, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2010).getDayOfWeek()));
		assertFalse(LocalDate.of(2011, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2011).getDayOfWeek()));
		assertFalse(LocalDate.of(2012, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2012).getDayOfWeek()));
		assertFalse(LocalDate.of(2013, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2013).getDayOfWeek()));
		assertFalse(LocalDate.of(2014, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2014).getDayOfWeek()));
		assertFalse(LocalDate.of(2015, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2015).getDayOfWeek()));
		assertFalse(LocalDate.of(2016, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2016).getDayOfWeek()));
		assertFalse(LocalDate.of(2017, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2017).getDayOfWeek()));
		assertFalse(LocalDate.of(2018, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2018).getDayOfWeek()));
		assertFalse(LocalDate.of(2019, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2019).getDayOfWeek()));
		assertFalse(LocalDate.of(2020, 7, 1).getDayOfWeek().equals(Holidays.independenceDay(2020).getDayOfWeek()));
	}
	
	@Test
	public void testIndenpendenceDayObserved() {
		assertTrue(LocalDate.of(2010, 7, 5).equals(Holidays.independenceDayObserved(2010)));
		assertTrue(LocalDate.of(2011, 7, 4).equals(Holidays.independenceDayObserved(2011)));
		assertTrue(LocalDate.of(2012, 7, 4).equals(Holidays.independenceDayObserved(2012)));
		assertTrue(LocalDate.of(2013, 7, 4).equals(Holidays.independenceDayObserved(2013)));
		assertTrue(LocalDate.of(2014, 7, 4).equals(Holidays.independenceDayObserved(2014)));
		assertTrue(LocalDate.of(2015, 7, 3).equals(Holidays.independenceDayObserved(2015)));
		assertTrue(LocalDate.of(2016, 7, 4).equals(Holidays.independenceDayObserved(2016)));
		assertTrue(LocalDate.of(2017, 7, 4).equals(Holidays.independenceDayObserved(2017)));
		assertTrue(LocalDate.of(2018, 7, 4).equals(Holidays.independenceDayObserved(2018)));
		assertTrue(LocalDate.of(2019, 7, 4).equals(Holidays.independenceDayObserved(2019)));
		assertTrue(LocalDate.of(2020, 7, 3).equals(Holidays.independenceDayObserved(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(Holidays.independenceDayObserved(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(Holidays.independenceDayObserved(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(Holidays.independenceDayObserved(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(Holidays.independenceDayObserved(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(Holidays.independenceDayObserved(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(Holidays.independenceDayObserved(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(Holidays.independenceDayObserved(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(Holidays.independenceDayObserved(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(Holidays.independenceDayObserved(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(Holidays.independenceDayObserved(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(Holidays.independenceDayObserved(2020)));
	}
	
	@Test
	public void testLaborDay() {
		assertTrue(LocalDate.of(2010, 9, 6).equals(Holidays.laborDay(2010)));
		assertTrue(LocalDate.of(2011, 9, 5).equals(Holidays.laborDay(2011)));
		assertTrue(LocalDate.of(2012, 9, 3).equals(Holidays.laborDay(2012)));
		assertTrue(LocalDate.of(2013, 9, 2).equals(Holidays.laborDay(2013)));
		assertTrue(LocalDate.of(2014, 9, 1).equals(Holidays.laborDay(2014)));
		assertTrue(LocalDate.of(2015, 9, 7).equals(Holidays.laborDay(2015)));
		assertTrue(LocalDate.of(2016, 9, 5).equals(Holidays.laborDay(2016)));
		assertTrue(LocalDate.of(2017, 9, 4).equals(Holidays.laborDay(2017)));
		assertTrue(LocalDate.of(2018, 9, 3).equals(Holidays.laborDay(2018)));
		assertTrue(LocalDate.of(2019, 9, 2).equals(Holidays.laborDay(2019)));
		assertTrue(LocalDate.of(2020, 9, 7).equals(Holidays.laborDay(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(Holidays.laborDay(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(Holidays.laborDay(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(Holidays.laborDay(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(Holidays.laborDay(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(Holidays.laborDay(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(Holidays.laborDay(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(Holidays.laborDay(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(Holidays.laborDay(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(Holidays.laborDay(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(Holidays.laborDay(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(Holidays.laborDay(2020)));
	}
	
	/**
	 * Dates to test Rosh Hashana were retrieved from here:
	 * http://www.timeanddate.com/holidays/us/rosh-hashana
	 */
	@Test
	public void testRoshHashana() {
		assertTrue(LocalDate.of(2010, 9, 9).equals(HebrewHolidays.roshHashana(2010)));
		assertTrue(LocalDate.of(2011, 9, 29).equals(HebrewHolidays.roshHashana(2011)));
		assertTrue(LocalDate.of(2012, 9, 17).equals(HebrewHolidays.roshHashana(2012)));
		assertTrue(LocalDate.of(2013, 9, 5).equals(HebrewHolidays.roshHashana(2013)));
		assertTrue(LocalDate.of(2014, 9, 25).equals(HebrewHolidays.roshHashana(2014)));
		assertTrue(LocalDate.of(2015, 9, 14).equals(HebrewHolidays.roshHashana(2015)));
		assertTrue(LocalDate.of(2016, 10, 3).equals(HebrewHolidays.roshHashana(2016)));
		assertTrue(LocalDate.of(2017, 9, 21).equals(HebrewHolidays.roshHashana(2017)));
		assertTrue(LocalDate.of(2018, 9, 10).equals(HebrewHolidays.roshHashana(2018)));
		assertTrue(LocalDate.of(2019, 9, 30).equals(HebrewHolidays.roshHashana(2019)));
		assertTrue(LocalDate.of(2020, 9, 19).equals(HebrewHolidays.roshHashana(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(HebrewHolidays.roshHashana(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(HebrewHolidays.roshHashana(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(HebrewHolidays.roshHashana(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(HebrewHolidays.roshHashana(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(HebrewHolidays.roshHashana(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(HebrewHolidays.roshHashana(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(HebrewHolidays.roshHashana(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(HebrewHolidays.roshHashana(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(HebrewHolidays.roshHashana(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(HebrewHolidays.roshHashana(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(HebrewHolidays.roshHashana(2020)));
	}
	
	/**
	 * Dates to test Yom Kippur were retrieved from here:
	 * http://www.timeanddate.com/holidays/us/yom-kippur
	 */
	@Test
	public void testYomKippur() {
		assertTrue(LocalDate.of(2010, 9, 18).equals(HebrewHolidays.yomKippur(2010)));
		assertTrue(LocalDate.of(2011, 10, 8).equals(HebrewHolidays.yomKippur(2011)));
		assertTrue(LocalDate.of(2012, 9, 26).equals(HebrewHolidays.yomKippur(2012)));
		assertTrue(LocalDate.of(2013, 9, 14).equals(HebrewHolidays.yomKippur(2013)));
		assertTrue(LocalDate.of(2014, 10, 4).equals(HebrewHolidays.yomKippur(2014)));
		assertTrue(LocalDate.of(2015, 9, 23).equals(HebrewHolidays.yomKippur(2015)));
		assertTrue(LocalDate.of(2016, 10, 12).equals(HebrewHolidays.yomKippur(2016)));
		assertTrue(LocalDate.of(2017, 9, 30).equals(HebrewHolidays.yomKippur(2017)));
		assertTrue(LocalDate.of(2018, 9, 19).equals(HebrewHolidays.yomKippur(2018)));
		assertTrue(LocalDate.of(2019, 10, 9).equals(HebrewHolidays.yomKippur(2019)));
		assertTrue(LocalDate.of(2020, 9, 28).equals(HebrewHolidays.yomKippur(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(HebrewHolidays.yomKippur(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(HebrewHolidays.yomKippur(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(HebrewHolidays.yomKippur(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(HebrewHolidays.yomKippur(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(HebrewHolidays.yomKippur(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(HebrewHolidays.yomKippur(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(HebrewHolidays.yomKippur(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(HebrewHolidays.yomKippur(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(HebrewHolidays.yomKippur(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(HebrewHolidays.yomKippur(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(HebrewHolidays.yomKippur(2020)));
	}
	
	@Test
	public void testColumbsDay() {
		assertTrue(LocalDate.of(2010, 10, 11).equals(Holidays.columbusDay(2010)));
		assertTrue(LocalDate.of(2011, 10, 10).equals(Holidays.columbusDay(2011)));
		assertTrue(LocalDate.of(2012, 10, 8).equals(Holidays.columbusDay(2012)));
		assertTrue(LocalDate.of(2013, 10, 14).equals(Holidays.columbusDay(2013)));
		assertTrue(LocalDate.of(2014, 10, 13).equals(Holidays.columbusDay(2014)));
		assertTrue(LocalDate.of(2015, 10, 12).equals(Holidays.columbusDay(2015)));
		assertTrue(LocalDate.of(2016, 10, 10).equals(Holidays.columbusDay(2016)));
		assertTrue(LocalDate.of(2017, 10, 9).equals(Holidays.columbusDay(2017)));
		assertTrue(LocalDate.of(2018, 10, 8).equals(Holidays.columbusDay(2018)));
		assertTrue(LocalDate.of(2019, 10, 14).equals(Holidays.columbusDay(2019)));
		assertTrue(LocalDate.of(2020, 10, 12).equals(Holidays.columbusDay(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(Holidays.columbusDay(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(Holidays.columbusDay(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(Holidays.columbusDay(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(Holidays.columbusDay(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(Holidays.columbusDay(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(Holidays.columbusDay(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(Holidays.columbusDay(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(Holidays.columbusDay(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(Holidays.columbusDay(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(Holidays.columbusDay(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(Holidays.columbusDay(2020)));
	}
	
	@Test
	public void testVeteransDay() {
		assertTrue(LocalDate.of(2010, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2010).getDayOfWeek()));
		assertTrue(LocalDate.of(2011, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2011).getDayOfWeek()));
		assertTrue(LocalDate.of(2012, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2012).getDayOfWeek()));
		assertTrue(LocalDate.of(2013, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2013).getDayOfWeek()));
		assertTrue(LocalDate.of(2014, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2014).getDayOfWeek()));
		assertTrue(LocalDate.of(2015, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2015).getDayOfWeek()));
		assertTrue(LocalDate.of(2016, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2016).getDayOfWeek()));
		assertTrue(LocalDate.of(2017, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2017).getDayOfWeek()));
		assertTrue(LocalDate.of(2018, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2018).getDayOfWeek()));
		assertTrue(LocalDate.of(2019, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2019).getDayOfWeek()));
		assertTrue(LocalDate.of(2020, 11, 11).getDayOfWeek().equals(Holidays.veteransDay(2020).getDayOfWeek()));
		
		assertFalse(LocalDate.of(2010, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2010).getDayOfWeek()));
		assertFalse(LocalDate.of(2011, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2011).getDayOfWeek()));
		assertFalse(LocalDate.of(2012, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2012).getDayOfWeek()));
		assertFalse(LocalDate.of(2013, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2013).getDayOfWeek()));
		assertFalse(LocalDate.of(2014, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2014).getDayOfWeek()));
		assertFalse(LocalDate.of(2015, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2015).getDayOfWeek()));
		assertFalse(LocalDate.of(2016, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2016).getDayOfWeek()));
		assertFalse(LocalDate.of(2017, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2017).getDayOfWeek()));
		assertFalse(LocalDate.of(2018, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2018).getDayOfWeek()));
		assertFalse(LocalDate.of(2019, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2019).getDayOfWeek()));
		assertFalse(LocalDate.of(2020, 11, 10).getDayOfWeek().equals(Holidays.veteransDay(2020).getDayOfWeek()));
	}
	
	@Test
	public void testVeteransDayObserved() {
		assertTrue(LocalDate.of(2010, 11, 11).equals(Holidays.veteransDayObserved(2010)));
		assertTrue(LocalDate.of(2011, 11, 11).equals(Holidays.veteransDayObserved(2011)));
		assertTrue(LocalDate.of(2012, 11, 12).equals(Holidays.veteransDayObserved(2012)));
		assertTrue(LocalDate.of(2013, 11, 11).equals(Holidays.veteransDayObserved(2013)));
		assertTrue(LocalDate.of(2014, 11, 11).equals(Holidays.veteransDayObserved(2014)));
		assertTrue(LocalDate.of(2015, 11, 11).equals(Holidays.veteransDayObserved(2015)));
		assertTrue(LocalDate.of(2016, 11, 11).equals(Holidays.veteransDayObserved(2016)));
		assertTrue(LocalDate.of(2017, 11, 10).equals(Holidays.veteransDayObserved(2017)));
		assertTrue(LocalDate.of(2018, 11, 12).equals(Holidays.veteransDayObserved(2018)));
		assertTrue(LocalDate.of(2019, 11, 11).equals(Holidays.veteransDayObserved(2019)));
		assertTrue(LocalDate.of(2020, 11, 11).equals(Holidays.veteransDayObserved(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(Holidays.veteransDayObserved(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(Holidays.veteransDayObserved(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(Holidays.veteransDayObserved(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(Holidays.veteransDayObserved(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(Holidays.veteransDayObserved(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(Holidays.veteransDayObserved(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(Holidays.veteransDayObserved(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(Holidays.veteransDayObserved(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(Holidays.veteransDayObserved(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(Holidays.veteransDayObserved(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(Holidays.veteransDayObserved(2020)));
	}
	
	@Test
	public void testThanksgiving() {
		assertTrue(LocalDate.of(2010, 11, 25).equals(Holidays.thanksgiving(2010)));
		assertTrue(LocalDate.of(2011, 11, 24).equals(Holidays.thanksgiving(2011)));
		assertTrue(LocalDate.of(2012, 11, 22).equals(Holidays.thanksgiving(2012)));
		assertTrue(LocalDate.of(2013, 11, 28).equals(Holidays.thanksgiving(2013)));
		assertTrue(LocalDate.of(2014, 11, 27).equals(Holidays.thanksgiving(2014)));
		assertTrue(LocalDate.of(2015, 11, 26).equals(Holidays.thanksgiving(2015)));
		assertTrue(LocalDate.of(2016, 11, 24).equals(Holidays.thanksgiving(2016)));
		assertTrue(LocalDate.of(2017, 11, 23).equals(Holidays.thanksgiving(2017)));
		assertTrue(LocalDate.of(2018, 11, 22).equals(Holidays.thanksgiving(2018)));
		assertTrue(LocalDate.of(2019, 11, 28).equals(Holidays.thanksgiving(2019)));
		assertTrue(LocalDate.of(2020, 11, 26).equals(Holidays.thanksgiving(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(Holidays.thanksgiving(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(Holidays.thanksgiving(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(Holidays.thanksgiving(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(Holidays.thanksgiving(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(Holidays.thanksgiving(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(Holidays.thanksgiving(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(Holidays.thanksgiving(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(Holidays.thanksgiving(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(Holidays.thanksgiving(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(Holidays.thanksgiving(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(Holidays.thanksgiving(2020)));
	}
	
	@Test
	public void testThanksgivingFriday() {
		assertTrue(LocalDate.of(2010, 11, 26).equals(Holidays.thanksgivingFriday(2010)));
		assertTrue(LocalDate.of(2011, 11, 25).equals(Holidays.thanksgivingFriday(2011)));
		assertTrue(LocalDate.of(2012, 11, 23).equals(Holidays.thanksgivingFriday(2012)));
		assertTrue(LocalDate.of(2013, 11, 29).equals(Holidays.thanksgivingFriday(2013)));
		assertTrue(LocalDate.of(2014, 11, 28).equals(Holidays.thanksgivingFriday(2014)));
		assertTrue(LocalDate.of(2015, 11, 27).equals(Holidays.thanksgivingFriday(2015)));
		assertTrue(LocalDate.of(2016, 11, 25).equals(Holidays.thanksgivingFriday(2016)));
		assertTrue(LocalDate.of(2017, 11, 24).equals(Holidays.thanksgivingFriday(2017)));
		assertTrue(LocalDate.of(2018, 11, 23).equals(Holidays.thanksgivingFriday(2018)));
		assertTrue(LocalDate.of(2019, 11, 29).equals(Holidays.thanksgivingFriday(2019)));
		assertTrue(LocalDate.of(2020, 11, 27).equals(Holidays.thanksgivingFriday(2020)));
		
		assertFalse(LocalDate.of(2010, 7, 1).equals(Holidays.thanksgivingFriday(2010)));
		assertFalse(LocalDate.of(2011, 7, 1).equals(Holidays.thanksgivingFriday(2011)));
		assertFalse(LocalDate.of(2012, 7, 1).equals(Holidays.thanksgivingFriday(2012)));
		assertFalse(LocalDate.of(2013, 7, 1).equals(Holidays.thanksgivingFriday(2013)));
		assertFalse(LocalDate.of(2014, 7, 1).equals(Holidays.thanksgivingFriday(2014)));
		assertFalse(LocalDate.of(2015, 7, 1).equals(Holidays.thanksgivingFriday(2015)));
		assertFalse(LocalDate.of(2016, 7, 1).equals(Holidays.thanksgivingFriday(2016)));
		assertFalse(LocalDate.of(2017, 7, 1).equals(Holidays.thanksgivingFriday(2017)));
		assertFalse(LocalDate.of(2018, 7, 1).equals(Holidays.thanksgivingFriday(2018)));
		assertFalse(LocalDate.of(2019, 7, 1).equals(Holidays.thanksgivingFriday(2019)));
		assertFalse(LocalDate.of(2020, 7, 1).equals(Holidays.thanksgivingFriday(2020)));
	}
	
	@Test
	public void testChanukah() {
		assertTrue(LocalDate.of(2010, 12, 2).equals(HebrewHolidays.chanukah(2010)));
		assertTrue(LocalDate.of(2011, 12, 21).equals(HebrewHolidays.chanukah(2011)));
		assertTrue(LocalDate.of(2012, 12, 9).equals(HebrewHolidays.chanukah(2012)));
		assertTrue(LocalDate.of(2013, 11, 28).equals(HebrewHolidays.chanukah(2013)));
		assertTrue(LocalDate.of(2014, 12, 17).equals(HebrewHolidays.chanukah(2014)));
		assertTrue(LocalDate.of(2015, 12, 7).equals(HebrewHolidays.chanukah(2015)));
		assertTrue(LocalDate.of(2016, 12, 25).equals(HebrewHolidays.chanukah(2016)));
		assertTrue(LocalDate.of(2017, 12, 13).equals(HebrewHolidays.chanukah(2017)));
		assertTrue(LocalDate.of(2018, 12, 3).equals(HebrewHolidays.chanukah(2018)));
		assertTrue(LocalDate.of(2019, 12, 23).equals(HebrewHolidays.chanukah(2019)));
		assertTrue(LocalDate.of(2020, 12, 11).equals(HebrewHolidays.chanukah(2020)));
		
		assertFalse(LocalDate.of(2010, 11, 1).equals(HebrewHolidays.chanukah(2010)));
		assertFalse(LocalDate.of(2011, 11, 1).equals(HebrewHolidays.chanukah(2011)));
		assertFalse(LocalDate.of(2012, 11, 1).equals(HebrewHolidays.chanukah(2012)));
		assertFalse(LocalDate.of(2013, 11, 1).equals(HebrewHolidays.chanukah(2013)));
		assertFalse(LocalDate.of(2014, 11, 1).equals(HebrewHolidays.chanukah(2014)));
		assertFalse(LocalDate.of(2015, 11, 1).equals(HebrewHolidays.chanukah(2015)));
		assertFalse(LocalDate.of(2016, 11, 1).equals(HebrewHolidays.chanukah(2016)));
		assertFalse(LocalDate.of(2017, 11, 1).equals(HebrewHolidays.chanukah(2017)));
		assertFalse(LocalDate.of(2018, 11, 1).equals(HebrewHolidays.chanukah(2018)));
		assertFalse(LocalDate.of(2019, 11, 1).equals(HebrewHolidays.chanukah(2019)));
		assertFalse(LocalDate.of(2020, 11, 1).equals(HebrewHolidays.chanukah(2020)));
	}
	
	@Test
	public void testPassover() {
		assertTrue(LocalDate.of(2010, 3, 30).equals(HebrewHolidays.passover(2010)));
		assertTrue(LocalDate.of(2011, 4, 19).equals(HebrewHolidays.passover(2011)));
		assertTrue(LocalDate.of(2012, 4, 7).equals(HebrewHolidays.passover(2012)));
		assertTrue(LocalDate.of(2013, 3, 26).equals(HebrewHolidays.passover(2013)));
		assertTrue(LocalDate.of(2014, 4, 15).equals(HebrewHolidays.passover(2014)));
		assertTrue(LocalDate.of(2015, 4, 4).equals(HebrewHolidays.passover(2015)));
		assertTrue(LocalDate.of(2016, 4, 23).equals(HebrewHolidays.passover(2016)));
		assertTrue(LocalDate.of(2017, 4, 11).equals(HebrewHolidays.passover(2017)));
		assertTrue(LocalDate.of(2018, 3, 31).equals(HebrewHolidays.passover(2018)));
		assertTrue(LocalDate.of(2019, 4, 20).equals(HebrewHolidays.passover(2019)));
		assertTrue(LocalDate.of(2020, 4, 9).equals(HebrewHolidays.passover(2020)));
		
		assertFalse(LocalDate.of(2010, 11, 1).equals(HebrewHolidays.passover(2010)));
		assertFalse(LocalDate.of(2011, 11, 1).equals(HebrewHolidays.passover(2011)));
		assertFalse(LocalDate.of(2012, 11, 1).equals(HebrewHolidays.passover(2012)));
		assertFalse(LocalDate.of(2013, 11, 1).equals(HebrewHolidays.passover(2013)));
		assertFalse(LocalDate.of(2014, 11, 1).equals(HebrewHolidays.passover(2014)));
		assertFalse(LocalDate.of(2015, 11, 1).equals(HebrewHolidays.passover(2015)));
		assertFalse(LocalDate.of(2016, 11, 1).equals(HebrewHolidays.passover(2016)));
		assertFalse(LocalDate.of(2017, 11, 1).equals(HebrewHolidays.passover(2017)));
		assertFalse(LocalDate.of(2018, 11, 1).equals(HebrewHolidays.passover(2018)));
		assertFalse(LocalDate.of(2019, 11, 1).equals(HebrewHolidays.passover(2019)));
		assertFalse(LocalDate.of(2020, 11, 1).equals(HebrewHolidays.passover(2020)));
	}
	
	@Test
	public void testChristmasEve() {
		assertTrue(LocalDate.of(2010, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2010).getDayOfWeek()));
		assertTrue(LocalDate.of(2011, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2011).getDayOfWeek()));
		assertTrue(LocalDate.of(2012, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2012).getDayOfWeek()));
		assertTrue(LocalDate.of(2013, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2013).getDayOfWeek()));
		assertTrue(LocalDate.of(2014, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2014).getDayOfWeek()));
		assertTrue(LocalDate.of(2015, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2015).getDayOfWeek()));
		assertTrue(LocalDate.of(2016, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2016).getDayOfWeek()));
		assertTrue(LocalDate.of(2017, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2017).getDayOfWeek()));
		assertTrue(LocalDate.of(2018, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2018).getDayOfWeek()));
		assertTrue(LocalDate.of(2019, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2019).getDayOfWeek()));
		assertTrue(LocalDate.of(2020, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasEve(2020).getDayOfWeek()));
		
		assertFalse(LocalDate.of(2010, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2010).getDayOfWeek()));
		assertFalse(LocalDate.of(2011, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2011).getDayOfWeek()));
		assertFalse(LocalDate.of(2012, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2012).getDayOfWeek()));
		assertFalse(LocalDate.of(2013, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2013).getDayOfWeek()));
		assertFalse(LocalDate.of(2014, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2014).getDayOfWeek()));
		assertFalse(LocalDate.of(2015, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2015).getDayOfWeek()));
		assertFalse(LocalDate.of(2016, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2016).getDayOfWeek()));
		assertFalse(LocalDate.of(2017, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2017).getDayOfWeek()));
		assertFalse(LocalDate.of(2018, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2018).getDayOfWeek()));
		assertFalse(LocalDate.of(2019, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2019).getDayOfWeek()));
		assertFalse(LocalDate.of(2020, 12, 23).getDayOfWeek().equals(ChristianHolidays.christmasEve(2020).getDayOfWeek()));
	}
	
	@Test
	public void testChristmasEveObserved() {
		assertTrue(LocalDate.of(2010, 12, 24).equals(ChristianHolidays.christmasEveObserved(2010)));
		assertTrue(LocalDate.of(2011, 12, 23).equals(ChristianHolidays.christmasEveObserved(2011)));
		assertTrue(LocalDate.of(2012, 12, 24).equals(ChristianHolidays.christmasEveObserved(2012)));
		assertTrue(LocalDate.of(2013, 12, 24).equals(ChristianHolidays.christmasEveObserved(2013)));
		assertTrue(LocalDate.of(2014, 12, 24).equals(ChristianHolidays.christmasEveObserved(2014)));
		assertTrue(LocalDate.of(2015, 12, 24).equals(ChristianHolidays.christmasEveObserved(2015)));
		assertTrue(LocalDate.of(2016, 12, 23).equals(ChristianHolidays.christmasEveObserved(2016)));
		assertTrue(LocalDate.of(2017, 12, 25).equals(ChristianHolidays.christmasEveObserved(2017)));
		assertTrue(LocalDate.of(2018, 12, 24).equals(ChristianHolidays.christmasEveObserved(2018)));
		assertTrue(LocalDate.of(2019, 12, 24).equals(ChristianHolidays.christmasEveObserved(2019)));
		assertTrue(LocalDate.of(2020, 12, 24).equals(ChristianHolidays.christmasEveObserved(2020)));
		
		assertFalse(LocalDate.of(2010, 12, 1).equals(ChristianHolidays.christmasEveObserved(2010)));
		assertFalse(LocalDate.of(2011, 12, 1).equals(ChristianHolidays.christmasEveObserved(2011)));
		assertFalse(LocalDate.of(2012, 12, 1).equals(ChristianHolidays.christmasEveObserved(2012)));
		assertFalse(LocalDate.of(2013, 12, 1).equals(ChristianHolidays.christmasEveObserved(2013)));
		assertFalse(LocalDate.of(2014, 12, 1).equals(ChristianHolidays.christmasEveObserved(2014)));
		assertFalse(LocalDate.of(2015, 12, 1).equals(ChristianHolidays.christmasEveObserved(2015)));
		assertFalse(LocalDate.of(2016, 12, 1).equals(ChristianHolidays.christmasEveObserved(2016)));
		assertFalse(LocalDate.of(2017, 12, 1).equals(ChristianHolidays.christmasEveObserved(2017)));
		assertFalse(LocalDate.of(2018, 12, 1).equals(ChristianHolidays.christmasEveObserved(2018)));
		assertFalse(LocalDate.of(2019, 12, 1).equals(ChristianHolidays.christmasEveObserved(2019)));
		assertFalse(LocalDate.of(2020, 12, 1).equals(ChristianHolidays.christmasEveObserved(2020)));
	}
	
	@Test
	public void testChristmasDay() {
		assertTrue(LocalDate.of(2010, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2010).getDayOfWeek()));
		assertTrue(LocalDate.of(2011, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2011).getDayOfWeek()));
		assertTrue(LocalDate.of(2012, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2012).getDayOfWeek()));
		assertTrue(LocalDate.of(2013, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2013).getDayOfWeek()));
		assertTrue(LocalDate.of(2014, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2014).getDayOfWeek()));
		assertTrue(LocalDate.of(2015, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2015).getDayOfWeek()));
		assertTrue(LocalDate.of(2016, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2016).getDayOfWeek()));
		assertTrue(LocalDate.of(2017, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2017).getDayOfWeek()));
		assertTrue(LocalDate.of(2018, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2018).getDayOfWeek()));
		assertTrue(LocalDate.of(2019, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2019).getDayOfWeek()));
		assertTrue(LocalDate.of(2020, 12, 25).getDayOfWeek().equals(ChristianHolidays.christmasDay(2020).getDayOfWeek()));
		
		assertFalse(LocalDate.of(2010, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2010).getDayOfWeek()));
		assertFalse(LocalDate.of(2011, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2011).getDayOfWeek()));
		assertFalse(LocalDate.of(2012, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2012).getDayOfWeek()));
		assertFalse(LocalDate.of(2013, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2013).getDayOfWeek()));
		assertFalse(LocalDate.of(2014, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2014).getDayOfWeek()));
		assertFalse(LocalDate.of(2015, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2015).getDayOfWeek()));
		assertFalse(LocalDate.of(2016, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2016).getDayOfWeek()));
		assertFalse(LocalDate.of(2017, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2017).getDayOfWeek()));
		assertFalse(LocalDate.of(2018, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2018).getDayOfWeek()));
		assertFalse(LocalDate.of(2019, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2019).getDayOfWeek()));
		assertFalse(LocalDate.of(2020, 12, 24).getDayOfWeek().equals(ChristianHolidays.christmasDay(2020).getDayOfWeek()));
	}
	
	@Test
	public void testChristmasDayObserved() {
		assertTrue(LocalDate.of(2010, 12, 24).equals(ChristianHolidays.christmasDayObserved(2010)));
		assertTrue(LocalDate.of(2011, 12, 26).equals(ChristianHolidays.christmasDayObserved(2011)));
		assertTrue(LocalDate.of(2012, 12, 25).equals(ChristianHolidays.christmasDayObserved(2012)));
		assertTrue(LocalDate.of(2013, 12, 25).equals(ChristianHolidays.christmasDayObserved(2013)));
		assertTrue(LocalDate.of(2014, 12, 25).equals(ChristianHolidays.christmasDayObserved(2014)));
		assertTrue(LocalDate.of(2015, 12, 25).equals(ChristianHolidays.christmasDayObserved(2015)));
		assertTrue(LocalDate.of(2016, 12, 26).equals(ChristianHolidays.christmasDayObserved(2016)));
		assertTrue(LocalDate.of(2017, 12, 25).equals(ChristianHolidays.christmasDayObserved(2017)));
		assertTrue(LocalDate.of(2018, 12, 25).equals(ChristianHolidays.christmasDayObserved(2018)));
		assertTrue(LocalDate.of(2019, 12, 25).equals(ChristianHolidays.christmasDayObserved(2019)));
		assertTrue(LocalDate.of(2020, 12, 25).equals(ChristianHolidays.christmasDayObserved(2020)));
		
		assertFalse(LocalDate.of(2010, 12, 1).equals(ChristianHolidays.christmasDayObserved(2010)));
		assertFalse(LocalDate.of(2011, 12, 1).equals(ChristianHolidays.christmasDayObserved(2011)));
		assertFalse(LocalDate.of(2012, 12, 1).equals(ChristianHolidays.christmasDayObserved(2012)));
		assertFalse(LocalDate.of(2013, 12, 1).equals(ChristianHolidays.christmasDayObserved(2013)));
		assertFalse(LocalDate.of(2014, 12, 1).equals(ChristianHolidays.christmasDayObserved(2014)));
		assertFalse(LocalDate.of(2015, 12, 1).equals(ChristianHolidays.christmasDayObserved(2015)));
		assertFalse(LocalDate.of(2016, 12, 1).equals(ChristianHolidays.christmasDayObserved(2016)));
		assertFalse(LocalDate.of(2017, 12, 1).equals(ChristianHolidays.christmasDayObserved(2017)));
		assertFalse(LocalDate.of(2018, 12, 1).equals(ChristianHolidays.christmasDayObserved(2018)));
		assertFalse(LocalDate.of(2019, 12, 1).equals(ChristianHolidays.christmasDayObserved(2019)));
		assertFalse(LocalDate.of(2020, 12, 1).equals(ChristianHolidays.christmasDayObserved(2020)));
	}
	
}
