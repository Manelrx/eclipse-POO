package interfaces;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do atleta");
		String nome = scan.next();
		
		TriAtleta atleta = new TriAtleta(nome);
		
		atleta.aquecer();
		atleta.correDeBicicleta();
		atleta.correr();
		atleta.getNome();
		atleta.nadar();
	
	}
}
