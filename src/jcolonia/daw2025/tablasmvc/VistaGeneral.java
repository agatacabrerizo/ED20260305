package jcolonia.daw2025.tablasmvc;
/**
 *Componente principal que proporciona herramientas para la interacción con el usuario 
 *a través de la consola. Incluye rutinas y procedimientos para mostrar información 
 *con diferentes formatos y leer datos por teclado de forma segura.
 *@author <a href="mailto:agatacabrerizo@gmail.com">Ágata Cabrerizo</a>
 *@version 2026.03.16 - 01 **/
import java.util.List;
import java.util.Scanner;

public class VistaGeneral {
	/**Formato estándar para mostrar textos genéricos (%s es el texto, %n el salto de línea). */
	private static final String FORMATO_PRINTF_TEXTO = "%s%n";
	/**Formato destacado para mostrar mensajes de advertencia o error. */
	private static final String FORMATO_PRINTF_AVISO = "¡AVISO! %s %n";
	/**Herramienta interna para la lectura de datos introducidos por teclado. */   
	private static final Scanner scan = new Scanner(System.in);
	/**
     *Muestra un mensaje y solicita un valor numérico entero al usuario.
     *Si el usuario introduce un texto no válido, muestra un aviso
     *y vuelve a solicitarlo hasta que la entrada sea correcta.
     *@param texto El mensaje que se le mostrará al usuario para pedir el dato.
     *@return El número entero introducido por el usuario.
     */
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
	 /**
	 *Detiene la ejecución del programa temporalmente hasta que el usuario pulsa la tecla Intro.
	 *@param texto El mensaje que se mostrará antes de la pausa (ej. "Pulsa Intro...").
	 */
	 public static void pausa(String texto) {
		 System.out.print(texto + " (Pulsa Intro para continuar...)");
	     scan.nextLine();
	 }
	 /**
	 *Detiene la ejecución del programa temporalmente hasta que el usuario pulsa la tecla Intro.
	 *@param texto El mensaje que se mostrará antes de la pausa (ej. "Pulsa Intro...").
	 */
	 public static boolean pedirConfirmacion(String texto) {
		    System.out.print(texto + " (s/n): ");
		    String respuesta = scan.nextLine().trim().toLowerCase();
		    return respuesta.equals("s");
		}
	 /**
	 *Muestra una cadena de texto por pantalla utilizando el formato estándar definido.
	 *@param texto La información que se desea mostrar.
	 */
	 public static void mostrarTexto(String texto) {
		 System.out.printf(FORMATO_PRINTF_TEXTO, texto);
	 }
	 /**
	 *Muestra un mensaje de advertencia o error por pantalla utilizando 
	 *el formato de alerta definido.
	 *@param texto El mensaje de aviso que se desea mostrar.
	 */
	 public static void mostrarAviso(String texto) {
		 System.out.printf(FORMATO_PRINTF_AVISO, texto);
	 }
	 /**
	 *Muestra un texto a modo de título principal. Lo imprime en mayúsculas 
	 *y con un salto de línea previo para darle más respiro visual.
	 *@param texto El texto que servirá como encabezado principal.
	 */
	 public static void mostrarTitulo1(String texto) {
	     System.out.println("\n" + texto.toUpperCase() + "");
	 }
	 /**
	 *Muestra un texto a modo de título secundario (subtítulo).
	 *@param texto El texto que servirá como encabezado secundario.
	 */
	 public static void mostrarTitulo2(String texto) {
	     System.out.println(" " + texto + " ");
	 }
	 /**
	 *Recibe una colección de cadenas de texto y las imprime por pantalla 
	 *en forma de lista numerada (empezando desde el 1).
	 *@param lista La colección de textos (opciones) que se van a mostrar.
	 */
	 public static void mostrarLista(List<String> lista) {
	     for (int i = 0; i < lista.size(); i++) {
	    	 System.out.println((i + 1) + ". " + lista.get(i));
	     }
	 }
}
