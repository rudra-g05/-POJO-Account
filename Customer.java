public class Customer {

    private String name;
    private Double creditLimit;
    private String email;

    public Customer(){
        this("Rudra", 10000.00, "rudra@email.com");
    }

    public Customer(String name, String email){
        this(name, 5000.00, email);
    }

    public Customer(String name, Double creditLimit, String email){
        System.out.println("I'm calling constructer for the first time");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public Double getCreditLimit(){
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }

}
