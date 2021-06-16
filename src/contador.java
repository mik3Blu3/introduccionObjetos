package src;
public class contador
{
    private int contador;
    //CONSTRUCTOR CON PARAMETRO
    public contador(int cont)
    {
        this.contador = cont;
    }
    //constructor vacio
    public contador()
    {

    }
    //metodo que permite obtener el contador
    public int getContador()
    {
        return contador;
    }
    //metodo que permite enviar para almacenar un contador
    public void setContador(int contadorAlmacenado)
    {
        contador = contadorAlmacenado;
    }
    //permite devolver el contador incrementado en 1 
    public int getDecremento()
    {
        return contador-1;
    }
    //metodo que permite devolver el contador decrementado;
    public int getIncremento()
    {
        return contador+1;
    }

}