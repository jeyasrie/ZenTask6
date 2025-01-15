package constructor;

public class BankAccount {
	//declare the variable name for bank account
	int bankacc_no;
	String Name;
	String Address;
	int phone_no;
	String Email; 
	int CIF_no;
	static float bank_balance;
	
	//coctructor without parameter
	BankAccount()
	{
		//print bank name
		System.out.println("Bank Of India");
	}
	
	//constructor with  bank account no and name
	BankAccount(int a,String b)
	{
		bankacc_no=a;
		Name=b;
	}
	
	//constructor with multiple parameter like phone no,email,address,cif no
	BankAccount(int cif,String ad,int pno,String mail)
	{
		CIF_no=cif;
		Address=ad;
		phone_no=pno;
		Email=mail;
	}
	//create bankbalance method 
	private static float bankbalance(float bankbal)
	{
		bank_balance=bankbal;
		System.out.println("bank balance "+bank_balance);
		return bankbal;
	}
	
	//create withdraw method to  check bank balance after withdraw
private static float withdraw(float wd)
{
	System.out.println("bank balance before withdraw :"+bank_balance);
	
	System.out.println("withdraw money from account :"+wd);
	bank_balance=bank_balance-wd;
	System.out.println("bank balnce after withdraw :"+bank_balance);
	return wd;
}

//create method name deposite  for the deposite money
private static float  deposit(float dep)
{
	System.out.println("deposite money to bank account :"+dep);
	bank_balance=bank_balance+dep;
	System.out.println("bank_balnce after deposit :"+bank_balance);
	return dep;
}

//check bankbalance using checkbalance method
public static void checkbalance()
{
	System.out.println("check bank balance :"+bank_balance);
}

//main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //create object for the constructor with no arguments
         BankAccount bankacc=new BankAccount();
        
         //create object for the constructor with two arguments
         BankAccount bankacc1=new BankAccount(2,"sri");
         System.out.println();

		System.out.println("AccountNumber :"+bankacc1.bankacc_no);
		 System.out.println();
		System.out.println("Name :" +bankacc1.Name);
		
        
      //create object for the constructor with many arguments
		 BankAccount bankacc2=new BankAccount(7665446,"hebbal,mysore",1234567890,"bsch@gmail.com");
		 System.out.println();
		 System.out.println("CIF NO :"+bankacc2.CIF_no);
		 System.out.println();
		System.out.println("Address :"+bankacc2.Address);
		 System.out.println();
		System.out.println("Phone No :"+bankacc2.phone_no);
		 System.out.println();
		System.out.println("Email :"+bankacc2.Email);
		 System.out.println();
		 //call the bankbalnce method
		 bankacc.bankbalance(50000f);
		 System.out.println();
		 //call the withdraw method pass the float value
		bankacc.withdraw(5000f);
		 System.out.println();
		 //call the deposit method pass the float valuse
		 bankacc.deposit(8000f);
		 System.out.println();
		 //call checkbalance method
		bankacc.checkbalance();

	}

}

//Output
//
//	Bank Of India

//AccountNumber :2

//Name :sri

//CIF NO :7665446

//Address :hebbal,mysore

//Phone No :1234567890

//Email :bsch@gmail.com

//bank balance 50000.0

//bank balance before withdraw :50000.0
//withdraw money from account :5000.0
//bank balnce after withdraw :45000.0

//deposite money to bank account :8000.0
//bank_balnce after deposit :53000.0

//check bank balance :53000.0	 
//