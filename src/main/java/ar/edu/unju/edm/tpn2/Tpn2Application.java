package ar.edu.unju.edm.tpn2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tpn2Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String test = scanner.nextLine();
		System.out.println("test: " + test);

		SpringApplication.run(Tpn2Application.class, args);
	}

}
