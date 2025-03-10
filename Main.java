public class Main {
    public static void main(String[] args){

        Account acc = new Account();

        acc.setName("Rudra");
        acc.setNumber(123456);
        acc.setBalance(2500);

        System.out.println("Your balance = " + acc.getBalance());

        acc.deposit(500);
        acc.withdraw(5000);
        acc.withdraw(1000);
    }
}