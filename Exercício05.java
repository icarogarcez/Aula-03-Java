package aulajava03;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		int numero = 0;
		int soma = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número. Caso queira encerrar, digite 0.");

		do {
			numero = entrada.nextInt();
			soma += numero;

		} while (numero != 0);

		System.out.println("A soma dos números inseridos é: " + soma);

		entrada.close();

	}

}
