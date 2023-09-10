package entities;

public class Product {
	private String titular;
	private int numeroConta;
	private double saldo;
	
	public Product() {
	}
	
	public Product(String titular, int numeroConta, double depositoInicial) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}
	
	public Product(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Conta número: " 
	            + numeroConta 
	            + ", titular: "
	            + titular
	            + ", saldo: R$"
	            + String.format("%.2f", saldo);
	}

	public void deposito(double valorDepositado){
		saldo += valorDepositado;
	}	
	
	public double saque(double valorSacado) {
		double taxa = 5.00;
		saldo -= valorSacado + taxa;
		return saldo;		
	}
	
}