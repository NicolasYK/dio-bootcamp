package main;

import java.util.Locale;
import java.util.Scanner;

import main.exceptions.ParametrosInvalidosException;

public class Contador {
	
	static void contar(Integer parametro_1, Integer parametro_2) throws ParametrosInvalidosException{
		
		if(parametro_1 > parametro_2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		else {
			for (int i = 0; i <= (parametro_2 - parametro_1); i++) {
				System.out.println("Imprimindo o número "+i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.print("Digite o primeiro parâmetro: ");
		Integer var1 = scan.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		Integer var2 = scan.nextInt();

		try {
			contar(var1, var2);
		}
		catch(ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		finally {
			scan.close();
		}
	}
	
}
