package aulajava03;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {

		int numero = 0;
		int soma = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero. Caso queira encerrar, digite 0.");

		do {
			numero = entrada.nextInt();
			soma += numero;

		} while (numero != 0);

		System.out.println("A soma dos n�meros inseridos �: " + soma);

		entrada.close();

	}

}
