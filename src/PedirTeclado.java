
import java.util.Scanner;

public class PedirTeclado {
	
	public static String introducirNombre(int numeroJugador) throws Exception {
		Mensajes.limpiarPantalla();	//limpiar consola
		Mensajes.imprimirMensajeTamanio("Player" + numeroJugador, ASCIIArtGenerator.ART_SIZE_SMALL);
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        return entradaTeclado;
	}
	
	public static void pressAnyKeyContinue() throws Exception{
		System.in.read();
	}
	
	public static int pedirNumeroJugadores() throws Exception{
		Mensajes.limpiarPantalla();		
		return 2;
	}
	
	public static int introducirNumero() throws Exception{
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        int entradaTeclado = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner		
		return entradaTeclado;		
	}
	
	public static int introducirOpcion() throws Exception{
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        int entradaTeclado = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner		
		return entradaTeclado;
	}
	
}


