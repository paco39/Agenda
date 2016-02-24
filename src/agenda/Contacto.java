/*
    Descripción de la clase: esta clase almacena los datos
                             de los contactos
*/
package agenda;
import java.util.Scanner;
import java.util.ArrayList;
public class Contacto {
    String Nombre,FechaNacimiento, Ocupacion, Direccion, PaginaWeb;
    ArrayList<Telefono> Telefonos;
    ArrayList<RedSocial> RedesSociales;
    //Constructor
    Contacto(){
        
    }
    public void setNombre(String nombre){
        Nombre=nombre;
    }
    public void setFechaNacimiento(String fecha_nacimiento){
        FechaNacimiento=fecha_nacimiento;
    }
    public void setOcupacion(String ocupacion){
        Ocupacion=ocupacion;
    }
    public void setDireccion(String direccion){
        Direccion=direccion;
    }
    public void setPaginaWeb(String paginaweb){
        PaginaWeb=paginaweb;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getFechaNacimiento(){
        return FechaNacimiento;
    }
    public String getOcupacion(){
        return Ocupacion;
    }
    public String getDireccion(){
        return Direccion;
    }
    public String getPaginaWeb(){
        return PaginaWeb;
    }
    public void registrarTelefonos(){
        Scanner teclado=new Scanner(System.in);
        
        Telefono telefono=new Telefono();                   //Se crea un objeto de tipo telefono
        Telefonos=new ArrayList<Telefono>();                //Se crea una lista de Telefonos (Una lista por contacto)
        String tipo="", numero="", opcion="si";
        while(opcion.equals("si") || opcion.equals("SI") || opcion.equals("Si") || opcion.equals("sI")){
            System.out.println("Ingresa el tipo de telefono");
            tipo=teclado.nextLine();
            telefono.setTipo(tipo);
                                                                    //Se leen los datos
            System.out.println("Ingresa el numero de telefono");
            numero=teclado.nextLine();
            telefono.setNumero(numero);
            
            Telefonos.add(telefono);                                //Se guarda el objeto en la lista
            
            System.out.println("¿Deseas agregar otro telefono?(Si/No)");
            opcion=teclado.nextLine();
        }
    }
    public void registrarRedesSociales(){
        //int bandera=0;
        Scanner teclado=new Scanner(System.in);
        
        RedSocial redsocial=new RedSocial();                        //Se crea un objeto de tipo Red Social
        RedesSociales=new ArrayList<RedSocial>();                   //Se crea una lista de Redes sociales (Una lista por contacto)
        String tipo="", nombreusuario="", opcion="si";
        while(opcion.equals("si") || opcion.equals("SI") || opcion.equals("Si") || opcion.equals("sI")){
            System.out.println("Ingresa el tipo de red social");
            tipo=teclado.nextLine();
            redsocial.setTipo(tipo);
                                                                    //Se lee la informacion
            System.out.println("Ingresa el nombre de usuario");
            nombreusuario=teclado.nextLine();
            redsocial.setNombreUsuario(nombreusuario);
            
            RedesSociales.add(redsocial);                           //Se guarda el objeto en la lista
            
            System.out.println("¿Deseas agregar otra cuenta?(Si/No)");
            opcion=teclado.nextLine();
        }
    }
    public int tamanoListaTelefonos(){          //Funcion que regresa el numero 
        int x=0;                                //de telefonos por contacto
        x=Telefonos.size();
        return x;
    }
    public int tamanoListaRedesSociales(){      //Funcion que regresa el numero
        int x=0;                                //de redes sociales por contacto
        x=RedesSociales.size();
        return x;
    }
    public void mostrarTelefonos(){             //Funcion que imprime todos los telefonos de cada contacto
        for(int i=0;i<tamanoListaTelefonos();i++){
            System.out.println("--------------");
            System.out.println("Telefono "+(i+1));
            System.out.println("Tipo: "+Telefonos.get(i).getTipo());
            System.out.println("Numero: "+Telefonos.get(i).getNumero());
        }
    }
    public void mostrarRedesSociales(){         //Funcion que imprime todas las redes sociales de cada contacto
        for(int i=0;i<tamanoListaTelefonos();i++){
            System.out.println("--------------");
            System.out.println("RedSocial "+(i+1));
            System.out.println("Tipo: "+RedesSociales.get(i).getTipo());
            System.out.println("Nombre de usuario: "+RedesSociales.get(i).getNombreUsuario());
        }
        System.out.println("-------------------------------------");
    }
}
