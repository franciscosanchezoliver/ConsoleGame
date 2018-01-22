import java.util.Random;

public class GeneradorRandom {

	private static Random randomGenerator = new Random();
	
	public static int crearEntero(int maximo , int minimo) {
		return randomGenerator.nextInt(maximo+1) + minimo;
	}
	
	public static boolean crearBoolean () {
		return randomGenerator.nextBoolean();
	}
	
	public static boolean haSalido(int probabilidad) {
		int valorAleatorio = crearEntero(100, 1);
		if(valorAleatorio <= probabilidad)
			return true;
		else 
			return false;
	}
	
	
	public static Habilidades elegirHabilidadEntre(Habilidades[] array) {
		int numero = crearEntero(array.length-1, 0);
		Habilidades habilidadEscogida= array[numero];
		return habilidadEscogida;
	}
	
	public static Habilidades elegirHabilidad() {
		Habilidades[] arrayHabilidades = Habilidades.values();
		int numero = crearEntero(arrayHabilidades.length-1, 0);
		Habilidades habilidadEscogida= arrayHabilidades[numero];
		return habilidadEscogida;
	}
	
	
}
