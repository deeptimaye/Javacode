package constructor;

public class BankAccount {
		private String accountHolderName;
	    private String bankName;
	    private double accountBalance;

	    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.bankName = bankName;
	        this.accountBalance = initialBalance;
	    }

	    public double getBalance() {
	        return accountBalance;
	    }

	    public void deposit(double amount) {
	    	accountBalance = amount;
	    	System.out.println("Amount Deposited: "+ accountBalance);
	    	accountBalance = amount+accountBalance;
	    	System.out.println();
	    }

	    public void withdraw(double amount) {
	    	if(amount <= accountBalance) {
	    		accountBalance = accountBalance - amount;
	    		System.out.println("Withdraw Successfull: "+amount);
	    	}
	    	else {
	    		System.out.println("Insufficient Balance!");
	    	}
	    	
	    	System.out.println();
	    }
	    
	    public void displayBalance() {
	    	System.out.println("Account holder: " + accountHolderName);
	        System.out.println("Bank name: " + bankName);
	        System.out.println("Account balance: " + accountBalance);
	        System.out.println();
	    }
}

 public class DenaBank {
	    public static void main(String[] args) {
	        // Create three bank accounts with different account holders name
	        BankAccount acc = new BankAccount("Rohit Sethy", "ICICI", 10.0);
	        BankAccount acc2 = new BankAccount("Rahul Yadav", "HDFC", 500.0);
	        BankAccount acc3 = new BankAccount("Shawin Pradhan", "SBI", 2000.0);

	        // Deposit and withdraw money for each account
	          acc.deposit(90);
	          acc.displayBalance();
	          acc.withdraw(80);
	          
	          acc2.deposit(100);
	          acc3.withdraw(1000);

	    }
	}
