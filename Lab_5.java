import java.util.Scanner;

class Bank
{
	String customer;
	String accno;
	Scanner s=new Scanner(System.in);
	void get()
	 {
	   	System.out.println("Enter the customer name:");
	   	customer=s.next();
	   	System.out.println("Enter the account number:");
	   	accno=s.next();
	 }
}
class Cur_acct extends Bank
{
	double bal=0;
	double dep;
	void deposit1()
	{
	 	System.out.println("Enter the amount to be deposited");
	 	dep=s.nextInt();
	 	bal += dep;
	 	System.out.println("Amount"+dep+" is succesfully deposited");
	}
	void issue_cheque()
	{
	 	System.out.println("The cheque book is issued succesfully");
	}
	void check()
	{
	        if(bal<1000)
	       {
		System.out.println("The minimum amount must be 1000");
		bal=bal-5;
	    	System.out.println("Service charges are imposed");
	        }
	 }
	void display()	
	{
		System.out.println("Balance = "+bal);
	}
}

class Sav_acct extends Bank
{
	double bal=0;
	double dep , draw;
	int rate=6;

	void deposit2()
	{
	 	System.out.println("Enter the amount to be deposited");
	 	dep=s.nextInt();
		bal  += dep;
	 	System.out.println("Amount"+dep+" is succesfully deposited");
	}
	void withdrawal()
	{
	 	System.out.println("Enter the amount to withdraw");
	 	draw=s.nextInt();
	 	bal -= draw;
	 	System.out.println("The balance amount is"+bal);
	}
	void comp_interest()
	{
	 	bal=bal+bal*0.06;
    		System.out.println("The balance amount is"+bal);
	}
}

class Account
{
  	public static void main(String args[])
  	{ 
    		Scanner sc=new Scanner(System.in);
    		int ch, type;
		Bank b=new Bank();
		b.get();
		Sav_acct a=new Sav_acct();
		Cur_acct c=new Cur_acct();
		System.out.println("Enter the account type (1.savings/2.current):");
		type=sc.nextInt();
	  	if(type==1)
      		{
	     	         do
	    	        {
		 	System.out.println("-----Menu-----");
		  	System.out.println("1:Deposit  2:Withdrawal  3.Compound interest  4.Exit");
			System.out.println("Enter your choice:");
	      		ch=sc.nextInt();
           			switch(ch)
	       		{
				case 1:
					a.deposit2();
					break;
				case 2:
					a.withdrawal();
					break;
				case 3:
					a.comp_interest();
					break;
		   	}
		         } while(ch!=4);
                		}
     		else
     		{
	    	          do
	    	          {
		  	System.out.println("-----Menu-----");
			System.out.println("1:Deposit  2:Cheque issue  3.Display  4.Exit");
			System.out.println("Enter your choice:");
	      		ch=sc.nextInt();
           			switch(ch)
	       		{
				case 1:
					c.deposit1();
					break;
				case 2:
					c.issue_cheque();
					break;
				case 3:
					c.check();
					c.display();
					break;
		   	}
		            }while(ch!=4);
      		}
     	}
}


			
		

	
	 	
	 
	 
	
	
	
	
	 