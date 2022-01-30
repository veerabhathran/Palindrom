package Bank;

import java.util.Scanner;

import Bank.SavingAccount.SavingsAccount;
import Bank.bank.Bank;

public class SavingAccount {
	public static String accountnumber;
	public static String accountname;

	public class SavingsAccount extends Bank{
		public SavingsAccount(bank bank, String accname, String accnumber) {
			bank.super(accname, accnumber);
			// TODO Auto-generated constructor stub
		}
		double interestRate;
		String accnumber,accame;
		public void SavingsAccout(String accname,String accnumber,double interestRate)
		{	this.accname=accname;
			this.accnumber=accnumber;
			this.interestRate=interestRate;
		}
		void addInterest(double Balance)
		{
			Balance = Balance + Balance*interestRate/100;
			System.out.println("Balance with Interest is "+Balance);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			SavingsAccount obj =  SavingsAccount("Dineshkumar","12345678",5);				
			System.out.println("To Get Account Name press 1");
			System.out.println("To Get Account Number press 2");
			System.out.println("To Get Account Balance press 3");
			System.out.println("To Deposit amount  press 4");
			System.out.println("To Withdraw amount press 5");
			int n = sc.nextInt();
			switch(n) {
				case 1 :obj.getname();
					break;
				case 2 :obj.getaccnumber();
					break;
				case 3 :obj.getbalace();
					break;
				case 4 :System.out.println("Enter amount to deposit");
					obj.addInterest(obj.deposit(sc.nextDouble()));
					break;
				case 5 :System.out.println("Enter amount to withdraw"); 
					obj.addInterest(obj.withdraw(sc.nextDouble()));
					break;
				default : System.out.println("Press the number 1 to 5");
					break;
				
			}
						sc.close();
						}
		private static SavingsAccount SavingsAccount(String string, String string2, int i) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public void getbalace() {
		// TODO Auto-generated method stub
		
	}

	public void getname() {
		// TODO Auto-generated method stub
		
	}

	public Object deposit(double nextDouble) {
		// TODO Auto-generated method stub
		return null;
	}

	public void getaccnumber() {
		// TODO Auto-generated method stub
		
	}
}