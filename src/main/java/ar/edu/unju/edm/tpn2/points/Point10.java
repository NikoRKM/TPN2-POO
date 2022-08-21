package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; ++i) {

            System.out.println("Ingrese una edad: ");
            int age = scanner.nextInt();

            if (age >= 1 && age <= 12)
                System.out.println("Es un niño\n");
            else if (age >= 13 && age <= 20)
                System.out.println("Es un adolescente\n");
            else if (age >= 21 && age <= 100)
                System.out.println("Es un adulto\n");
            else
                System.out.println("Entrada incorrecta\n");
        }
    }
}
