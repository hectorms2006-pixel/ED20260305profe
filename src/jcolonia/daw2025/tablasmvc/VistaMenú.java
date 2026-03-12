package jcolonia.daw2025.tablasmvc;

/**
 * Especialización de la vista para gestionar menús de opciones.
 */
public class VistaMenú extends VistaGeneral {
    private String título;
    private String[] opciones;

    public VistaMenú(String título, String[] opciones) {
        this.título = título;
        this.opciones = opciones;
    }

    public void mostrarOpciones() {
        mostrarTítulo1(título);
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%d) %s%n", (i + 1), opciones[i]);
        }
        System.out.println("0) Salir");
    }

    public int pedirOpción() {
        return pedirNúmero("Elija una opción");
    }
}