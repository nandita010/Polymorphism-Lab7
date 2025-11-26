package ie.atu.week1;

import org.w3c.dom.ls.LSOutput;

public class CustomerTest {
    public static void main(String[] args) {
        Customer part1customer=new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true

        );
        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);
    }
   /* System.out.println(part2Customer1);
    System.out.println(part2Customer2);*/
    //check the print error

}
