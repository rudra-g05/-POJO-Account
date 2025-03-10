public class Account {

    private int number;
    private double balance;
    private String name;
    private String email;
    private int phoneNum;

    public int getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }


    public void setNumber(int number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }


    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit = ₹" + amount);
        System.out.println("Current Balance = ₹" + balance);
    }
    public void withdraw ( double amount) {
        if ((balance - amount) < 0) {
            System.out.println("Balance is not enough, it lacks = \u20B9" + (amount - balance));
        } else {
            balance -= amount;
            System.out.println("Withdraw = \u20B9" + amount);
            System.out.println("Current Balance = \u20B9" + balance);
        }
    }
}
