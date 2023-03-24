package test.base.linux_home.register;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.BaseTest;

import static constants.Constant.Urls.LINUX_HOME_PAGE;

public class RegistrationPageTest extends BaseTest {
    @BeforeMethod
    public void openUrlLinuxHomePage() {
        basePage.open(LINUX_HOME_PAGE);
    }
    @Test
    public void voidFieldRegister(){
        registrationPage.checkRegister();
    }
    @Test
    public void CheckNotValidEmail(){
        registrationPage.CheckNotValidEmail("ParamPamPam","test@test","12345","12345");
    }
    @Test
    public void CheckNotValidPassword(){
        registrationPage.CheckNotValidPassword("ParamPamPam","test@test.ru","1234","1234");
    }
}
