package EjerciciosPracticar;

import java.util.Scanner;

public class Reto2 {

    public static char letraDNI(int DNI){

        final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = DNI % 23;
        char letra = letras[resto];
        return letra;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un DNI");
        int DNI = sc.nextInt();
        char letraDNI = letraDNI(DNI);

        System.out.println(letraDNI);




    }
}
