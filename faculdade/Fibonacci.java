package faculdade;


public class Fibonacci {
	public static void main(String[] args) {
		int valor = 0;
		int valorb = 1;
		for(int i = 0; i < 100; i++) {
			System.out.println(valor);
			valor += valorb;
			valorb = valor - valorb;
		}
	}
}
