package streamApi;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierLogic {
	
	public static void main(String[] args) {
		
		Supplier<LocalDateTime> s = new Supplier<LocalDateTime>() {

			@Override
			public LocalDateTime get() {
				LocalDateTime time = LocalDateTime.now();
				return time;
			}
		};
		
		System.out.println(s.get());
		
		
		
	}

}
