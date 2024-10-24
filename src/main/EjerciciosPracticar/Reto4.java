package EjerciciosPracticar;

public class Reto4 {
    public static int maximo(int [] numeros) {

        int mayor = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];

            }

        }
        return mayor;
    }


    public static void main(String[] args) {

        int [] numeros = {2, 5, 7, 8, 3, 90, 120, 1, 15, 22};

        int mayor = maximo(numeros);

        System.out.println("El mayor número es " +mayor);


    }
}
