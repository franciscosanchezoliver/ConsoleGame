
import java.io.IOException;

public class Mensajes {

	private static int TIEMPO_ARBOL_PELEAS = 20;
	private static int TIEMPO_MENSAJE_GANADOR = 20;
	private static int TIEMPO_ENTRE_LETRAS = 20;
	
	public static void entradaCombate() throws Exception {
		ASCIIArtGenerator artGen = new ASCIIArtGenerator();
		String[] mensajes = new String[] {"1", "2" , "3" , "FIGHT!"};
		
		for (int i = 0; i < mensajes.length; i++) {
			limpiarPantalla();
			imprimirMensaje(mensajes[i]);
			Thread.sleep(TIEMPO_ENTRE_LETRAS);			
		}
		
		limpiarPantalla();
	}
	
	public static void limpiarPantalla() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();		
	}
	
	public static void imprimirMensaje(String mensaje) throws Exception {
		ASCIIArtGenerator generador = new ASCIIArtGenerator();
		generador.printTextArt(mensaje, ASCIIArtGenerator.ART_SIZE_SMALL);		
	}
	
	public static void imprimirMensajePequenio(String mensaje)throws Exception{
		ASCIIArtGenerator generador = new ASCIIArtGenerator();
		generador.printTextArt(mensaje, 7);		
	}
	
	public static void imprimirMensajeTamanio(String mensaje, int tamanio) throws Exception{
		ASCIIArtGenerator generador = new ASCIIArtGenerator();
		generador.printTextArt(mensaje, tamanio);				
	}
	
	public static void imprimirMensajeGrande(String mensaje) throws Exception{
		ASCIIArtGenerator generador = new ASCIIArtGenerator();
		generador.printTextArt(mensaje, ASCIIArtGenerator.ART_SIZE_HUGE);				
	}
	
	public static void imprimirGanador(Jugador jugador) throws Exception {
		limpiarPantalla();
		imprimirMensaje("  Winner");
		System.out.println("\n\n\n\n");
		
		imprimirMensaje(jugador.getNombre());
		System.out.println("\n\n");

		imprimirMensaje("Fights: " + jugador.getBatallasGanadas());		
			
		Thread.sleep(TIEMPO_MENSAJE_GANADOR);
	}

	public static void imprimirArbolPeleas(ListaPeleas peleas) throws Exception {
		limpiarPantalla();
		for (Pelea pelea : peleas.getListaPeleas())
			pelea.imprimirArbol();
		Thread.sleep(TIEMPO_ARBOL_PELEAS);
	}	
	
	public static void imprimirMenu() throws Exception {
	
		limpiarPantalla();
			
		imprimirMensaje("     MAGIC FIGHTS ");
		System.out.println("\n");
		imprimirMensaje("     ___________");
		System.out.println("\n");		
		
		imprimirMensajeTamanio(" 1- Generate players    " ,10);
		imprimirMensajeTamanio(" 2- Write players       ", 10);
		System.out.println("\n\n");
	}
	
	public static void imprimirIntro() throws Exception{
		limpiarPantalla();
		System.out.println("\n\n\n\n\n");
		imprimirMensajeTamanio("                     \u2122", 15);
		imprimirMensajeTamanio("    spuzi", 25);
		
		System.out.println("\n\n\n\n\n");		
		imprimirMensajeTamanio("Press any key to continue", 10);
		PedirTeclado.pressAnyKeyContinue();

	}
	
	
	
}
