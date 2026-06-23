public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if(id == 101) {
            return "Ramya Sri";
        }

        return "Customer Not Found";
    }
}