

public class Menu {

	public static int mostrarMenu() throws Exception {
		Mensajes.imprimirMenu();
		int opcion =  PedirTeclado.introducirOpcion();
		return opcion;
	}
	
	public static int pedirNumeroJugadores() throws Exception{
		Mensajes.limpiarPantalla();
		Mensajes.imprimirMensaje("How many players?");
		return PedirTeclado.introducirNumero();
	}
	
}
