package bankaccountapp;

public abstract class Account implements IBaseRate {
	String name,sSN,accountNumber;
	double balance,rate;
	static int index=10000;
	public Account(String name,String sSN,double initDeposit) {
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit;
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
	}
	public abstract void setRate();
	private String setAccountNumber() {
		String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random()*Math.pow(10,3));
		return lastTwoOfSSN+uniqueID+randomNumber;
		
	}
	public void showInfo() {
		System.out.println(
				"NAME: "+name+
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: "+balance+
				"\nRATE: "+rate+ "%"
				);
	}
}
