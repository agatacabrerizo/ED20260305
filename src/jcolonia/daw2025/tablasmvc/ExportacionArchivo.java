package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.nio.file.Path;

public class ExportacionArchivo {

	private Path refArchivo;
	/**
     * Constructor. Recibe un texto con la ruta y lo convierte en un objeto Path.
     * @param rutaArchivo Nombre o ruta del archivo (ejemplo: "mitabla.txt")
     */
	public ExportacionArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        this.refArchivo = archivo.toPath();
    }
}

