package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Utilidades generales para la interacción con el usuario por consola.
 */
public class VistaGeneral {
    private static Scanner sc = new Scanner(System.in);

    /** Muestra un texto informativo simple. */
    public static void mostrarAviso(String texto) {
        System.out.println("AVISO: " + texto);
    }

    /** Muestra un título principal resaltado. */
    public static void mostrarTítulo1(String texto) {
        System.out.println("\n=== " + texto.toUpperCase() + " ===");
    }

    /** Muestra un subtítulo. */
    public static void mostrarTítulo2(String texto) {
        System.out.println("\n--- " + texto + " ---");
    }

    /** Pide un número entero al usuario. */
    public static int pedirNúmero(String mensaje) {
        System.out.print(mensaje + ": ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Valor de error
        }
    }

    /** Imprime una lista de strings línea a línea. */
    public static void mostrarLista(List<String> lista) {
        for (String s : lista) System.out.println(s);
    }

    /** Detiene la ejecución hasta que el usuario pulse Intro. */
    public static void pausa(String mensaje) {
        System.out.println("\n" + mensaje);
        sc.nextLine();
    }
}