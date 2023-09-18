package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		
		
		System.out.println( "Por favor, seu nome !");
		String nomeCliente = sc.nextLine();
		
		System.out.println( "Por favor, digite o número da Agência !");
		String agencia = sc.next();
		
		System.out.println( "Por favor, digite o número da conta !");
		int numero = sc.nextInt();
		
		System.out.println( "Qual o valor do seu saldo!");
		double saldo = sc.nextDouble();
		
		ContaTerminal ct = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		
		System.out.println(ct.toString());
		
		sc.close();

	}

}
