
import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {
	ArrayList<Jugador> jugadores ;
	
	
	public ListaJugadores() {
		this.jugadores = new ArrayList<>();
	}
	
	
	public Jugador getJugador(int posicion) {
		return this.jugadores.get(posicion);
	}
	
	public void addJugador (Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public void removeJugador(Jugador jugador) {
		for(int i = 0 ; i < this.jugadores.size(); i++) {
			if(jugador.getNombre().equals(this.jugadores.get(i).getNombre())) {
				this.jugadores.remove(i);
			}
		}
	}	
	
	public void generarJugadores(int numeroJugadores) {
		for ( int i = 0; i <numeroJugadores ; i ++) {
			String nuevoJugador = "jugador " + i;
			Jugador jugador = new Jugador(nuevoJugador);
			addJugador(jugador);
		}
	}
	
	public int size() {
		return this.jugadores.size();
	}

	public boolean hayGanador() {
		return this.jugadores.size() ==1;
	}
	
	
}
