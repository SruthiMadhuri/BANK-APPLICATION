package bankaccountapp;

public class BaseAccountApp {
	public static void main(String[] args) {
		Checking chkacc1=new Checking("Tom Wilson","67895634",9000.0);
		Savings savacc1=new Savings("Rich Lowe","23451679",4563.78);
		savacc1.showInfo();
		System.out.println("**********************************");
		chkacc1.showInfo();

	}

}
