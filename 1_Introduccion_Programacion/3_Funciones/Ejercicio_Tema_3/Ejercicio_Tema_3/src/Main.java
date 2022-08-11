/**
 * Consigna
 * Primera parte:
 *  Crear una función con tres parámetros que sean números que se suman entre sí.
 *  Llamar a la función en el main y darle valores.
 * Segunda parte:
 *  Crear una clase coche.
 *  Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 *  Una función que incremente el número de puertas que tiene el coche.
 *  Crear un objeto miCoche en el main y añadirle una puerta.
 *  Mostrar el número de puertas que tiene el objeto.
 *
 */

public class Main {
    public static void main(String[] args) {
        int resultado = suma(4,5,6);
        System.out.println("El Resultado de la Sumas es: " + resultado);
        //Objeto miCoche
        Coche miCoche = new Coche();
        System.out.println("Numero de Puertas sin Incrementar: " + miCoche.puertas);
        //Le sumo una puerta
        miCoche.incrementarPuerta();
        System.out.println("Numero de Puertas luego de  Incrementar: " + miCoche.puertas);
    }

    /**
     * Suma tre numeros
     *
     */
    public static int suma(int num_1, int num_2, int num_3){
        return num_1 + num_2 + num_3;
    }
}


class Coche{
    public int puertas = 5;
    /**
     * Incrementa las cantidad de puertas
     */
    public void incrementarPuerta(){
        this.puertas++;
    }
}