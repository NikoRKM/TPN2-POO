package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point10 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; ++i){

            System.out.println("Enter an age: ");
            int age = scanner.nextInt();

            if(age >= 1 && age <= 12) System.out.println("Is a kid\n");
            else if(age >= 13 && age <= 20) System.out.println("Is a youth\n");
            else if(age >= 21 && age <= 100) System.out.println("Is an adult\n");
            else System.out.println("Wrong input\n");
        }
    }
}
