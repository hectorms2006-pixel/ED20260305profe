package jcolonia.daw2025.tablasmvc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * 
 */
public class TablaMultiplicar {
	public static void main(String[]args) {
		File refArchivo = new File ("ejemplo.txt");
		/*Object in = Files.newBufferedReader(refArchivo);
				 Charset.forName("windows-1252"));*/
		
		int num;
		num = 4;
		
		try (PrintWriter out = new PrintWriter(refArchivo)) {
		
			for (int i = 0; i<=10; i++) {
			out.printf("%d x %d = %d%n", i, num, (i*num));
			}
			out.close();
		}catch (FileNotFoundException e) {
			System.err.printf("Ruta no encontrada: %s", 
					e.getLocalizedMessage());
		}
	}
}
