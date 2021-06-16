package src;

public class cuadrado {
    private int ladoCuadrado;
    private int areaCuadrado;
    private int perimetroCuadrado;

    public cuadrado(int cuadradoLado) {
        this.ladoCuadrado = cuadradoLado;
    }

    // metodo que permite retornar el lado del cuadrado
    public int getLado() {
        return ladoCuadrado;
    }

    // permite cambiar y almacenar el lado del cuadrado
    public void setLadoCuadrado(int ladoC) {
        ladoCuadrado = ladoC;
    }

    // metodo que permite retornar el area
    public int getArea() {
        return areaCuadrado;
    }

    // metodo que permite retornar el perimetro
    public int getPerimetro() {
        return perimetroCuadrado;
    }

    // metodo que permite calcular el area
    public void calcularArea() {
        this.areaCuadrado = (ladoCuadrado * ladoCuadrado);
    }

    // metodo que permite calcular el perimetro
    public void calcularPerimetro() {
        this.perimetroCuadrado = (4 * ladoCuadrado);
    }
}
