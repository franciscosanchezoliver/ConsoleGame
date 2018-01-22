

public class Parte {

	String valor ="" ;
	
	public Parte() {
		
	}
	
	public Parte(int numeroCaracteres , char caracter) {
		crearCadena(numeroCaracteres, caracter);
	}
	
	public String getValor() {
		return valor;
	}
	
	/**
	 * Crea un string con un numero de caracteres
	 */
	private void crearCadena(int numeroCaracteres, char caracter) {
		for(int i = 0; i< numeroCaracteres; i ++) {
			valor += caracter;
		}
	}
	
	/**
	 * Añade un caracter al final 
	 */
	public void addCaracter(int numeroCaracteres, char caracter) {
		numeroCaracteres = modulo(numeroCaracteres);
		for (int i = 0; i < numeroCaracteres; i++)
			valor += caracter;
	}

	/**
	 * Elimina un caracter al final
	 */
	public void eliminarCaracter(int numeroCaracteres) {
		numeroCaracteres = modulo(numeroCaracteres);
		for (int i = 0; i < numeroCaracteres; i++)
			valor = valor.substring(0, valor.length()-1);
	}
	
	/**
	 * Hace la operacion modulo matematica, si es un numero negativo lo pone en positivo
	 */
	private int modulo(int numero) {
		if(numero<0)
			numero = (-numero);
		return numero;
	}
	
}
