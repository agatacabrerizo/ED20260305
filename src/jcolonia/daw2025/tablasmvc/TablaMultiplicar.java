package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la lógica matemática de una tabla de multiplicar.
 * Se encarga de calcular, almacenar y formatear la tabla.
 * @author <a href="mailto:agatacabrerizo@gmail.com">Ágata Cabrerizo</a>
 * @version 2026.03.16 - 01 
 */
public class TablaMultiplicar {

    /** El número base del cual se generará la tabla de multiplicar. */
    private int numeroTabla;
    
    /** Lista que almacena cada línea de la tabla generada. */
    private List<String> listaTextos;

    /**
     * Constructor de la clase. Inicializa la tabla con un número.
     * @param numero El número base para inicializar la tabla.
     */
    public TablaMultiplicar(int numero) {
        this.numeroTabla = numero;
        this.listaTextos = new ArrayList<>();
    }
    /**
     * Devuelve el número base de la tabla actual.
     * @return El número de la tabla.
     */
    public int getNumero() {
        return this.numeroTabla;
    }
    /**
     * Genera la tabla de multiplicar y la almacena en la lista interna.
     */
    public void generarTabla() {

        this.listaTextos.clear(); 
        
        for (int i = 0; i <= 10; i++) {
            int resultado = this.numeroTabla * i;
            String linea = this.numeroTabla + " x " + i + " = " + resultado;
            this.listaTextos.add(linea);
        }
    }
    /**
     * Devuelve la lista con las líneas de la tabla de multiplicar generada.
     * @return Lista de cadenas de texto para exportación.
     */
    public List<String> toListaExportacion() {
        return this.listaTextos;
    }

    /**
     * Devuelve la lista con las líneas de la tabla para ser mostradas por pantalla.
     * @return Lista de cadenas de texto.
     */
    public List<String> toListPantalla() {
        return this.listaTextos;
    }
    /**
     * Convierte el contenido de la tabla en un único bloque de texto.
     * @return Un String con toda la tabla formateada.
     */
    @Override
    public String toString() {
        if (this.listaTextos == null || this.listaTextos.isEmpty()) {
            return "La tabla aún no ha sido generada.";
        }

        String textoFinal = "";

        for (int i = 0; i < this.listaTextos.size(); i++) {
            textoFinal = textoFinal + this.listaTextos.get(i) + "\n";
        }

        return textoFinal;
    }
}