package bankdemo;
import java.util.InputMismatchException;
import java.util.Scanner;
	public class BankDemo{
			public static void main (String arg[]) {
				Scanner sc= new Scanner(System.in);
				Account acc=new Account(075,"Disha",25000);
				while(true) {
					try {
						System.out.println("\n...Banking  Menu...");
						System.out.println("1.Deposit");
						System.out.println("2.Withdraw");
						System.out.println("3.Show Balance");
						System.out.println("4.exit");
				        System.out.println("Enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter amount to deposit");
					acc.deposit(sc.nextDouble());
				    break;
				case 2:
					System.out.println("Enter amount to withdraw");
					acc.withdraw(sc.nextDouble());
				    break;
				case 3:
					acc.showBalance();
					break;
				case 4:
					System.out.println("THANKYOU!");
				    sc.close();
				    System.exit(0);
				default:System.out.println("INVALID");
				}
					}
					catch(InputMismatchException e) {
						System.out.println("Input number only");
						sc.nextLine();
					}catch (InsufficientBalanceException e)
					{
						System.out.println("Error"+e.getMessage());
					}
							
					catch (ArithmeticException e)
					{
						System.out.println("Error"+e.getMessage());
					}
					catch (Exception e)
					{
						System.out.println("Unexpected Error"+e);
					}
				}
			}
		}


