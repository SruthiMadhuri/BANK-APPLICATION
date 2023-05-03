package bankaccountapp;

public class BaseAccountApp {
	public static void main(String[] args) {
		Checking chkacc1=new Checking("Tom Wilson","67895634",9000.0);
		Savings savacc1=new Savings("Rich Lowe","23451679",4563.78);
		savacc1.showInfo();
		savacc1.compound();
		System.out.println("**********************************");
		chkacc1.showInfo();
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("Brokerage", 3000);

	}

}
