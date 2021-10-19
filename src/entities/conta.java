package entities;

public class conta {

	private int number;
	private String holder;
	private double balance;
	
	public conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public conta(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit (initialDeposit);
	}

	public int getNumber() {//excluiu o set porque uma vez gerado o numero da conta, não pode mais ser alterado
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {//excluiu o ser porque o saldo só pode ser alterado por meio de saque ou depósito
		return balance;
	}

	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
		
	}
	
}
