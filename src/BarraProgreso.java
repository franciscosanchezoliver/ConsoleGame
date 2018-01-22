

public class BarraProgreso {

	private Parte izquierda;
	private Parte derecha;
	
	private int total;
	private int actual;
	private char caracterIzquierda;
	private char caracterDerecha;
	private char caracterRellenoIzquierda;
	private char caracterRellenoDerecha;
	private char caracterCentral ; 
	private Jugador jugador1 ; 
	private Jugador jugador2;
	private String valor;

	public BarraProgreso(int total , char caracterIzquierda, char caracterCentral, char caracterDerecha, char caracterRellenoIzquierda, char caracterRellenoDerecha, Jugador jugador1, Jugador jugador2) {
		
		this.caracterIzquierda = caracterIzquierda;
		this.caracterDerecha = caracterDerecha;
		this.caracterCentral = caracterCentral;
		this.caracterRellenoDerecha = caracterRellenoDerecha;
		this.caracterRellenoIzquierda = caracterRellenoIzquierda;	
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		
		actual = total/2;
		
		//Una barra de progreso esta formada por las 2 partes
		izquierda = new Parte(total/2, caracterRellenoIzquierda); 
		derecha = new Parte(total/2, caracterRellenoDerecha);
		//el centro
		
		
		valor = jugador1.getNombre() +" "+ caracterIzquierda + izquierda.getValor() + caracterCentral + derecha.getValor() + caracterDerecha +" " +jugador2.getNombre();		
		
	}
	
	public int getActual() {
		return actual;
	}
	
	public Jugador getGanador() {
		Jugador ganador = null;
		
		if(actual>0)  //si actual es mayor que 0 entonces ha ganado el jugador 1
			ganador = jugador1;
		else //si actual es mayor que 0 entonces ha ganado el jugador 2
			ganador = jugador2; 
		
		ganador.ganarBatalla();
		return ganador;
	}
	
	public Jugador getPerdedor() {
		if(actual<0)
			return jugador1;
		return jugador2;		
	}
	

	public void actualizarBarra(int potencia) {
		actual = actual + potencia;
		
		if(potencia > 0 ) {
			izquierda.addCaracter(potencia, caracterRellenoIzquierda);
			derecha.eliminarCaracter(potencia);
		}
		else if(potencia < 0) {
			derecha.addCaracter(potencia, caracterRellenoDerecha);
			izquierda.eliminarCaracter(potencia);			
		}
		
		valor = jugador1.getNombre() +" "+ caracterIzquierda + izquierda.getValor() + caracterCentral + derecha.getValor() + caracterDerecha +" " +jugador2.getNombre();
	}
	

	/**
	 * Imprime por consola la barra de progreso
	 */
	public void imprimirBarra() {
		System.out.print("\r" +valor + "   " +actual);
	}

}
