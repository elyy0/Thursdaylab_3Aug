//Q.4 Write a program to implement the process of bank to accept the user details (Bank name, Account type, Account Number, User name, password, and also the transaction, loan process) and display the output
//2 Files: Bank_Account.java, Main.java
package Thursdaylab_3Aug;
public class Bank_Account {
	String Bank_name,user_name,branch_name;
	private int ac_no,pin=121,bal=2000;
	int amount;																	//Using the getter and setter methods
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public int getPin() {
		return pin;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
}
