package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[5];

        for (int i = 0; i < array.length; ++i) {

            System.out.println("\nIngrese un nombre: ");
            array[i] = scanner.nextLine();

        }

        System.out.println("\nValores en el arreglo: ");

        for (int i = 0; i < array.length; ++i) {
            System.out.println(" [" + i + "]: " + array[i]);
        }

        System.out.println("\nIngresa el indice de donde quieres que se elimine el valor: ");
        int index = scanner.nextInt();

        for (int i = index; i < array.length - 1; ++i) {
            array[i] = array[i + 1];
        }

        if (index == array.length - 1)
            array[index] = array[index - 1];

        System.out.println("\nValores en el arreglo despues de eliminar el valor: ");

        for (int i = 0; i < array.length; ++i) {
            System.out.println(" [" + i + "]: " + array[i]);
        }
        scanner.close();
    }
}