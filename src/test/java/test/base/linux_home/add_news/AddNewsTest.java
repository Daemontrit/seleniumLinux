package test.base.linux_home.add_news;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.BaseTest;

import static constants.Constant.Urls.LINUX_HOME_PAGE;

public class AddNewsTest extends BaseTest {
    @BeforeMethod
    public void openUrlLinuxHomePage() {
        basePage.open(LINUX_HOME_PAGE);
    }
    @Test
    public void voidFieldNews(){
        addNews.checkAddNewsHref();
    }

}
