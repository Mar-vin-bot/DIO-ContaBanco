package entities;

public class ContaTerminal {
	
	private int numero;
	private String agencia;
	private String nameCliente;
	private double saldo;
	
	public ContaTerminal() {}
	
	public ContaTerminal(int numero, String agencia, String nameClinete, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nameCliente = nameClinete;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNameCliente() {
		return nameCliente;
	}

	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nameCliente, agencia, numero, saldo);
		/*
		 * return "Olá "+nameCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", "+"conta"+
				"e o seu saldo no valor de R$ "+String.format("%.2f", saldo)+" esta disponivel para saque";
		*/
				
				
				
	}
	
	

}
