package test.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import pages.BasePage;
import pages.linux_home.LinuxHomePage;
import pages.linux_home.add_news.AddNews;
import pages.linux_home.all_news_filter.AllNewsFilter;
import pages.linux_home.register.RegistrationPage;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LinuxHomePage linuxHomePage = new LinuxHomePage(driver);
    protected RegistrationPage registrationPage=new RegistrationPage(driver);
    protected AllNewsFilter allNewsFilter=new AllNewsFilter(driver);
    protected AddNews addNews=new AddNews(driver);

//@AfterTest
//    public void clearCookiesAndLocalStorage(){
//        if(CLEAR_COOKIES_AND_STORAGE){
//            JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
//            driver.manage().deleteAllCookies();
//            javascriptExecutor.executeAsyncScript("window.sessionStorage.clear()");
//        }
//    }

    //    @AfterSuite(alwaysRun = true)
//    public void close(){
//    if(HOLD_BROWSER_OPEN){
//        driver.quit();
//    }
//    }
    @AfterTest
    public void close() {
        driver.quit();
    }
}
