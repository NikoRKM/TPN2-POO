package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point12 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        String[] array = new String[5];

        for(int i = 0; i < array.length; ++i){

            System.out.println("\nEnter a name: ");
            array[i] = scanner.nextLine();

        }

        System.out.println("\nValues in the array: ");

        for(int i = 0; i < array.length; ++i){
            System.out.println("[" + i + "]: " + array[i]);
        }

        System.out.println("\nEnter the index from where you want to delete the value: ");
        int index = scanner.nextInt();
        
        for(int i = index; i < array.length - 1; ++i){
            array[i] = array[i+1];
        }

        System.out.println("\nValues in the array after deleting the value: ");

        for(int i = 0; i < array.length - 1; ++i){
            System.out.println("[" + i + "]: " + array[i]);
        }
    }
}