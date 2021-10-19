package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		conta conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();//colocou esse nextline para criar uma quebra de linha
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new conta(number, holder, initialDeposit);//apertar control + espaço para importar
		}
		else {
			conta = new conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Ac );
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		
		sc.close();
		
	}

}
