package EjerciciosPracticar;

public class Reto6 {
    public static int Positivos(int [] numeros){

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {

                suma = suma + numeros[i];

            }

        }

        return suma;

    }

    public static int Negativos(int [] numeros){

        int resta = 0;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0) {

                resta = resta + numeros[i];

            }

        }

        return resta;

    }



    public static void main(String[] args) {

        int [] numeros = {1, 15, -7, 22, -12, -5, -1, 10, 9, 5};

        int suma = Positivos(numeros);
        int resta = Negativos(numeros);

        System.out.println("La suma de todos los números positivos es: " + suma);
        System.out.println("La suma de todos los números negativos es: " + resta);


    }
}
