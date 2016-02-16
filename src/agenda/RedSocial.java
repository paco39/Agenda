package agenda;
import java.util.Scanner;
public class RedSocial {
    String nombreUsuario, Tipo;
    RedSocial(){
        
    }
    public void setNombreUsuario(String nombre_usuario){
        nombreUsuario=nombre_usuario;
    }
    public void setTipo(String tipo){
        Tipo=tipo;
    }
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getTipo(){
        return Tipo;
    }
    
}
