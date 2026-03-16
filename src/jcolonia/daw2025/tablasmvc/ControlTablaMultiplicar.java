package jcolonia.daw2025.tablasmvc;

import java.io.IOException;

/**
 * Núcleo de aplicación de consola. Coordina el modelo y las vistas.
 */
public class ControlTablaMultiplicar {
    public static final String FORMATO_RUTA_ARCHIVO_EXPORTACION = "tabla_del_%02d.txt";
    
    private static final String[] OPCIONES_MENU_PRINCIPAL = {
        "Mostrar la tabla",
        "Cambiar la tabla",
        "Exportar la tabla"
    };

    private TablaMultiplicar tabla;

    public ControlTablaMultiplicar() {
        init();
    }

    public void init() {
        cambiarTabla();
    }

    public void buclePrincipal() {
        VistaMenú menú = new VistaMenú("Menú Principal", OPCIONES_MENU_PRINCIPAL);
        int opción;

        do {
            menú.mostrarOpciones();
            opción = menú.pedirOpción();

            switch (opción) {
                case 1 -> mostrarTabla();
                case 2 -> cambiarTabla();
                case 3 -> exportarTabla();
                case 0 -> VistaGeneral.mostrarAviso("Saliendo...");
                default -> opciónNoDisponible();
            }
        } while (opción != 0);

        VistaGeneral.mostrarAviso("FIN DE PROGRAMA");
    }

    private void mostrarTabla() {
        if (tabla == null) return;
        VistaGeneral.mostrarTítulo2("Visualizando tabla del " + tabla.getNumero());
        VistaGeneral.mostrarLista(tabla.toListaPantalla());
        VistaGeneral.pausa("Pulse Intro para continuar...");
    }

    private void cambiarTabla() {
        int n = VistaGeneral.pedirNúmero("Introduzca el número para la tabla");
        if (n >= 0) {
            tabla = new TablaMultiplicar(n);
            VistaGeneral.mostrarAviso("Tabla actualizada al número " + n);
        } else {
            VistaGeneral.mostrarAviso("Número no válido.");
        }
    }

    private void exportarTabla() {
        String nombreArchivo = String.format(FORMATO_RUTA_ARCHIVO_EXPORTACION, tabla.getNumero());
        try {
            ExportacionArchivo.guardar(nombreArchivo, tabla.toListaExportacion());
            VistaGeneral.mostrarAviso("Guardado con éxito en: " + nombreArchivo);
        } catch (IOException e) {
            VistaGeneral.mostrarAviso("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private void opciónNoDisponible() {
        VistaGeneral.mostrarAviso("Opción no válida o no implementada.");
    }
}