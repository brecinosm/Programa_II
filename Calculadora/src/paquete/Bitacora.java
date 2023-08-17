package paquete;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author brecinosm
 */
public class Bitacora {

    String cadena2 = "";

    public void concatenar(String dato_importado) {

        cadena2 += dato_importado + " ";

    }

    public void limpiar() {

        cadena2 = "";
    }

    public void mostrar() throws IOException {

        //System.out.println(cadena2);
        FileWriter archivo = new FileWriter("bitacora.txt", true);
        // Obtener la fecha y hora actual
        LocalDateTime now = LocalDateTime.now();

        // Definir el formato de salida deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Formatear la fecha y hora según el formato
        archivo.write(cadena2 + " LOG: " + now.format(formatter) + " \n");
        archivo.close();
    }

}
