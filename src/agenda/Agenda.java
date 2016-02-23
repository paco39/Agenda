/* Autores: Francisco Miranda y Renato Vargas
    Archivo: Agenda.java
    Descripción: Este programa permite al usuario tener un registro
                 de sus contactos.
    Fecha: 16/02/2016
*/
package agenda;
import java.util.Scanner;
import java.util.ArrayList;
public class Agenda {
    ArrayList<Contacto> contactos;
    Agenda(){
       
    }
    public void registrarContacto(){
       
    }
    public void eliminarContacto(){
       
    }
    public void editarContacto(){
       
    }
    public static void main(String[] args) {
        Agenda miAgenda;
        miAgenda= new Agenda();
        Scanner in = new Scanner(System.in);
        Contacto miContacto;
        miContacto= new Contacto();
        String nombreContacto, fecha_nacimientoContacto,ocupacionContacto,direccionContacto,paginaWebContacto;
       
        System.out.println("ingresa nombre contacto");
        nombreContacto  = in.next();
        miContacto.setNombre(nombreContacto);
       
        System.out.println("ingresa la fecha de nacimiento del contacto (dd/mm/aaaa");
        fecha_nacimientoContacto = in.next();
        miContacto.setFechaNacimiento(fecha_nacimientoContacto);
       
        System.out.println("ingresa la ocupacion del contacto");
        ocupacionContacto = in.next();
        miContacto.setOcupacion(ocupacionContacto);
       
        System.out.println("ingresa la direccion del contacto");
        direccionContacto = in.next();
        miContacto.setDireccion(direccionContacto);
       
        System.out.println("ingresa la pagina web del contacto");
        paginaWebContacto = in.next();
        miContacto.setPaginaWeb(paginaWebContacto);
       
       
       
       
       
       
    }
   
}
