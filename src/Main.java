import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name ,Password and initial balance");
        String name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();
        SBIAccount dkacc=new SBIAccount(name ,balance ,password);
        System.out.println("Your account has been created with account number: "+dkacc.getAccountNo());

        //get balance
        System.out.println("Your current balance is: "+dkacc.getBalance());

        //diposit
        System.out.println(dkacc.depositMoney(500));
        System.out.println("New balance is: "+dkacc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdraw");
        int amount=sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword=sc.next();

        System.out.println(dkacc.withdraw(amount,enteredPassword));

        //Interest
        System.out.println("Interest of 4 years on current balance "+dkacc.getBalance()+" is :"+ dkacc.calculateIntrest(4));


    }
}