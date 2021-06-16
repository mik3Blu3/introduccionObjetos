package src;

public class fraccion {
    //atributos
    private int numerador;
    private int denominador;
    private int numerador2;
    private int denominador2;
    private double sumaFraccion;
    private double restaFraccion;
    private double multiplicacionFraccion;
    private double divisionFraccion;
    //constructor
    public fraccion(int num, int den)
    {
        this.numerador = num;
        this.denominador = den;
    }   
    //metodo que permite devolver el numerador
    public int getNumerador()
    {
        return numerador;
    }
    //permite almacenar el numerador
    public void SetNumerador(int numeradorFraccion)
    {
        this.numerador = numeradorFraccion;
    }
    //metodo que permite devolver el denominador
    public int getDenominador()
    {
        return denominador;
    }
    //permite almacenar el denominador 
    public void SetDenominador(int denominadorFraccion)
    {
        this.denominador = denominadorFraccion;
    }
    //metodo que permite devolver el numerador
    public int getNumerador2()
    {
        return numerador2;
    }
    //permite almacenar el numerador
    public void SetNumerador2(int numeradorFraccion2)
    {
        this.numerador2 = numeradorFraccion2;
    }
    //metodo que permite devolver el denominador
    public int getDenominador2()
    {
        return denominador2;
    }
    //permite almacenar el denominador 
    public void SetDenominador2(int denominadorFraccion2)
    {
        this.denominador2 = denominadorFraccion2;
    }
    //metodo que permite retornar la suma de las fracciones
    public double getSumaFraccione()
    {
        return sumaFraccion;
    }
    //metodo que permite retornar la suma de las fracciones
    public double getRestaFraccione()
    {
        return restaFraccion;
    }
    //metodo que permite retornar la suma de las fracciones
    public double getMultiFraccione()
    {
        return multiplicacionFraccion;
    }
    //metodo que permite retornar la suma de las fracciones
    public double getDivFraccione()
    {
        return divisionFraccion;
    }
    //metodo que permite realizar la suma de las fracciones
    public void sumaFracciones(int num, int den, int num2, int den2)
    {
        this.sumaFraccion = (num*den2+num2*den)/den*den2;
    }
     //metodo que permite realizar la resta de las fracciones
    public void restaFracciones(int num, int den, int num2, int den2)
    {
        this.sumaFraccion = (num*den2-num2*den)/den*den2;
    }
    //metodo que permite realizar la multiplicacion de las fracciones
    public void multiplicacionFracciones(int num, int den, int num2, int den2)
    {
        this.multiplicacionFraccion = (num*num2)/den*den2;
    }
    //metodo que permite realizar la division de las fracciones
    public void divisionFracciones(int num, int den, int num2, int den2)
    {
        this.divisionFraccion = (num*den2)/den*num2;
    }
}
