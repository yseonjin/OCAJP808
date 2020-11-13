package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test016 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		System.out.println(dt.plusDays(30));
		System.out.println(dt.plusMonths(1));
		System.out.println("");
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

	}

}
