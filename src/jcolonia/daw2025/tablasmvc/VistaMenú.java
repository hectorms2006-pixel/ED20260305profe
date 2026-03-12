package jcolonia.daw2025.tablasmvc;

/**
 * Gestión de menús de opciones por consola.
 * Extiende a VistaGeneral para aprovechar las utilidades de lectura/escritura.
 */
public class VistaMenú extends VistaGeneral {
	/** Título que se muestra sobre las opciones. */
    private String título;
    /** Array con los textos de cada opción disponible. */
    private String[] opciones;
    
    /**
     * Crea un menú nuevo con un título y una lista de opciones.
     * @param título El nombre del menú (ej: "Menú Principal")
     * @param opciones Array de strings con las descripciones de las opciones.
     */
    public VistaMenú(String título, String[] opciones) {
        this.título = título;
        this.opciones = opciones;
    }
    
    /**
     * Muestra el título y la lista numerada de opciones por pantalla.
     * Automáticamente añade la opción '0' para salir.
     */
    public void mostrarOpciones() {
        mostrarTítulo1(título);
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%d) %s%n", (i + 1), opciones[i]);
        }
        System.out.println("0) Salir");
    }
    
    /**
     * Solicita al usuario que introduzca el número de la opción elegida.
     * @return El número entero introducido por el usuario.
     */
    public int pedirOpción() {
        return pedirNúmero("Elija una opción");
    }
}