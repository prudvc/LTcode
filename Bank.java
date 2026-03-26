// import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

class b1
{
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private String branch;
	private int pin;

	public b1( int accountNumber, String accountHolderName, int balance, String branch,int pin)
	{
		this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.branch = branch;
		this.pin=pin;
	}

	public boolean checkpin(int p)
	{
		return p==pin;
	}

	public void deposit(int amt)
	{
		balance+=amt;
		System.out.println("Amount Deposited Successfully");
	}

	public void withdraw(int amt)
	{
		if(amt>balance)
		{
			System.out.println("Not Enough");
		}
		else {
			balance-=amt;
			System.out.println("Withdraw Successful");
		}
	}

	public void transfer(b1 receiver,int amt)
	{
		if(amt>balance)
		{
			System.out.println("Not Enough ");
		}
		else{
			balance -= amt;
			receiver.balance+=amt;
			System.out.println("Transfer Successful");
		}

	}

	public int  getaccnum()
	{
		return accountNumber;
	}

	 public void displayDetails() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Balance     : " + balance);
        System.out.println("Branch Name         : " + branch);
        System.out.println("-------------------------------");
    }
}

public class Bank {

	static b1 findAccount(ArrayList<b1> accounts, int accNo)
	{
        for (b1 a : accounts) {
            if (a.getaccnum() == accNo) {
                return a;
            }
        }
        return null;
    }

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<b1> accounts=new ArrayList<>();


		while(true)
		{
			System.out.println("\n---- BANK MENU ----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Transfer Money");
            System.out.println("6 . Exit");

			int choice=sc.nextInt();

			switch(choice)
			{
				case 1:

				       System.out.println("Enter Account Number :");
				          int actno=sc.nextInt();

				       System.out.println("Enter Name :");
					        String nm=sc.next();

				       System.out.print("Enter Initial Balance: ");
                            int  balance = sc.nextInt();

                       System.out.print("Enter Branch: ");
                            String branch = sc.next();

					   System.out.println("Enter Pin :");
					    int p=sc.nextInt();

						accounts.add(new b1(actno,nm,balance,branch,p));

				       System.out.println("Account Created Successfully");
                    break;

				case 2:

				        System.out.println("Enter Account Number :");
						int actn=sc.nextInt();

						b1 acc=findAccount(accounts,actn);

						if(acc != null)
						{
							System.out.println("Enter Pin :");
							int pi=sc.nextInt();

							if(acc.checkpin(pi))
							{
								System.out.println("Enter Amt : ");
								int amt=sc.nextInt();
								acc.deposit(amt);
							}
							else{
								System.out.println("Wrong Pin. ");
							}
						}
						else{
							System.out.println("Account Not Found .");
						}
						break;

				 case 3:

				         System.out.println("Enter Account Number :");
						 actn=sc.nextInt();

						acc=findAccount(accounts,actn);

						if(acc != null)
						{
							System.out.println("Enter Pin :");
							int pii=sc.nextInt();

							if(acc.checkpin(pii))
							{
								System.out.println("Enter Amt :");
								int amt=sc.nextInt();
								acc.withdraw(amt);
							}
							else{
								System.out.println("Wrong Pin");
							}
						}
						else {
							System.out.println("Account Not Found");
						}
						break;

				  case 4:
					{
						System.out.println("Enter Account Number :");
						actn=sc.nextInt();

						acc= findAccount(accounts,actn);

						if(acc != null)
						{
							System.out.println("Enter Pin :");
							int piiii=sc.nextInt();

							if(acc.checkpin(piiii))
							{
									acc.displayDetails();
							}
							else {
								System.out.println("Wrong Pin.");
							}
						}
						else{
							System.out.println("Account Not Found");
						}
					}
					break;

				case 5:
					{
						System.out.println("Enter Sender Account Number :");
						int sno=sc.nextInt();

						System.out.println("Enter Receiver Account Number :");
						int rno=sc.nextInt();

						b1 sender=findAccount(accounts,sno);
						b1 receiver=findAccount(accounts,rno);

						if( sender!=null && receiver != null )
						{
							System.out.println("Enter Pin :");
							int piii=sc.nextInt();

							if(sender.checkpin(piii))
							{
								System.out.println("Enter Amt :");
								int amt=sc.nextInt();

								sender.transfer(receiver, amt);
							}
							else{
								System.out.println("Wrong Pin .");
							}
						}
						else{
							System.out.println("Account Not Found .");
						}
					}
					break;

				case 6:
					{
						 System.out.println("Thank you !!");
						 System.exit(0);
					}

				default:
					{
						System.out.println("Invalid Choice !!");
					}
			}
		}


	}

}
