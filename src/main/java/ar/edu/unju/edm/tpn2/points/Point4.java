package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		byte r;
		
		System.out.println("Ingrese el valor del radio: ");
		r = scanner.nextByte();
		System.out.println("El valor del area es: " + ( Math.PI * Math.pow(r, 2) ));
		
	}

}
