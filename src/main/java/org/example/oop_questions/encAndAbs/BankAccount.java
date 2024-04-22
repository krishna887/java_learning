package org.example.oop_questions.encAndAbs;

public class BankAccount {
    private  double  balance;
    private  long accountNumber;

    public BankAccount( long accountNumber) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

   public  void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println( amount + "Deposited Sucessefully");
        }
        else System.out.println("The amount should not be Negative");


    }
    public void withdraw(double amount){
        if(amount>0){
            if(amount<balance){
                System.out.println(amount+ "wihtdrawn Sucessefully");
            }
            else System.out.println("insufficient fund");
        }
        else System.out.println("negative amount cant be withdrawn");




    }

}
class Main{
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount(12345);
        bankAccount.deposite(10000);
        bankAccount.withdraw(5000);
    }
}
