public class Desafio3 {
    public static void main(String[] args) {
        int sumaImp = 0; //define la variable donde se va a guardar la suma de los impares
        while(sumaImp <= 25){ //determina la condición para que se detenga el proceso
            int a = (int) (Math.random()*(10-0+1)+0); //define la variable donde se guarda el valor aleatorio
            if(a%2 == 0){ //si el numero es par lo muestra en pantalla
                System.out.println(a + " es Par"); 
            } else { //si el numero es impar lo muestra en pantalla y lo suma a la variable sumaImp
                System.out.println(a + " es Impar");
                sumaImp = sumaImp + a;
            }
        }
        System.out.println("Suma: " + sumaImp); //se muestra en pantalla el valor de sumaImp
    }
}