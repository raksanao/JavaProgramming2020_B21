package day41_Encapsulation;

public class BankAccount {

    public final static String bankName = "Bank Of America";
    public String firstName, lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName.toUpperCase()+" "+lastName.toUpperCase();
    }




}

/*
    create costum class called BankAccount for Bank of America

            public variables:  bankName, firstName, lastName

            private variables: accountHolder, accountNumber, balance

            encapsulate all the private data
                    (DO NOT USE SHORTCUT)

            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)

            public methods:
                    deposit (apply set Methods)
                    withdraw (apply set Methods)
                    availableBalance (apply getter)
 */
