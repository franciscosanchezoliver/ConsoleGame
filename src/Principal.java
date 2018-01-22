
import java.io.IOException;
import java.util.Random;

public class Principal {

	static int VELOCIDAD_COMBATE = 50; // Cuanto menor sea el tiempo mas rapida sera la pelea
	static int VIDA_JUGADOR = 30;

	public static void main(String[] args) throws Exception {

		Musica.sonar();
		Mensajes.imprimirIntro();

		Jugador miJugador = new Jugador("spuzi");
		miJugador.setPuntosDeHabilidad(200);
		
		for(int i = 0 ; i < 5; i++) {
			miJugador.gastarPuntoDeHabilidad(Habilidades.MAXIMO);
			miJugador.gastarPuntoDeHabilidad(Habilidades.VIDA);			
			miJugador.gastarPuntoDeHabilidad(Habilidades.VIDA);		
			miJugador.gastarPuntoDeHabilidad(Habilidades.VIDA);					
		}
		
		//PedirTeclado.introducirNombre(1);
		
		//Mensajes.imprimirMenu();
		
		ListaPeleas listaPeleas = new ListaPeleas();
		ListaJugadores listaJugadores = new ListaJugadores();
		
		int opcion = Menu.mostrarMenu();
		int numeroJugadores= 0;
		switch (opcion) {
		case 1:
			numeroJugadores = Menu.pedirNumeroJugadores();			
			listaJugadores.generarJugadores(numeroJugadores);
			break;
		case 2:
			
			numeroJugadores = Menu.pedirNumeroJugadores();
			
			for(int i = 0 ; i < numeroJugadores ; i++) {
				String nombreJugador = PedirTeclado.introducirNombre(i);
				listaJugadores.addJugador(new Jugador(nombreJugador));
			}
			
			break;
			
		default:
			System.exit(0);
			break;
		}
		

		listaJugadores.addJugador(miJugador);
		
		//El programa no para hasta que no haya un ganador
		while (listaJugadores.size() != 1) {

			// Se crea una nueva ronda de peleas
			while (listaJugadores.size() > 1) { // Si hay al menos 2 jugadores entonces podemos hacer una pelea
				Jugador jugador1 = jugador1 = listaJugadores.getJugador(0);
				Jugador jugador2 = listaJugadores.getJugador(1);
				
				// Eliminamos de la lista de jugadores los jugadores que van a pelear
				listaJugadores.removeJugador(jugador1);
				listaJugadores.removeJugador(jugador2);

				// Se crea una pelea con los dos jugadores
				Pelea pelea = new Pelea(jugador1, jugador2,VIDA_JUGADOR, VELOCIDAD_COMBATE);
				listaPeleas.addPelea(pelea);
			}

			//Imprimimos el arbol de peleas
			Mensajes.imprimirArbolPeleas(listaPeleas);
			
			// Se van celebrando peleas mientras haya peleas disponibles
			while (listaPeleas.hayPeleas()) {

				Pelea pelea = null;
				pelea = listaPeleas.getPelea(0);

				Mensajes.entradaCombate(); // imprime la pantalla de entrada al combate

				pelea.celebrarLaPelea();
				

				Mensajes.imprimirGanador(pelea.getGanador());

				listaJugadores.removeJugador(pelea.getPerdedor()); // El perdedor se elimina de la lista de jugadores
				listaJugadores.addJugador(pelea.getGanador()); // El ganador se añade a la lista de jugadores para pasar
																// a la siguiente ronda

				listaPeleas.removePelea(); //Como se ha celebrado la pelea entonces se elimina de la lista de peleas pendientes

			}

		}
	}

}
