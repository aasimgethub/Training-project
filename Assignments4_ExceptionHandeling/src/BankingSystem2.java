class insufficientBalanceException extends Exception{
	insufficientBalanceException(String msg){
		super(msg);
	}
}
class IllegalBankTransactinException extends Exception{
	IllegalBankTransactinException(String msg){
		super(msg);
	}
}



public class BankingSystem2 {
	 private long id;
	    private double balance;
	    private double withdraw;
	    private double deposit;
     
	public BankingSystem2(long id, double balance) {
			super();
			this.id = id;
			this.balance = balance;
//			this.withdraw = withdraw;
//			this.deposit = deposit;
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	public double getWithdraw() {
//		return withdraw;
//	}
//
//	public void setWithdraw(double withdraw) {
//		this.withdraw = withdraw;
//	}
//
//	public double getDeposit() {
//		return deposit;
//	}
//
//	public void setDeposit(double deposit) {
//		this.deposit = deposit;
//	}
	
	public void transaction(double withdraw) {
 	   
		try {
			if(withdraw>=0 && withdraw<=getBalance()) {
				setBalance(getBalance()-withdraw);
				System.out.println("Transaction Successfull");
				System.out.println("Remaining balance :"+getBalance());
				
			}
			else if(withdraw<0) {
				throw new IllegalBankTransactinException("Enter Correct Amount");
			}
			else {
			
				throw  new insufficientBalanceException("Insufficient Account Balance");
			}
		}
		catch(IllegalBankTransactinException e) {
			  System.out.println( e.getMessage());
		}
		catch( insufficientBalanceException e1) {
			  System.out.println( e1.getMessage());
		}
		catch(Exception e) {
			System.out.println("Invalid Transaction");
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem2 sc = new BankingSystem2 (1,5000);
		sc.transaction(6000);
               
	}

}
