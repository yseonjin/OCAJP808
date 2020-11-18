package test;

import java.time.LocalDate;
public class Test105 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012,  01,  32);
		date.plusDays(10);
		System.out.println(date);
		
		LocalDate date2 = date.plusDays(10);
		System.out.println(date2);

	}

}
