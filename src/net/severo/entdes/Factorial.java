package net.severo.entdes;
/**
 * 
 * @author JuanManuelBelaunde
 *
 */
public class Factorial {

	public static void main(String[] args) {
		String texto = "Value of n: ";
		String texto1 = "Value of n!: ";

		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(texto + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(texto1 + result);

	}

}
