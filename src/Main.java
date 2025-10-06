import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       try{
           String directorio = "C:\\prueba";

           boolean exito =  new File(directorio).mkdir();
           if (exito){
               System.out.println("Directorio " + directorio + " creado.");
           }else {
               System.out.println("El directorio ya existe o no se puede crear");
           }

           File fichero = new File("C:\\prueba\\miFichero.txt");
           if (fichero.createNewFile()){
               System.out.println("El fichero se ha creado.");
           }else {
               System.out.println("No se ha podido crear el fichero.");
           }
       } catch (IOException e){
           System.out.println("Error: " + e.getMessage());
       }
    }
}