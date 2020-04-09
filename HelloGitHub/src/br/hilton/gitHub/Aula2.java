/**
 * 
 */
package br.hilton.gitHub;

/**
 * @author Hilton
 *
 */
public class Aula2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo =" Bic";
		c1.cor = "Azul";
		//c1.carga = "Cheia";
		//c1.ponta = 0.5f;
		//c1.tampada = false;
		c1.destampar();
		c1.rabiscar();
		c1.status();
			
	   Caneta c2 = new Caneta();
	   c2.modelo = "Castel";
	   c2.cor ="preta";
	   c2.tampar();
	   c2.rabiscar();
	   c2.status();
	}

}
