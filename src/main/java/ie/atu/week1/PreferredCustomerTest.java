
    package ie.atu.week1;

    public class PreferredCustomerTest {
        public static void main(String[] args) {

            PreferredCustomer pc = new PreferredCustomer();
            pc.setName("Charlie Customer");
            pc.setAddress("3 Middle Road");
            pc.setPhoneNumber("0871112222");
            pc.setCustomerNumber(2001);
            pc.setMailingList(true);

            System.out.println(pc);  // before points

            pc.addLoyaltyPoints(700);
            System.out.println(pc);  // after 700 points (5% discount)

            pc.addLoyaltyPoints(800);
            System.out.println(pc);  // after 1500 total points (7% discount)
        }
    }


