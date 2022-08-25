package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.println("Ingrese un numero para n: ");
		n = scanner.nextInt();
		System.out.println("El resultado es: " + (int) Math.pow((n*(n+1)/2), 2));
		
		scanner.close();
	}
	
}
