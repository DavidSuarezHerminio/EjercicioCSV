
package ejerciciocsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class EJERCICIOCSV {

    public static void main(String[] args) throws IOException {
    String nombreArchivo = "alumnosNotas.txt";
    try{
    FileReader archivoLeer = new FileReader(nombreArchivo); //esto lo hago para poder abrir el archivo sino no podria.
     BufferedReader bufferedReader = new BufferedReader(archivoLeer); //esto lo hago para poder leerlo 
      String Linea; //Aqui guardo cada linea que guarde
      FileWriter archivoEscribir = new FileWriter("LasMedias.txt");//Abro el archivo para poder escribir en el 
      BufferedWriter bufferedWriter = new BufferedWriter(archivoEscribir); // sirve para escribir en el
            while ((Linea = bufferedReader.readLine()) != null) {
                 String[] partes = Linea.split(":"); // esto lo que hace es indicarle que la informacion se guardara en cada linea de : en :
                String Nombre = partes[0];
                int nota1 = Integer.parseInt(partes[1]);
                int nota2 = Integer.parseInt(partes[2]);
                int nota3 = Integer.parseInt(partes[3]);
                 int media = (nota1 + nota2 + nota3) / 3;
            
                System.out.println("Nombre: "+Nombre+ ", su media: " + media);
                
                //ahora voy a añadirlo en un archivo que se llamara LasMedias
                
                // Escribo las medias en el archivo LasMedias.txt
                bufferedWriter.write("Nombre: " + Nombre + ", su media: " + media);
                bufferedWriter.newLine(); // Agrego una nueva línea para el próximo que añada
                
           

            System.out.println("Las medias se han guardado en LasMedias.txt"); //indico esto para saber que he llegado hasta aqui y se ha guardado todo perfectamente
            }
             bufferedReader.close(); //Cierro el buffer
            bufferedWriter.close(); //Cierro el buffer
          
    }catch(IOException e){
        System.out.println("Error al leer el archivo, vuelve a intentarlo");
    }
    
        
    }
    
}
