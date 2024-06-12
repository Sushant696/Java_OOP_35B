package OOP;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("sushant", 898989898, 13);
        myAccount.withdraw(2214);

        System.out.println(myAccount.viewAccountBalance());
    }
}

class BankAccount {
    private int accNumber;
    private String name;
    private int bankBalance;

    BankAccount(String name, int accNumber, int bankBalance) {
        this.name = name;
        this.accNumber = accNumber;
        this.bankBalance = bankBalance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int viewAccountBalance() {
        return this.bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void withdraw(int withdrawAmt) {
        if (withdrawAmt > bankBalance) {
            System.out.println("Insufficient balance");
        } else {
            this.bankBalance -= withdrawAmt;
            System.out.println("withdrawn your current balance is : " + bankBalance);

        }

    }

}

// You are building a banking application that has a BankAccount class.
// Implement the BankAccount class with encapsulation principles in mind.
// Include private instance variables for the
// account number, account holder name, and account balance.

// Provide public methods to allow clients to deposit and withdraw funds,
// as well as access the account balance.
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name