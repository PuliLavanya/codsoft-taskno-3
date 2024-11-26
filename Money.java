
import java.io.*; 
import java.util.*;
class Money extends Atm { 
//Scanner sc=new Scanner(System.in);
//int Balance=sc.nextInt();
int Balance;
	public void menu(){
		System.out.println("Enter your options");
		System.out.println("1.checkbalance");
		System.out.println("2.withdrawal");
		System.out.println("3.deposit");
		System.out.println("4.Exit");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1){
			 checkBalance();
		}
		else if(num==2)
		{
			withDrawl();
		}
		else if(num==3)
		{
			deposit();
		}
		else if(num==4)
		{
			return;
		}
                else
		{
 		System.out.println("Exit");
		}
	}  
        public void checkBalance() 
       { 
        System.out.println("Current Balance : "+ Balance); 
	menu();
      }
 
    public void withDrawl() 
    { 
        System.out.println("Enter Withdrawing Amount : "); 
	Scanner sc=new Scanner(System.in);
	int withdrawAmount=sc.nextInt(); 
        if (Balance >= withdrawAmount) { 
            Balance = Balance - withdrawAmount;  
        } 
        else { 
            System.out.println("Insufficient Balance"); 
        } 
    menu();
    } 
    public  void deposit() 
    {  
        System.out.println("Depositing Amount : "); 
        Scanner sc=new Scanner(System.in);
	int depositAmount=sc.nextInt(); 
        Balance = Balance + depositAmount; 
        System.out.println( "Your Money has been successfully deposited"); 
     }
	menu();
    } 
  class Atm {
    public static void main(String[] args) 
    {   
        Money obj=new Money();
        obj.checkBalance();
        obj.deposit();
        obj.withDrawl();
    } 
}
