package Assignment;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PersonAge3_7 {

	

	

		public static long days(LocalDate today, LocalDate birthday) {
			Period p = Period.between(birthday, today);
			long p2 = p.getDays();
			return p2;
		}

		public static long month(LocalDate today, LocalDate birthday) {
			Period p = Period.between(birthday, today);
			long month = p.getMonths();

			return month;
		}

		public static long year(LocalDate today, LocalDate birthday) {
			Period p = Period.between(birthday, today);
			long year = p.getYears();

			return year;
		}

		public static void main(String[] args) {

			LocalDate today = LocalDate.now();

			LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
			System.out.println("Age of the person in year,month and date is:");
			System.out.println("year " + year(today, birthday));
			System.out.println("month " + month(today, birthday));
			System.out.println("days " + days(today, birthday));
		}
	}


