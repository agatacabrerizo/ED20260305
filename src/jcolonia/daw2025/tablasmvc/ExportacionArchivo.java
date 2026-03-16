package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.List;
/**Gestiona la exportación de datos a un archivo de texto en el disco duro.
 * Se encarga de transformar las rutas de texto y escribir la información línea por línea.
* @author <a href="mailto:agatacabrerizo@gmail.com">Ágata Cabrerizo</a>
* @version 2026.03.16 - 01 
*/
public class ExportacionArchivo {
	/**
     * Referencia a la ubicación exacta del archivo en el sistema.
     * Almacena la ruta en el formato requerido (Path).
     */
	private Path refArchivo;
	/**
     * Recibe el nombre del archivo y lo prepara para su uso.
     * Utiliza la clase tradicional File como puente para generar la ruta Path.
     * @param rutaArchivo Nombre o ruta del archivo (ejemplo: "mitabla.txt")
     */
	public ExportacionArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        this.refArchivo = archivo.toPath();
    }
	/**
     * Guarda la lista línea por línea en el archivo de texto.
     * @param contenidos La lista con las líneas a guardar.
     */
    public void guardar(List<String> contenidos) {
        File archivoDestino = this.refArchivo.toFile();
        
        try {
            PrintWriter escritor = new PrintWriter(archivoDestino);
      
            for (int i = 0; i < contenidos.size(); i++) {
                escritor.println(contenidos.get(i));
            }
            escritor.close(); 
            System.out.println("Archivo guardado correctamente.");
	        } catch (Exception e) { 
	            System.out.println("Error: No se pudo escribir el archivo.");
	        }
    }
}


