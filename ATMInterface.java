import java.util.Scanner;
public class ATMInterface
{
    public static void main(String args[] )
    { 
        int balance = 15000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println(".....WELCOME TO ATM.....");
            System.out.println("Choose 1 : Withdraw");
            System.out.println("Choose 2 : Deposit");
            System.out.println("Choose 3 : Balance");
            System.out.println("Choose 4 : EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter amount to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your amount......");
                }
                else
                {
                    System.out.println("Invalid Balance......");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter amount to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("amount has been successfully depsited.....");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
            
        }
    }
}