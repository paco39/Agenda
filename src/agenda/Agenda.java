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
       contactos=new ArrayList<Contacto>();         //Se crea la lista de contactos
    }
    public void registrarContacto(){
        Scanner teclado = new Scanner(System.in);
        String nombreContacto, fecha_nacimientoContacto,ocupacionContacto,direccionContacto;
        
        Contacto contacto= new Contacto();          //Se crea un objeto de tipo Contacto
                                                    //Para almacenarlo en la lista
        System.out.println("Nombre: ");
        nombreContacto= teclado.nextLine();
        contacto.setNombre(nombreContacto);
        
        System.out.println("Fecha de nacimiento: ");
        fecha_nacimientoContacto= teclado.nextLine();
        contacto.setFechaNacimiento(fecha_nacimientoContacto);  //Se leen los datos del Contacto
        
        System.out.println("Ocupacion: ");
        ocupacionContacto= teclado.nextLine();
        contacto.setOcupacion(ocupacionContacto);
        
        System.out.println("Direccion: ");
        direccionContacto= teclado.nextLine();
        contacto.setDireccion(direccionContacto);
        
        contacto.registrarTelefonos();                          //Se piden los telefonos
        contacto.registrarRedesSociales();                      //Y redes sociales
        
        contactos.add(contacto); 
       
    }
    public void buscarContacto(){
        boolean realizarBusqueda=true;
        int opcionBusqueda;
        String nombreContacto;
        while(realizarBusqueda==true){
            System.out.println("Cómo desea buscar al contacto");
            System.out.println("1.- Buscar por nombre");
            System.out.println("2.- buscar por ocupacion");
            System.out.println("3.- Buscar por fecha de nacimiento");
            System.out.println("4.-Salir");
            Scanner in = new Scanner(System.in);
            opcionBusqueda=in.nextInt();
            switch(opcionBusqueda){
            case 1:
                System.out.println("Ingrese el nombre del contacto");
                nombreContacto=in.next();
                for( int i = 0 ; i  < contactos.size(); i++){
                    System.out.println("---");
                    if(contactos.get(i).getNombre()==nombreContacto){
                        System.out.println("-------------------------------------");
                        System.out.println("Contacto "+(i+1));
                        System.out.println("Nombre: "+contactos.get(i).getNombre());
                        System.out.println("Direccion: "+contactos.get(i).getDireccion());
                        System.out.println("Fecha de Nacimiento: "+contactos.get(i).getFechaNacimiento());
                        System.out.println("Ocupacion: "+contactos.get(i).getOcupacion());
                        contactos.get(i).mostrarTelefonos();
                        contactos.get(i).mostrarRedesSociales();
                    }                        
                }   
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                realizarBusqueda=false;
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        }
    }
    public void eliminarContacto(){
      
    }
    public void editarContacto(){
    }
    public int tamanoLista(){                                   //Función que regresa el numero de 
        int x=0;                                                //contactos guardados en la agenda
        x=contactos.size();
        return x;
    }
    public void mostrarContactos(){                             //Funcion que imprime los datos de cada contacto
        for(int i=0;i<tamanoLista();i++){
            System.out.println("-------------------------------------");
            System.out.println("Contacto "+(i+1));
            System.out.println("Nombre: "+contactos.get(i).getNombre());
            System.out.println("Direccion: "+contactos.get(i).getDireccion());
            System.out.println("Fecha de Nacimiento: "+contactos.get(i).getFechaNacimiento());
            System.out.println("Ocupacion: "+contactos.get(i).getOcupacion());
            contactos.get(i).mostrarTelefonos();
            contactos.get(i).mostrarRedesSociales();
        }
    }
    public static void main(String[] args) {
        Agenda miAgenda;
        boolean boleano=true;
        int x;
        
        miAgenda= new Agenda();
        Scanner in = new Scanner(System.in);
        while(boleano==true){
        System.out.println("1.- Agreagar contacto");
        System.out.println("2.- Eliminar contacto");
        System.out.println("3.- Mostrar contactos");
        System.out.println("4.- Buscar contactos");
        System.out.println("5.-Salir");
        x=in.nextInt();
        switch(x){
            case 1:
                miAgenda.registrarContacto();
                break;
            case 2:
                break;
            case 3:
                miAgenda.mostrarContactos();
                break;
            case 4:
                miAgenda.buscarContacto();
                break;
            case 5:
                boleano=false;
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        }       
    }

}
