package atm;
import java.util.Scanner;
public class UserInterface {
	private static int status;
	public static void main(String args[]) {
		AtmOperationImple impl=new AtmOperationImple();
Scanner sc=new Scanner(System.in);
int atmnumber=210709;
int atmpin=2179;
System.out.println("WELCOME TO ATM MACHINE");
System.out.println("ENTER THE ATM ATM NUMBER");
int atmnum2=sc.nextInt();
System.out.println("ENTER THE ATM ATM PIN:");
int atmpin2=sc.nextInt();
if(atmnumber==atmnum2 && atmpin==atmpin2) {
	while(true) {
	System.out.println("1.viewAvailable \n 2.withdrawAmount \n 3.DepositAmount \n 3.DepositAmount \n 4.viewMiniStatement \n 5.exit ");
	System.out.println("enter the choice:");
	int ch=sc.nextInt();
	if(ch==1) {
		impl.viewBalance();
	}
	else if(ch==2) {
		System.out.println(" Enter The Amount to withdraw");
		double withdrawAmount=sc.nextDouble();
			impl.withdrawAmount(withdrawAmount);
	}
	else if(ch==3) {
		System.out.println(" Enter The Amount to Deposit");
		double depositAmount=sc.nextDouble();
			impl.depositAmount(depositAmount);
	}
	else if(ch==4) {
		impl.viewMiniStatement();
	}
	else if(ch==5)
	{
		System.out.println("COLLECT YOUR  ATM  CARD \n THANK YOU ");
		System.exit(status);
	}
}
}
else {
	System.out.println("INCORRECT ATM NUMBER OR PIN");
}

}
}