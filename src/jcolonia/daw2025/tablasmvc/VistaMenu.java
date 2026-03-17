package jcolonia.daw2025.tablasmvc;
/**
 *Componente encargado de gestionar la presentación de un menú interactivo.
 *Amplía las herramientas generales de presentación para mostrar opciones y recoger elecciones.
 *@author <a href="mailto:agatacabrerizo@gmail.com">Ágata Cabrerizo</a>
 *@version 2026.03.17 - 01
 */
import java.util.List;

public class VistaMenu extends VistaGeneral{
	/** Texto principal que actúa como encabezado del menú. */
	private String titulo;
	/** Colección de textos que representan las alternativas elegibles por el usuario. */
	private List<String> opciones;
	
	/**
     * Rutina de inicialización que configura el componente con un encabezado 
     * y unas alternativas específicas.
     * * @param titulo El texto principal que encabezará el menú.
     * @param opciones La colección de textos con las alternativas disponibles.
     */
	public VistaMenu (String titulo, List<String> opciones){
		this.titulo = titulo;
		this.opciones=opciones;
	
	/**
	*Procedimiento que presenta el texto principal por pantalla 
	*utilizando el formato de encabezado destacado.
	*/
	}
	public void mostrarTitulo() {
        mostrarTitulo1(this.titulo);
	}
	/**
    *Procedimiento que presenta la colección de alternativas disponibles 
    *en forma de lista numerada.
    */
	public void mostrarOpciones() {
        mostrarLista(this.opciones);
    }
	/**
    *Procedimiento que presenta la colección de alternativas disponibles 
    *en forma de lista numerada.
    */
	public static void mostrarTexto(String texto) {
        VistaGeneral.mostrarTexto(texto); 
    }
	/**
    *Función que solicita al usuario la introducción de un valor numérico 
    *para seleccionar una de las alternativas mostradas.
    *@return El número entero correspondiente a la alternativa elegida.
    */
	public int pedirOpciones() {
        return pedirNumero("Elige una opción: ");
    }
}
