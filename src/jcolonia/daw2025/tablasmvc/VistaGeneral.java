package jcolonia.daw2025.tablasmvc;

public class VistaGeneral {

	    private static final String FORMATO_PRINTF_TEXTO = "";
	    private static final String FORMATO_PRINTF_AVISO = "";
	    
	    public static void mostrarTexto(String texto) {
	        System.out.printf(FORMATO_PRINTF_TEXTO, texto);
	    }
	    public static void mostrarAviso(String texto) {
	        System.out.printf(FORMATO_PRINTF_AVISO, texto);
	    }

	    public static void mostrarTitulo1(String texto) {
	        System.out.println("\n" + texto.toUpperCase() + "");
	    }
	    public static void mostrarTitulo2(String texto) {
	        System.out.println(" " + texto + " ");
	    }

}
