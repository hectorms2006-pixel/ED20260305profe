package jcolonia.daw2025.tablasmvc;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

/**
 * Gestiona la escritura de datos en archivos externos.
 */
public class ExportacionArchivo {
    public static void guardar(String nombreArchivo, List<String> lineas) throws IOException {
        try (PrintWriter escritor = new PrintWriter(nombreArchivo)) {
            for (String linea : lineas) {
                escritor.println(linea);
            }
        }
    }
}