

public abstract class Habilidad {
	
	private int puntosDados; //los puntos invertidos en esta habilidad
	private int valor; //el valor total de la habilidad
	private int incremento; //cada vez que se le da un punto a la habilidad cuanto sube 
	
	
	public boolean subir() {
		if(sePuedeSubirMas()) {
			puntosDados++;
			valor += incremento;
			return true;
		}
		return false;
	}
	
	
	public boolean sePuedeSubirMas() {
		if(puntosDados < Constantes.Jugador.MAXIMO_PUNTOS)
			return true;
		return false;
	}
	
	public int getPuntosDados() {
		return puntosDados;
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor ) {
		this.valor = valor;
	}
	
	public void setIncremento(int valor) {
		incremento = valor;
	}
	

	

}
