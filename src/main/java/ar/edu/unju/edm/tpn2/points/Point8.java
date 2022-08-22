package ar.edu.unju.edm.tpn2.points;

public class Point8 {
    public static void main(String[] args) {
        int a = 7, b = 5, c = -14;

        System.out.println("a: " + ((a > 3) ? "Verdadero" : "Falso"));

        System.out.println("b: " + ((a > c) ? "Verdadero" : "Falso"));

        System.out.println("c: " + ((a < c) ? "Verdadero" : "Falso"));

        System.out.println("d: " + ((b < c) ? "Verdadero" : "Falso"));

        System.out.println("e: " + ((b != c) ? "Verdadero" : "Falso"));

        System.out.println("f: " + ((a == 3) ? "Verdadero" : "Falso"));

        System.out.println("g: " + ((a * b == 15) ? "Verdadero" : "Falso"));

        System.out.println("h: " + ((a * b == -30) ? "Verdadero" : "Falso"));

        System.out.println("i: " + ((c / b < a) ? "Verdadero" : "Falso"));

        System.out.println("j: " + ((c / b == -10) ? "Verdadero" : "Falso"));

        System.out.println("k: " + ((c / b == -4) ? "Verdadero" : "Falso"));

        System.out.println("l: " + ((a + b + c == 5) ? "Verdadero" : "Falso"));

        System.out.println("m: " + (((a + b == 8) && (a - b == 2)) ? "Verdadero" : "Falso"));

        System.out.println("n: " + (((a + b == 8) || (a - b == 6)) ? "Verdadero" : "Falso"));

        System.out.println("o: " + ((a > 3 && b > 3 && c < 3) ? "Verdadero" : "Falso"));

        System.out.println("p: " + ((a > 3 && b >= 3 && c < -3) ? "Verdadero" : "Falso"));

    }
}

/*
 * a) a > 3
 * b) a > c
 * c) a < c
 * d) b < c
 * e) b != c
 * f) a == 3
 * g) a * b == 15
 * h) a * b == -30
 * i) c / b < a
 * j) c / b == -10
 * k) c / b == -4
 * l) a + b + c == 5
 * m) (a+b == 8 ) && (a-b == 2)
 * n) (a+b == 8 ) || (a-b == 6)
 * o) a > 3 && b > 3 && c < 3
 * p) a > 3 && b >= 3 && c < -3
 * 
 */