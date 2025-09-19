package customers;

import org.testng.annotations.Test;

public class CustomerScripts {

    @Test
    public static void createCustomer(){
        System.out.println("customer created");

    }
    @Test
    public static void modifyingCustomer(){
        System.out.println(" customer modified");

    }
    @Test
    public static void deleteCustomer(){
        System.out.println("customer user deleted");
    }

}
