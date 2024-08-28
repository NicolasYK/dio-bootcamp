package main;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {		
		
		// Declaração do obj. scanner.
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		// Variáveis tipo inteiro.
		System.out.print("Digite aqui o número da sua conta: ");
		Integer num = scan.nextInt();
		System.out.print("Digite aqui o nome da sua agência: ");
		String agencia = scan.next();
		scan.nextLine();
		System.out.print("Digite aqui o seu nome: ");
		String nome_cliente = scan.nextLine();
		System.out.print("Digite aqui o saldo da sua conta: ");
		Double saldo = scan.nextDouble();
		
		// Print final e fechando o scanner.
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
				+ "sua agência é %s, conta %d e "
				+ "seu saldo é de %.2f e esá disponível para saque.%n", nome_cliente.toUpperCase(), agencia, num, saldo);
		scan.close();
	}
}
