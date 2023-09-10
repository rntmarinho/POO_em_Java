package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product account;
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o número de sua nova conta: ");
		int conta = sc.nextInt();
		System.out.println("Gostaria de fazer um depósito inicial?(s/n) ");
		sc.nextLine();
		char resposta = sc.nextLine().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Digite o valor a ser depositado: ");
			double valorInicial = sc.nextDouble();
			account = new Product(nome,conta,valorInicial);
		}else {
			account = new Product(nome, conta);
		}

		System.out.println();
		System.out.println(account);
		System.out.println();
		
		System.out.print("Entre valor para depósito: ");
		double deposito = sc.nextDouble();
		account.deposito(deposito);
		System.out.println("Dados da conta atualizada: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Entre valor para saque: ");
		double saque = sc.nextDouble();
		account.saque(saque);
		System.out.println("Dados da conta atualizada: ");
		System.out.println(account);
		System.out.println();
		
		sc.close();
	}
}