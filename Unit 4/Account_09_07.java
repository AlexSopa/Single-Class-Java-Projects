
/**
* (TheAccountclass) Design a class named Account that contains:
* 1.  A private int data field named id for the account (default 0).
* 2.  A private double data field named balance for the account (default 0). 
* 3.  A private double data field named annualInterestRate that stores the 
*      current interest rate (default 0). Assume all accounts have the same 
*      interest rate.                    
* 4.  A private Date data field named dateCreated that stores the date when 
*       the account was created.       
* 5.  A no-arg constructor that creates a default account.   
* 6.  A constructor that creates an account with the specified id and initial balance.   
* 7.  The accessor and mutator methods for id,balance, and annualInterestRate.  
* 8.  The accessor method for dateCreated. 
* 9.  A  method  named  getMonthlyInterestRate()  that  returns  the  monthly  interest rate. 
* 10. A method named getMonthlyInterest() that returns the monthly interest.    
* 11. A  method  named  withdraw  that  withdraws  a  specified  amount  from  the  account. 
* 12. A method named deposit that deposits a specified amount to the account.Draw  
*      the  UML  diagram  for  the  class  and  then  implement  the  class. 
*       (Hint:  The  methodgetMonthlyInterest() is to return monthly interest, not the 
*       interest rate. Monthly interest is balance * monthlyInterestRate.monthlyInterestRateisannualInterestRate / 12. 
*       Note that annualInterestRate is a percentage, e.g., like 4.5%. 
*       You need to divide it by 100.)Write a test program that creates an Account object 
*       with an account ID of 1122, a  balance  of  $20,000,  and  an  annual  interest  rate 
*        of  4.5%.  Use  the  withdrawmethod to withdraw $2,500, use the deposit method to 
*        deposit $3,000, and print the balance, the monthly interest, and the date when this 
*        account was created
*/        
        


public class Account_09_07 {
  public static void main (String[] args) {
    Account account = new Account(1122, 20000);
    Account.setAnnualInterestRate(4.5);
    
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " +
      account.getMonthlyInterest());
    System.out.println("This account was created at " +
      account.getDateCreated());
  }
}

class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;

  public Account() {
    dateCreated = new java.util.Date();
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }
}