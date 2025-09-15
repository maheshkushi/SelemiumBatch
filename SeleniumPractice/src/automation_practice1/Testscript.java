package automation_practice1;

import org.openqa.selenium.WebDriver;

public class Testscript extends ResuableMethods {
    public static void main(String[] args) {
        TS_LoginLogout();
        create_user();
    }
    public static void TS_LoginLogout(){
        WebDriver oBrowers=null;

        try{
            oBrowers = launchBrowser("Edge");
            boolean blnRes =navigateURL(oBrowers, "http://localhost/login.do");
              blnRes = loginToApplication(oBrowers,"admin","manager");
              String username = createUser(oBrowers);
              blnRes = deleteUser(oBrowers,username);
              blnRes = logoutFromActiTime(oBrowers);

        }catch(Exception e){
            System.out.println(" Exception in 'TS_LoginLogout' test script");
        }finally {
            oBrowers.close();
            oBrowers=null;
        }
    }

    public static void create_user(){
        WebDriver object = null;

        try{
            object = launchBrowser("Edge");
            boolean blnRes =navigateURL(object, "http://localhost/login.do");
            blnRes = loginToApplication(object,"admin","manager");
            String username = createUser(object);
            blnRes = deleteUser(object,username);
            blnRes = logoutFromActiTime(object);


        }catch (Exception en){
            System.out.println(" Exception in 'TS_LoginLogout' test script");
        }finally {

        }
    }
}
