package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point9 {
	
	public static void main(String args[]) {
		Scanner variable = new Scanner(System.in);
        int numero ;
		for(int contador = 0;contador<5;contador++) {
	        System.out.println("Ingrese un numero:");
	        numero = variable.nextInt();
	
	        if (numero % 2 == 0)
	            System.out.println("El numero es par");
	        else
	            System.out.println("El numero es impar");
	    	}
		variable.close();
	   }
}