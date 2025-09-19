package users;

import org.testng.annotations.*;

public class UserScripts {
    @Test
    public static void createUser(){
        System.out.println("user created successfull");

    }
    @Test
    public static void modifyingUser(){
        System.out.println("user modified Successfull");

    }
    @Test
    public static void deleteUser(){
        System.out.println("user deleted successfull");
    }
    @BeforeSuite
    public static void beforsuitedemo(){
        System.out.println("User @before example");
    }
    @AfterSuite
    public static void aftersuitedemo(){
        System.out.println("user @after example");
    }
    @BeforeTest
    public static void beforTestdemo(){
        System.out.println("User @beforetest example");
    }
    @AfterTest
    public static void aftertestdemo(){
        System.out.println("User @Aftertest example");
    }
    @BeforeClass
    public static void beforClassdemo(){
        System.out.println("User @beforeClass example");
    }
    @AfterClass
    public static void afterClassdemo(){
        System.out.println("User @AfterClass example");
    }
    @BeforeMethod
    public static void beforMethoddemo(){
        System.out.println("User @beforeMethod example");
    }
    @AfterMethod
    public static void afterMethoddemo(){
        System.out.println("User @AfterMethod example");
    }
}
