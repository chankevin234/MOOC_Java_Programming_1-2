public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account mattAcct = new Account("Matthews account", 1000.0);
        Account myAcct = new Account("My account", 0);

        mattAcct.withdrawal(100.0);
        myAcct.deposit(100.0);

        System.out.println(mattAcct);
        System.out.println(myAcct);
    }
}
