package jcolonia.daw2025.tablasmvc;

import java.util.List;

public class VistaMenu extends VistaGeneral{
	private String titulo;
	private List<String> opciones;
	
	public VistaMenu (String titulo, List<String> opciones){
		this.titulo = titulo;
		this.opciones=opciones;
		
	}
	public void mostrarTitulo() {
        mostrarTitulo1(this.titulo);
	}
	public void mostrarOpciones() {
        mostrarLista(this.opciones);
    }
	public static void mostrarTexto(String texto) {
        VistaGeneral.mostrarTexto(texto); 
    }
}
