package scripting_3;

import org.openqa.selenium.WebDriver;
import java.util.Map;

public class Testscript extends  ResuableMethods{
    public static void main(String[] args) {
        TS_LoginLogout();
        //create_user();
    }
    public static void TS_LoginLogout(){
        WebDriver oBrowers=null;
        Map<String,String> data = null;

        try{
            data = getPropData("TestData"); // "TestData mens the data taking from propertie file
            oBrowers = launchBrowser(data.get("browserName")); // "browserName" means its a key value
            boolean blnRes =navigateURL(oBrowers,data.get("url"));
              blnRes = loginToApplication(oBrowers,data.get("userName"),data.get("password"));
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
        Map<String,String> data = null;

        try{
            data = getPropData("TestData");
            object = launchBrowser(data.get("browserName"));
            boolean blnRes =navigateURL(object,data.get("url"));
            blnRes = loginToApplication(object,data.get("userName"),data.get("password"));
            String username = createUser(object, data);
            blnRes = deleteUser(object,username);
            blnRes = logoutFromActiTime(object);


        }catch (Exception en){
            System.out.println(" Exception in 'TS_LoginLogout' test script");
        }finally {
            object.close();
            object = null;
        }
    }
}
