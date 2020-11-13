package test;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test003 {

	public static void main(String[] args) {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}

}
