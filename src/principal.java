package src;
import java.util.Scanner;
public class principal
{   
    //declarando nuestro scanner para leer info en pantalla
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {   
        principal p1 = new principal();
    }

    public principal()
    {
        System.out.println("MOSTRAREMOS EL EJERCICIO1 ");
        System.out.println("");
        System.out.println("Ingrese el numero que servira como contador para incrementarlo");
        int contadorAux = entrada.nextInt();
        //inicializando un nuevo objeto de la clase contador
        contador contador1  = new contador(contadorAux);
        System.out.println("");
        System.out.println("El contador a incrementar es :");
        System.out.println(contador1.getContador());
        System.out.println("");
        System.out.println("El contador incrementado es : ");
        System.out.println(contador1.getIncremento());
        System.out.println("");
        System.out.println("El contador decrementado es : ");
        System.out.println(contador1.getDecremento());
        System.out.println("");
        System.out.println("MOSTRAMOS EL EJERCICIO2 ");
        System.out.println("Ingrese el lado del cuadrado porfavor! ");
        int ladoAux = entrada.nextInt();
        //inicializando un nuevo objeto de la clase cuadrado
        cuadrado cuadrado1 = new cuadrado(ladoAux);
        System.out.println("La longitud del lado que ingreso es: ");
        System.out.println(cuadrado1.getLado()+" U ");
        System.out.println("");
        System.out.println("El area del cuadrado es: ");
        //haciendo uso del metodo de nuestro objeto que nos permite calcular el area del cuadrado 
        cuadrado1.calcularArea();
        System.out.println("");
        //mostrando el area almacenado en nuestro atributo
        System.out.println(cuadrado1.getArea()+" U^2");
        System.out.println("");
        System.out.println("El perimetro del cuadrado es: ");
        //haciendo uso del metodo que nos permite calcular el perimetro del cuadrado
        cuadrado1.calcularPerimetro();
        //mostrando el perimetro almacenado en nuestro atributo
        System.out.println(cuadrado1.getPerimetro()+" U ");
        System.out.println(""); 
    }
}