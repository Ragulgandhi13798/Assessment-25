package com.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Localtime {

	public static void main(String[] args) {
		
		//DATE
		
 /*  LocalDate d = LocalDate.now();
   LocalDate d1 = LocalDate.of(1998,8, 9);
   LocalDate d3 = LocalDate.parse("1998-07-13",DateTimeFormatter.ISO_DATE);
   System.out.println(d);
   System.out.println(d1);
   System.out.println(d3);*/
   
      //Add DATEANDTIME
   
   LocalDateTime t = LocalDateTime.now();
   LocalDateTime t1= LocalDateTime.of(1995,1, 9, 7, 45);
   System.out.println(t);
   System.out.println(t1.plusDays(2));
   System.out.println(t1.plusMonths(7));
 
   
   
	}

}
