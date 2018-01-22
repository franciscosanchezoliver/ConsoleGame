
import java.util.Random;

public class Caracteristica {

	private Maximo maximo;
	private Minimo minimo;
	private Vida vida;
	private Critico critico;

	/**
	 * Valores predeterminados de un jugador de inicio
	 */
	public Caracteristica() {
		maximo = new Maximo();
		minimo = new Minimo();
		vida = new Vida();
		critico = new Critico();
	}

	public int atacar() {
		if (golpearCritico()) // si golpea critico entonces el valor sera el maximo * 2
			return maximo.getValor() * 2;
		return GeneradorRandom.crearEntero(maximo.getValor(), minimo.getValor());
	}

	/**
	 * probabilidad de hacer el doble de daño
	 */
	public boolean golpearCritico() {
		return GeneradorRandom.haSalido(critico.getValor());
	}

	/**
	 * Subir
	 */
	public boolean subirMinimo() {
		return minimo.subir();
	}

	public boolean subirMaximo() {
		return maximo.subir();
	}

	public boolean subirVida() {
		return vida.subir();
	}

	public boolean subirCritico() {
		return critico.subir();
	}

	/**
	 * GET Y SETS
	 */
	public Maximo getMaximo() {
		return maximo;
	}

	public void setMaximo(Maximo maximo) {
		this.maximo = maximo;
	}

	public Minimo getMinimo() {
		return minimo;
	}

	public void setMinimo(Minimo minimo) {
		this.minimo = minimo;
	}

	public Vida getVida() {
		return vida;
	}

	public void setVida(Vida vida) {
		this.vida = vida;
	}

	public Critico getCritico() {
		return critico;
	}

	public void setCritico(Critico critico) {
		this.critico = critico;
	}

}
