package EjerciciosPracticar;

public class Reto5 {
    public static int minimo(int [] numeros) {

        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] < minimo){

                minimo = numeros[i];

            }

        }

        return minimo;

    }

    public static void main(String[] args) {

        int [] numeros = {2, 5, 7, 8, 3, 90, 120, 1, 15, 22};

        int num_minimo = minimo(numeros);

        System.out.println("El número mas pequeño es: " + num_minimo);


    }
}
