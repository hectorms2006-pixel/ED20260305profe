package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una tabla de multiplicar y genera sus líneas de texto.
 * @author Héctor Menéndez
 */
public class TablaMultiplicar {
    /** El número de la tabla. */
    private int numero;
    /** Lista de cadenas con las operaciones (ej: "5 x 1 = 5"). */
    private List<String> listaTextos;

    /**
     * Crea una nueva tabla para un número específico.
     * @param numero El número base de la tabla.
     */
    public TablaMultiplicar(int numero) {
        this.numero = numero;
        this.listaTextos = new ArrayList<>();
        generarTabla();
    }

    /**
     * Genera las líneas de la tabla del 0 al 10.
     */
    public void generarTabla() {
        listaTextos.clear();
        for (int i = 0; i <= 10; i++) {
            listaTextos.add(String.format("%d x %d = %d", numero, i, (numero * i)));
        }
    }

    /** @return El número de la tabla activa. */
    public int getNumero() { return numero; }

    /** @return La lista de líneas para mostrar por pantalla. */
    public List<String> toListaPantalla() { return listaTextos; }

    /** @return La lista de líneas para guardar en archivo. */
    public List<String> toListaExportacion() { return listaTextos; }
}