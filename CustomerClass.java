public class CustomerClass {
    public static void main(String[] args){

        Customer customer1 = new Customer();
        System.out.println(customer1.getName() + " ; " +
                customer1.getCreditLimit() + " ; " +
                customer1.getEmail());

        Customer customer2 = new Customer("RGupta", "rgupta@email.com");
        System.out.println(customer2.getName() + " ; " +
                customer2.getCreditLimit() + " ; " +
                customer2.getEmail());

        Customer customer3 = new Customer("RKG", 250.0, "rkg@email.com");
        System.out.println(customer3.getName() + " ; " +
                customer3.getCreditLimit() + " ; " +
                customer3.getEmail());

    }
}
