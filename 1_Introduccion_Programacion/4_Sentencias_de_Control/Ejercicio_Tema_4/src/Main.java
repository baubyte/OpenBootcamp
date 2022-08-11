/***
 * En este ejercicio practicarás las estructuras de control, para ello deberás crear:
 *
 *  Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 *  Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 *
 *  Crea un bucle While, este bucle tendrá que tener como condición que la variable
 *  numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
 *  Incrementar el valor de la variable en uno cada vez que se ejecute.
 *  Mostrarlo por pantalla cada vez que se ejecute.
 *
 *  Para el bucle Do While, deberás crear la misma estructura que en el While,
 *  pero solo se debe ejecutar una vez.
 *
 *  Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y
 *  su condición será que la variable sea igual o menor que 3,
 *  se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
 *
 *  Por último, para el Switch, deberás crear la variable estacion, y distintos case
 *  para las cuatro estaciones del año. Dependiendo del valor de la variable
 *  estacion se deberá mandar un mensaje por consola informando de la estación
 *  en la que está. También habrá que poner un default para cuando el valor de la
 *  variable no sea una estación.
 */
public class Main {
    public static void main(String[] args) {
        int numeroIf = -5;
        int numeroWhile = 0;
        String estacion = "Invierno1";

        //Sentencia IF
        if (numeroIf == 0){
            System.out.println("El Numero es Cero: " + numeroIf);
        } else if (numeroIf < 0) {
            System.out.println("El Numero es Negativo: " + numeroIf);
        }else {
            System.out.println("El Numero es Positivo: " + numeroIf);
        }

        //Sentencia While
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("Numero de recorrido While: " + numeroWhile);
        }

        //Sentencia Do While
        do {
            System.out.println("Numero de recorrido Do While: " + numeroWhile);
            numeroWhile = 3;
        }while (numeroWhile < 3);

        //Sentencia For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Numero de recorrido For: " + numeroFor);
        }

        //Sentencia Switch
        switch (estacion){
            case "Otoño":
                System.out.println("Estas en la Estacion: " + estacion);
                break;
            case "Invierno":
                System.out.println("Estas en la Estacion: " + estacion);
                break;
            case "Primavera":
                System.out.println("Estas en la Estacion: " + estacion);
                break;
            case "Verano":
                System.out.println("Estas en la Estacion: " + estacion);
                break;
            default:
                System.out.println("La Estacion no Existe.");
        }
    }
}