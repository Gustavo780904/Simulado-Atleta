package simuladoAtletas;

import java.util.Locale;
import java.util.Scanner;

public class Simulado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		char sexo, opcao;
		double altura = 0.0, alturaMax = 0.0, peso, somaAlturaMulheres = 0.0, somaPeso = 0.0;
		double pesoMedio, porcentagemHomens, alturaMediaMulheres;
		String maisAlto = null;
		int contagem = 0, contagemHomens = 0, contagemMulheres = 0, chave=0;

		do {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			do {
				System.out.print("Sexo: ");
				sexo = sc.next().charAt(0);
			} while (sexo != 'M' && sexo != 'F');
			if (sexo == 'M') {
				contagemHomens = contagemHomens + 1;
			} else {
				contagemMulheres = contagemMulheres + 1;
			}
			do {
				System.out.print("Altura: ");
				altura = sc.nextDouble();
			} while (altura < 0);

			if (sexo == 'F') {
				somaAlturaMulheres = somaAlturaMulheres + altura;
			}
			if (altura > alturaMax) {
				alturaMax = altura;
				maisAlto = nome;
			}
			do {
				System.out.print("Peso: ");
				peso = sc.nextDouble();
			} while (peso < 0);
			somaPeso = somaPeso + peso;
			do {
				System.out.print("Digitar outro atleta (S/N)? ");
				opcao = sc.next().charAt(0);
			} while (opcao != 'S' && opcao != 'N');
			sc.nextLine();
			contagem = contagem + 1;
		} while (opcao == 'S');

		porcentagemHomens = (double) (contagemHomens * 100) / contagem;
		alturaMediaMulheres = somaAlturaMulheres / contagemMulheres;
		pesoMedio = somaPeso / contagem;

		System.out.printf("%nRELATÓRIO:%n");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Atleta mais alto: " + maisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
		System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);

		sc.close();

	}

}
