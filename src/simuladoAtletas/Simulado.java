package simuladoAtletas;

import java.util.Locale;
import java.util.Scanner;

public class Simulado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		char sexo, opcao;
		double altura, peso;
		
		do {
		System.out.print("Nome: ");
		nome = sc.nextLine();
		do {
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		} while (sexo != 'M' && sexo != 'F');
		do {
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		} while (altura < 0);
		do {
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		} while (peso < 0);
		do {
		System.out.print("Digitar outro atleta (S/N)? ");
		opcao = sc.next().charAt(0);
		} while (opcao != 'S' && opcao != 'N');
		sc.nextLine();
		} while (opcao == 'S');
		
		
		
		
		sc.close();

	}

}
