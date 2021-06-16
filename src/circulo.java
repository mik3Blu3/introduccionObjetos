package src;

public class circulo {
    // atributos
    private double radioCirculo;
    private double areaCirculo;
    private double perimetroCirculo;

    public circulo(double radio) {
        this.radioCirculo = radio;
    }

    // metodo que permite retornar el radio
    public double getRadio() {
        return radioCirculo;
    }

    // metodo que permite cambiar el valor del radio
    public void setRadio(int radioC) {
        this.areaCirculo = radioC;
    }

    // metodo que permite calcular el area
    public double getAreaCirculo() {
        this.areaCirculo = Math.PI * getRadio() * getRadio();
        return areaCirculo;
    }

    // metodo que permite calcular el perimetro del circulo
    public double getPerimetroCirculo() {
        this.perimetroCirculo = 2 * Math.PI * getRadio();
        return perimetroCirculo;
    }
}
