public class Main {
    public static void main(String[] args) {
        int result = 0;
        result = suma(20,30);
        System.out.println(result);
        sumaVoid(50,60);

        Potato miPotato = new Potato();
        miPotato.quitarBrazo();
        miPotato.quitarBrazo();
        miPotato.quitarBrazo();
        miPotato.quitarBrazo();
        System.out.println(miPotato.brazos);
    }

    public static int suma (int a, int b){
        return a + b;
    }
    public static void sumaVoid (int a, int b){
        int result = a + b;
        System.out.println(result);
    }
}

class Potato{
    public int brazos = 2;
    public void quitarBrazo(){
        this.brazos--;
    }
}