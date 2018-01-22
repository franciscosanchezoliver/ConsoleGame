
import java.util.Random;

public class RandomMovement {
  
	Random randomGenerator = new Random();
	int maxPotencia = 4;
	int minPotencia = 1;
	
	
	/**
	 * Generates a movement
	 */
	public int getMovement() {
		int movement = 0; //inicializa a movimiento neutro
		String signo =""; //indica el signo del numero, puede ser un numero positivo o negativo
		
		int numAleatorio = getRandomInt(); //calcula un numero aleatorio
		
		//Le ponemos el signo dependiendo si es par o impar, los numeros pares seran positivos y los impares negativos
		if(esPar(numAleatorio)) {
			signo = "+";
		}else {
			signo = "-";
		}
			
		String movimientoConSigno = signo + getPotencia();
		return Integer.parseInt(movimientoConSigno);
	}
	
	/**
	 * Calcula la potencia de forma aleatoria, solo habre 4 niveles de potencia: 0, 1, 2 , 3 
	 */
	private int getPotencia() {
		return randomGenerator.nextInt(maxPotencia) + minPotencia;
	}
	
	/**
	 * Generates a random integer in range 0.99
	 */
	private int getRandomInt() {
		return randomGenerator.nextInt(100);
	}

	/**
	 * Generates a random integer in range 0.maximo
	 */
	private int getRandomInt(int maximo) {
		return randomGenerator.nextInt(maximo);
	}	
	
	/**
	 * Chequea si un numero es par
	 */
	private boolean esPar(int numero) {
		if(numero%2 == 0 ) {
			return true;
		}
		return false;
	}
	
	
}