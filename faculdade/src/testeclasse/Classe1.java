package testeclasse;
import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
		Classeteste operacoes = new Classeteste(0, 0);
		
		System.out.println("Digite um numero: ");
		Scanner num1 = new Scanner(System.in);
		operacoes.primeiro = num1.nextInt();
		
		System.out.println("Digite outro numero: ");
		Scanner num2 = new Scanner(System.in);
		operacoes.segundo = num2.nextInt();
		
		System.out.println("A Soma e: " + operacoes.soma());
		
	}

}
