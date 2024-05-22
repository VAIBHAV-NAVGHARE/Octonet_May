package atm_package;
import java.util.*;

public class ATM 
{
	int Balance;
	int PIN=1025;
	
	public void checkpin()
	{
		System.out.println("Enter your pin:");
		Scanner sc=new Scanner(System.in);
	    int enteredpin =sc.nextInt();
	    if(enteredpin==PIN)
	    {
	     menu();	
	    }
	    else
	    {
	    	System.out.println("Enter a valid pin:");
	    	menu();
	    }
		sc.close();
	}
	public void menu()
	{
		System.out.println("Enter Your Choice:");
	    System.out.println("1. check A/C Balance:");
	    System.out.println("2. Withdraw Money:");
	    System.out.println("3. Deposit Money");
	    System.out.println("4. Exit");
	    
	    Scanner sc=new Scanner(System.in);
	    int opt = sc.nextInt();
	    
	    if(opt==1)
	    {
	    	checkBalance();
	    }
	    else if(opt==2)
	    {
	    	withdrawMoney();
	    }
	    else if(opt==3)
	    {
	    	depositMoney();
	    }
	    else if(opt==4)
	    {
	    	return;
	    }
	    else
	    {
	    	System.out.println("Enter a valid choice");
	    	menu();
	    }
		sc.close();
	}

	public void checkBalance()
	{
		
		System.out.println("balance +"+ Balance);
		menu();
	}
		public void withdrawMoney()
		{
		 System.out.println("Enter Amount to Withdraw: ");
		 Scanner sc=new Scanner(System.in);
		 int amount =sc.nextInt();
		 if(amount>Balance) 
		 {
			 System.out.println("Insufficient Balance: ");
		
		}
		 else
		 {
			 Balance = Balance - amount;
			 System.out.println("Money Withdrawl Sucessfully :");
		 }
		 menu();
		 sc.close();
	}
}

		public void depositMoney()
		{
			System.out.println("Enter the Amount: ");
			Scanner sc=new Scanner(System.in);
			int Balance = sc.nextInt();
			System.out.println("Money Deposited Successfully :");
			menu();
			sc.close();
		}
public class ATM
{
	public static void main(String[] args) 
	{
		ATM obj=new ATM();
		obj.checkpin();
	}
}