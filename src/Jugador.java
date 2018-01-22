

public class Jugador {
	private String nombre;
	private int batallasGanadas;
	private int puntosDeHabilidad; //Los puntos de habilidad restantes para poder subir alguna habilidad
	private Caracteristica caracteristica;
	
	public Jugador (String nombre) {
		this.nombre = nombre;
		this.batallasGanadas = 0 ;
		this.puntosDeHabilidad = 10;
		this.caracteristica = new Caracteristica();
	}
	
	public void ganarBatalla() {
		batallasGanadas ++;
	}	

	public boolean gastarPuntoDeHabilidad(Habilidades habilidad) throws Exception {
		
		boolean puntoDado = false;
		
		switch (habilidad) {
		case MAXIMO:
			puntoDado = caracteristica.getMaximo().subir();
			break;
		case MINIMO:
			puntoDado = caracteristica.getMinimo().subir();			
			break;
		case VIDA:
			puntoDado = caracteristica.getVida().subir();	
			break;			
		case CRITICO:
			puntoDado = caracteristica.getCritico().subir();	
			break;			
		default:
			 throw new Exception();
		}
		
		//si hemos podido gastar el punto entonces descontamos los puntos de habilidad que nos queda y devolvemos true
		if(puntoDado) {
			puntosDeHabilidad--;
			return true;
		}
		else {
			return false;
		}
		
	}
		
	
	public int atacar() {
		return caracteristica.atacar();
	}
	
	
	/**
	 * GET Y SETS
	 */
	public String getNombre() {
		return nombre;
	}
	
	public int getBatallasGanadas() {
		return batallasGanadas;
	}

    public void setPuntosDeHabilidad(int puntosDeHabilidad) {
		this.puntosDeHabilidad = puntosDeHabilidad;
	}
    public int getPuntosDeHabilidad() {
		return puntosDeHabilidad;
	}
	
	
}
