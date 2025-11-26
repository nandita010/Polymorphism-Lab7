package ie.atu.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person;
        person = new Person("John","Dublin", "12345");//put breakpoint here and watch inheritance happen with the extension of customer
        System.out.println(person.toString());
        Customer customer= new Customer("Paul", "Gort", "12345", 12, true);
        System.out.println(customer.toString());


    }
    }