package EjerciciosPracticar;

public class Reto7 {
    public static int Pares(int [] numeros){

        int cantidadPares = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0){

                cantidadPares++;

            }


        }

        return cantidadPares;

    }

    public static int Impares(int [] numeros){

        int cantidadImpares = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 1){

                cantidadImpares++;

            }


        }

        return cantidadImpares;



    }


    public static void main(String[] args) {

        int [] numeros = {1, 3, 5, 7, 9, 11, 2, 4, 6, 8};

        int pares = Pares(numeros);
        int impares = Impares(numeros);

        System.out.println("Hay " + pares + " pares, " + impares + " impares");


    }
}
