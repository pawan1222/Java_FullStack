package Collections;
/*
Banking System (Main Question)

- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().
- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.
- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).
- Store multiple accounts in an ArrayList<Account>.

Demonstrate runtime polymorphism while performing operations.
	Add features:
	Add a new account
	Remove an account by account number
	Search for an account
	Display all accounts
	Deposit/Withdraw money into/from a chosen account
*/
public class List12 {
    public static void main(String[] args){

    }
}

interface BankOperations {
    public void deposite(double amount);
    void withdraw(double amount);
    void checkBalance();
    
}

abstract class Account implements BankOperations{
    double accountNo;
    String holdername;
    double balance;

    Account(double accountNo,String holdername,double balance){
        this.accountNo=accountNo;
        this.holdername=holdername;
        this.balance=balance;
    }
    public double accountNo(){
        return accountNo;
    }
    public double balance(){
        return balance;
    }
    public String holdername(){
        return holdername;
    }
}

class SavingAccount extends Account{
    SavingAccount(double accountNo,String holdername,double balance){
        super(accountNo, holdername, balance);
    }
    @Override
    public void deposite(double amount) {
        balance+=amount;
        System.out.println("deposite successfully");
    }
    @Override
    public void withdraw(double amount){
        balance-=amount;
        System.out.println("withdraw successfully");
    }
    @Override 
    public void checkBalance(){
        System.out.println("Balance is: "+balance);
    }
}


class CurrentAccount extends Account{

}