package test;

import java.time.LocalDate;


public class Test073 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 1, 30);
		LocalDate plusdate = date.plusDays(10);
		System.out.println(date);
		System.out.println(plusdate);
	}

}
