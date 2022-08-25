package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point6 {
		
		public static void main(String args[]) {
			
	        Scanner variable = new Scanner(System.in);
	        String numero,oVariable,variable2;
	        int a=5, b=10, c=2, d=6, resultado = 0,resultado2 = 0;
	        boolean band = true;
	        
	        System.out.println("Operadores a utilizar: ");
	        System.out.println("+= -= *= /=");
	        System.out.println("Ingrese un operador:");
	        numero = variable.next();
	        
	        System.out.println("Variables a utilizar: ");
	        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
	        System.out.println("0) a - 1) b - 2) c - 3) d ");
	        
	        do {
		        System.out.println("Ingrese el primer numero segun la variable a elegir:");
		        oVariable = variable.next();
		        band = true;
		        switch(oVariable) {
			        case "0":
			          resultado=5;
			          break;
			        case "1":
			        	resultado=10;
			          break;
			        case "2":
			        	resultado=2;
			          break;
			        case "3":        		
			        	resultado=6;
			          break;
			        default:
			        	band = false;
			          System.out.println("Ingrese un numero del 0 al 3");
		        }
	        }while(band == false);
	        
	        do { 
	        	System.out.println("Ingrese el segundo numero segun la variable a elegir:");
	            variable2 = variable.next();
	            band = true;
		        switch(variable2) {
			        case "0":
			          resultado2=5;
			          break;
			        case "1":
			        	resultado2=10;
			          break;
			        case "2":
			        	resultado2=2;
			          break;
			         case "3":        		
			        	resultado2=6;
			          break;
			        default:
			          band = false;
			          System.out.println("Ingrese un numero del 0 al 3");
			      }
	        }while(band == false);
	        
	        System.out.println("Resultado: ");
	        switch(numero) {
		        case "+=":
		          resultado += resultado2; 
		          System.out.println(resultado);
		          break;
		        case "-=":
		          resultado -= resultado2; 
			      System.out.println(resultado);
		          break;
		        case "*=":
		          resultado *= resultado2; 
			      System.out.println(resultado);
		          break;
		        case "/=":
		          resultado /= resultado2; 
			      System.out.println(resultado);
		          break;
		      }
		}
}
