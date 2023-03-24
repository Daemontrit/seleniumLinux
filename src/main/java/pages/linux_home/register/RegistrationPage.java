package pages.linux_home.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static org.testng.Assert.assertEquals;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    private final By registerHomePage = By.xpath("//div[@id='regmenu']/a");
    private final By register = By.xpath("//div[@class='form-actions']/button[contains(text(),'Зарегистрироваться')]");
    private final By nickError = By.xpath("//span[@id='nick-error']");
    private final By emailError = By.xpath("//span[@id='email-error']");
    private final By passwordError = By.xpath("//span[@id='password-error']");
    private final By password2Error = By.xpath("//span[@id='password2-error']");
    private final By rulesError = By.xpath("//span[@id='rules-error']");
    private final By idNick = By.xpath("//input[@id='nick']");
    private final By idEmail = By.xpath("//input[@id='email']");
    private final By idPassword = By.xpath("//input[@id='password']");
    private final By idPassword2 = By.xpath("//input[@id='password2']");
    private final By idRules = By.xpath("//input[@id='rules']");

    public void checkRegister() {
        driver.findElement(registerHomePage).click();
        driver.findElement(register).click();
        String strError="Это поле необходимо заполнить.";
        assertEquals(driver.findElement(rulesError).getText(),strError);
        assertEquals(driver.findElement(password2Error).getText(),strError);
        assertEquals(driver.findElement(passwordError).getText(),strError);
        assertEquals(driver.findElement(emailError).getText(),strError);
        assertEquals(driver.findElement(nickError).getText(),strError);

    }
    public void CheckNotValidEmail(String login,String email,String password,String password2){
        driver.findElement(registerHomePage).click();
        driver.findElement(idNick).sendKeys(login);
        driver.findElement(idEmail).sendKeys(email);
        driver.findElement(idPassword).sendKeys(password);
        driver.findElement(idPassword2).sendKeys(password2);
        driver.findElement(idRules).click();
        driver.findElement(register).click();
        assertEquals(driver.findElement(emailError).getText(),"Пожалуйста, введите корректный адрес электронной почты.");
    }
public void CheckNotValidPassword(String login,String email,String password,String password2){
        driver.findElement(registerHomePage).click();
        driver.findElement(idNick).sendKeys(login);
        driver.findElement(idEmail).sendKeys(email);
        driver.findElement(idPassword).sendKeys(password);
        driver.findElement(idPassword2).sendKeys(password2);
        driver.findElement(idRules).click();
        driver.findElement(register).click();
        assertEquals(driver.findElement(passwordError).getText(),"Пожалуйста, введите не меньше 5 символов.");
    }

}
