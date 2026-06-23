public class DependencyInjectionDemo {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        String customer = service.getCustomerById(101);

        System.out.println("Customer Name: " + customer);
    }
}