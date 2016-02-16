package agenda;
import java.util.Scanner;
import java.util.ArrayList;
public class Contacto {
    String Nombre,FechaNacimiento, Ocupacion, Direccion, PaginaWeb;
    ArrayList<Telefono> Telefonos;
    ArrayList<RedSocial> RedesSociales;
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
}
