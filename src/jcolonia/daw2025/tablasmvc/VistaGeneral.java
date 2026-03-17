package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class VistaGeneral {

	    private static final String FORMATO_PRINTF_TEXTO = "";
	    private static final String FORMATO_PRINTF_AVISO = "";
	    
	    private static final Scanner scan = new Scanner(System.in);
	    
	    public static int pedirNumero(String texto) {
	        System.out.print(texto);
	        while (!scan.hasNextInt()) {
	            mostrarAviso("Error: Debes introducir un número entero.");
	            scan.next(); 
	            System.out.print(texto);
	        }
	        
	        int numero = scan.nextInt();
	        scan.nextLine(); 
	        return numero;
	    }
	    public static void pausa(String texto) {
	        System.out.print(texto + " (Pulsa Intro para continuar...)");
	        scan.nextLine();
	    }
	    public static void pedirConfirmacion(String texto) {
	        System.out.print(texto + " (s/n): ");
	        scan.nextLine(); 
	    }
	    
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
