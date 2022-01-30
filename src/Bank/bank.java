package Bank;

public class bank {
	public class Bank {
	 
	    String accname;
	    String accnumber;
	    double balance = 1000;
	    public Bank(String accname, String accnumber)
	    {
	    	this.accname = accname;
	    	this.accnumber = accnumber; 	
	    System.out.println("accname : "+ accname );
	    System.out.println("accnumber : " + accnumber );
	    }
	   void  getname()
	   {
		   System.out.println("accname : "+ accname);
	   }
	   void getaccnumber()
	   {
		System.out.println("accnumber :  "+accnumber);
	   }
	   void getbalace() {
		   System.out.println("balace :"+balance);
	   }
	   double deposit( double amount)
	   {
		   
		balance = balance + amount; 
		return balance;
		   
	   }
	   
	   double withdraw ( double amount)
	   {
		   
		balance = balance - amount; 
		return balance;
		   
	   }
		}

	public bank(String accountname, String accountnumber) {
		// TODO Auto-generated constructor stub
	}


	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}



}
