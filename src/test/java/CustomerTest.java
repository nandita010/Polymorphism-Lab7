import ie.atu.week1.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
Customer part1Customer= new Customer{

        String s = "Alice Smith";
        String address = "1 High Street";
        String phoneNumber = "0851234567";
        int customerNumber = 1001;
        boolean mailingList = true;

        System.out.println(part1Customer);
}

    public Customer part2Customer= new Customer{
part2Customer.setName("Bob Jones");
part2Customer.setAddress("2 Low Street");
part2Customer.setPhoneNumber("0867654321");
part2Customer.setCustomerNumber(1002);
part2Customer.setMailingList(false);

System.out.println(part2Customer);
    }

}
