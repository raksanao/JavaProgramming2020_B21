package day41_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Josh", "Jones", 123456);

        System.out.println( obj1.getAccountHolder());
        System.out.println( obj1.getBalance()  );
        obj1.availableBalance();



    }

}
