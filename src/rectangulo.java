package src;

public class rectangulo {
    private int largoRectangulo;
    private int anchoRectangulo;
    private int areaRectangulo;
    private int perimetroRectangulo;

    public rectangulo(int largo, int ancho) {
        this.largoRectangulo = largo;
        this.anchoRectangulo = ancho;
    }

    // metodo que permite retornar el largo
    public int getLargoRectangulo() {
        return largoRectangulo;
    }

    // metodo que permite retornar el ancho
    public int getAnchoRectangulo() {
        return anchoRectangulo;
    }
    //metodo que permite enviar ancho del rectangulo
    public void setAnchoRectangulo(int anchoR)
    {
        this.anchoRectangulo = anchoR;
    }
    //metodo que permite enviar el largo del rectangulo
    public void setLargoRectangulo(int largoR)
    {
        this.largoRectangulo = largoR;
    }

    // metodo que permite realizar el calculo del area del rectangulo y devolverlo
    public int getAreaRectangulo() {
        this.areaRectangulo = (getAnchoRectangulo() * getLargoRectangulo());
        return areaRectangulo;
    }

    // metodo que permiete realizar el calculo del perimetro del rectangulo y
    // permite devolverlo
    public int getPerimetroRectangulo() {
        this.perimetroRectangulo = 2 * (getAnchoRectangulo() + getLargoRectangulo());
        return perimetroRectangulo;
    }
}
