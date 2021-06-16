package src;

import java.util.Scanner;

public class ejercicios{
        // declarando nuestro scanner para leer info en pantalla
        static Scanner entrada = new Scanner(System.in);

        public static void main(String args[]) {
                ejercicios p1 = new ejercicios();
        }

        public ejercicios() {
                System.out.println("BIENVENIDO!!! Ingrese el numero de ejercicio que desea ejecutar! (1-8) ó 9 = Salir!");
                int opcion = entrada.nextInt();
                entrada.skip("\n");
                switch (opcion) {
                        case 1:
                                System.out.println("MOSTRAREMOS EL EJERCICIO1 ");
                                System.out.println("");
                                System.out.println("Ingrese el numero que servira como contador para incrementarlo");
                                int contadorAux = entrada.nextInt();
                                // inicializando un nuevo objeto de la clase contador
                                contador contador1 = new contador(contadorAux);
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
                                break;
                        case 2:
                                System.out.println("MOSTRAMOS EL EJERCICIO2 ");
                                System.out.println("Ingrese el lado del cuadrado porfavor! ");
                                int ladoAux = entrada.nextInt();
                                // inicializando un nuevo objeto de la clase cuadrado
                                cuadrado cuadrado1 = new cuadrado(ladoAux);
                                System.out.println("La longitud del lado que ingreso es: ");
                                System.out.println(cuadrado1.getLado() + " U ");
                                System.out.println("");
                                System.out.println("El area del cuadrado es: ");
                                // haciendo uso del metodo de nuestro objeto que nos permite calcular el area
                                // del cuadrado
                                cuadrado1.calcularArea();
                                // mostrando el area almacenado en nuestro atributo
                                System.out.println(cuadrado1.getArea() + " U^2");
                                System.out.println("");
                                System.out.println("El perimetro del cuadrado es: ");
                                // haciendo uso del metodo que nos permite calcular el perimetro del cuadrado
                                cuadrado1.calcularPerimetro();
                                // mostrando el perimetro almacenado en nuestro atributo
                                System.out.println(cuadrado1.getPerimetro() + " U ");
                                System.out.println("");
                                break;
                        case 3:
                                System.out.println("MOSTRAREMOS EL EJERCICIO3");
                                System.out.println("Ingrese el radio del circulo: ");
                                double radioCirculoAux = entrada.nextDouble();
                                // inicializando el objeto de tipo circulo
                                circulo circulo1 = new circulo(radioCirculoAux);
                                System.out.println("El radio que ingreso fue: ");
                                System.out.println(circulo1.getRadio() + " U ");
                                System.out.println("");
                                System.out.println("El area es de: ");
                                System.out.println(circulo1.getAreaCirculo() + " U^2 ");
                                System.out.println("");
                                System.out.println("El perimetro del circulo es de : ");
                                System.out.println(circulo1.getPerimetroCirculo() + " U ");
                                System.out.println("");
                                break;
                        case 4:
                                System.out.println("MOSTRAREMOS EL EJERCICIO4 ");
                                System.out.println("Ingrese el largo del rectangulo: ");
                                int largoRectanguloAux = entrada.nextInt();
                                System.out.println("Ingrese el ancho del rectangulo: ");
                                int anchoRectanguloAux = entrada.nextInt();
                                // corroborando que las dimensiones no sean las mismas
                                if (largoRectanguloAux != anchoRectanguloAux) {
                                        // creando el objeto de tipo rectangulo
                                        rectangulo rectangulo1 = new rectangulo(largoRectanguloAux, anchoRectanguloAux);
                                        System.out.println("El area del rectangulo con dimensiones: ancho "+ rectangulo1.getAnchoRectangulo() + " Y largo "+ rectangulo1.getLargoRectangulo() + " Es: ");
                                        // utilizando el metodo del objeto que nos permite calcular el area del
                                        // rectangulo
                                        System.out.println(rectangulo1.getAreaRectangulo() + " U^2 ");
                                        System.out.println("El perimetro del rectangulo con las mismas dimensiones es de: ");
                                        // usando el metodo del objeto que nos permite calcular el perimetro del
                                        // rectangulo
                                        System.out.println(rectangulo1.getPerimetroRectangulo() + " U ");
                                        System.out.println("");
                                } else if (largoRectanguloAux == anchoRectanguloAux) {
                                        System.out.println("Corrobore las dimensiones nos indica que es un cuadrado ya que las dimensiones son las mismas!!! ");
                                        System.out.println("");
                                }
                                break;
                        case 5:
                                break;
                        case 6:
                                System.out.println("MOSTRAREMOS EL EJERCICIO5 ");
                                System.out.println("Primero ingrese los datos para la creacion del libro! ");
                                System.out.println("Ingrese el id que desee asignarle: ");
                                int auxID = entrada.nextInt();
                                entrada.skip("\n");
                                System.out.println("Ingrese el nombre del libro: ");
                                String auxNombre = entrada.nextLine();
                                System.out.println("Ingrese la disponibilidad del libro: (true/false) ");
                                boolean auxDisponibilidad = entrada.nextBoolean();
                                //creando el objeto libro
                                libro lib1 = new libro(auxID, auxNombre, auxDisponibilidad);
                                System.out.println("LA INFORMACION ACTUAL ALMACENADA DEL LIBRO ES: ");
                                System.out.println(lib1);
                                System.out.println("a continuacion lo prestaremos!!! ");
                                System.out.println("");
                                //invocando al metodo del objeto para prestamo
                                 lib1.prestamoLibro(lib1);
                                 System.out.println("la info actual de libro  y su disponibilidad es: ");
                                 System.out.println(lib1);
                                System.out.println(" a continuacion lo devolveremos!! ");
                                System.out.println("");
                                lib1.devolucionLibro(lib1);
                                System.out.println("La info actual del libro y su disponibilidad es: ");
                                System.out.println(lib1);
                                System.out.println("");
                                break;
                        case 7:
                                break;
                        case 8:
                                break;
                        case 9:
                                System.out.println("ELIGIO SALIR!");
                        break;
                        default:
                                System.out.println("INGRESE UNA OPCION CORRECTA!!! ");
                                break;
                }

        }
}