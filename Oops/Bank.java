package Oops;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Account a1 = new Account();
        Account a1 = new Account(10_000, 1322, "Geroge", "s@q.t",  33222);
        System.out.println(a1.getAccountBalance()); 
        System.out.println("Enter the amount you want to withdraw.");
        int amount = sc.nextInt();
        a1.withdraw(amount);
        sc.close();
        System.out.println(a1.getAccountBalance());
    }
}

class Account {
    private long accountNumber;
    private long phoneNumber;
    private int accountBalance;
    String customerName;
    String email;

    public Account() {
        this(0, 0, " ", " ", 0);
        System.out.println("Empty Constructor.");
    }

    public Account(int accountBalance, long accountNumber, String name, String email, long phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        customerName = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    
    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void deposite(int amount) {
        if (amount < 1) {
            System.out.println("Please deposite greater than zero.") ;
         } else {
             accountBalance += amount;
             System.out.println("Your account is credited with " + amount);
         }     
    }

    public void withdraw(int amount) {
        if (accountBalance - amount < 0) {
           System.out.println("Can't withdraw your account balance is " + accountBalance) ;
        } else {
            accountBalance -= amount;
            System.out.println("Your account is debited with " + amount);
        }
    }
}
