package expressao_condicional_ternaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.print(desconto);
		
		sc.close();		
	}

}
