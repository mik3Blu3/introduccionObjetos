package src;
public class principal {
    public static void main(String args[])
    {
        principal p1 = new principal();
    }
    public principal()
    {
        //declarando objetos
        contador contador2 = new contador(2);
        cuadrado cuadrado2 = new cuadrado(2);
        circulo circulo2 = new circulo(2);
        rectangulo rectangulo2 = new rectangulo(2, 5);
        libro libro2 = new libro(1,"Calculo de una variable", true);
        fraccion fraccion2 = new fraccion(1, 2, 1, 2);
        //haciendo procesos
        contador cont = contador2;
        cont.setContador(3);
        System.out.println("El contador aumentado es: "+contador2.getIncremento());
        System.out.println("El contador disminuido es: "+cont.getDecremento());
        //demostramos que las dos variables apuntan al mismo objeto
        cuadrado cua = cuadrado2;
        cua.setLadoCuadrado(4);
        System.out.println("El area es: "+cuadrado2.getArea());
        System.out.println("El perimetro es: "+cua.getPerimetro());
        //demostramos que las dos variables apuntan al mismo objeto y espacio en memoria
        circulo circ = circulo2;
        circ.setRadio(4);
        System.out.println("El area del circulo es: "+circulo2.getAreaCirculo());
        System.out.println("El perimetro del circulo es: "+circ.getPerimetroCirculo());
        //demostramos que las dos variables apuntan al mismo objeto
        rectangulo rect = rectangulo2;
        rect.setAnchoRectangulo(3);
        System.out.println("El area del rectangulo es: "+rectangulo2.getAreaRectangulo());
        System.out.println("El perimetro del rectangulo es: "+rect.getPerimetroRectangulo());
        //demostramos que las dos variables apuntan al mismo objeto
        libro lib = libro2;
        lib.setDispoLibro(false);
        System.out.println("La info es: "+libro2);
        //demostramos que las dos variables apuntan al mismo objeto
        fraccion fracc = fraccion2;
        fracc.SetNumerador(2);
        System.out.println("LA SUMA ES: "+fraccion2.sumaFracciones());
        System.out.println("LA RESTA ES: "+fracc.restaFracciones());
        System.out.println("LA MULTIPLICACION ES: "+fraccion2.multiplicacionFracciones());
        System.out.println("LA DIVISION ES: "+fracc.divisionFracciones());
        //demostramos que apuntan al mismo objeto

    }
}
