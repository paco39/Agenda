package agenda;
import java.util.Scanner;
public class Telefono {
    String Tipo, Numero;
    Telefono(){
        
    }
    public void setNumero(String numero){
        Numero=numero;
    }
    public void setTipo(String tipo){
        Tipo=tipo;
    }
    public String getNumero(){
        return Numero;
    }
    public String getTipo(){
        return Tipo;
    }
}
