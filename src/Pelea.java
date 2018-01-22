
import java.util.ArrayList;

public class Pelea {
	Jugador jugador1;
	Jugador jugador2;
	Jugador ganador;
	Jugador perdedor;
	int vidaJugador;
	int velocidadCombate;
	
	BarraProgreso barra = null;

	public Pelea(Jugador jugador1, Jugador jugador2, int vidaJugador , int velocidadCombate) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.vidaJugador = vidaJugador;
		this.velocidadCombate = velocidadCombate;
	}

	
	public void celebrarLaPelea() {
		barra = new BarraProgreso(vidaJugador, '[', '#', ']', '=', '~', jugador1, jugador2);

		RandomMovement randMovement = new RandomMovement();

		// Comienza la pelea entre dos jugadores
		int movement = 0;
		boolean estaPeleando = true;
		while (estaPeleando) {
			try {
				movement = randMovement.getMovement();
				barra.actualizarBarra(movement);
				barra.imprimirBarra();
				Thread.sleep(velocidadCombate);
			} catch (Exception e) {
				estaPeleando = false;
			}
		}

		ganador = barra.getGanador();
		perdedor = barra.getPerdedor();		
	}
	
	public void imprimirArbol() throws Exception {
		
		System.out.println("\u250C\u2500" + jugador1.getNombre());
		System.out.println("\u2514\u2500" + jugador2.getNombre());
	
	}
	
	
	public Jugador getJugador1() {
		return jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public void setGanador(Jugador jugador) {
		ganador = jugador;
	}

	public Jugador getGanador() {
		return ganador;
	}

	public void setPerdedor(Jugador perdedor) {
		this.perdedor = perdedor;
	}

	public Jugador getPerdedor() {
		return perdedor;
	}

}
