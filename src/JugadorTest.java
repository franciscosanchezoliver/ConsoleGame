import java.util.HashMap;

public class JugadorTest {

	public static void main(String[] args) throws Exception {
		Jugador jugador = new Jugador("spuzi");

		int puntosHabilidad = 10;

		Habilidades habilidad = null;

		int contadorMaximo = 0;
		int contadorMinimo = 0;
		int contadorVida = 0;
		int contadorCritico = 0;

		HashMap<Habilidades, Integer> mapa = new HashMap<>();

		mapa.put(Habilidades.MAXIMO, 0);
		mapa.put(Habilidades.MINIMO, 0);
		mapa.put(Habilidades.VIDA, 0);
		mapa.put(Habilidades.CRITICO, 0);

		// se escoge la habilidad a la que se van a poner puntos

		for (int i = 0; i < puntosHabilidad; i++) {
			habilidad = GeneradorRandom.elegirHabilidad();
			System.out.println(habilidad.toString());

			int contador = 0;
			switch (habilidad) {

				case MAXIMO:
					contador = mapa.get(habilidad);
					contador++;
					mapa.put(Habilidades.MAXIMO, contador);
					break;
				case MINIMO:
					contadorMinimo = contadorMinimo + 1;
					break;
				case VIDA:
					contadorVida = contadorVida + 1;
					break;
				case CRITICO:
					contadorCritico = contadorCritico + 1;
					break;
				default:
					throw new Exception();
			}
		}

		double total = contadorCritico + contadorMaximo + contadorMinimo + contadorVida;

		System.out.println("total:" + total + "\n");

		System.out.println(" maximo:" + contadorMaximo + "    " + (contadorMaximo / total));
		System.out.println(" minimo:" + contadorMinimo + "    " + (contadorMinimo / total));
		System.out.println("   vida:" + contadorVida + "    " + (contadorVida / total));
		System.out.println("critico:" + contadorCritico + "    " + (contadorCritico / total));

	}

}
