package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point7 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int year;
		
		System.out.println("Ingrese año: ");
		year = scanner.nextInt();
		if( ( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0) ) {
			System.out.println("El año " + year + " es bisiesto");
		}else {
			System.out.println("El año " + year + " no es bisiesto");
		}
		
	}

}
