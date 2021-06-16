package src;

public class libro {
    //atributos
    private int id;
    private String nombre;
    private boolean disponibilidad;
     public libro(int idLibro, String nombreLibro, boolean dispoLibro)
     {
        this.id = idLibro;
        this.nombre = nombreLibro;
        this.disponibilidad = dispoLibro;
     }

     //metodo que permite retornar el id 
     public int getIdLibro()
     {
         return id;
     }
     //metodo que permite almacenar el id
     public void setId(int idNuevo)
     {  
        this.id = idNuevo;
     }
     //metodo que permite retornar el Nombre
     public String getNombreLibro()
     {
         return nombre;
     }
     //metodo que permite cambiar el nombre del libro
     public void setNombreLibro(String nombreNuevoLibro)
     {
        this.nombre = nombreNuevoLibro;
     }
     //metodo que permite retornar el estado de disponibilidad del libro
     public boolean getDispoLibro()
     {
         return disponibilidad;
     }
     //metodo que permite almacenar la disponibilidad del libro
     public void setDispoLibro(boolean estadoLibro)
     {
        this.disponibilidad = estadoLibro;
     }
     //permite realizar el prestamo del objeto en cuestion de tipo libro
     public void prestamoLibro(libro lib1)
     {
         System.out.println("Bienvenido al sistema de prestamos");
         System.out.println("El libro que desea prestar es: ");
         System.out.println(lib1);
         System.out.println("Realizaremos la transaccion!");
         lib1.setDispoLibro(false);
         System.out.println("Transaccion realizada!! ");
     }
     //permite realizar la devolucion del libro
     public void devolucionLibro(libro lib1)
     {
         System.out.println("Bienvenido al sistema de devolucion! ");
         System.out.println("El libro que desea devolver es: ");
         System.out.println(lib1);
         System.out.println("Realizaremos la devolucion");
         lib1.setDispoLibro(true);
         System.out.println("Transaccion realizada!! ");
     }
     //sobre escribe el metodo to String para mostrar nuestros objetos
     @Override
     public String toString() {
         return "Id del Libro: "+id+" Nombre del Libro: "+nombre+" Disponibilidad: "+disponibilidad;
     }

}
