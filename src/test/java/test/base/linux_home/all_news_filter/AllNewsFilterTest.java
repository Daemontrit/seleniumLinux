package test.base.linux_home.all_news_filter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.BaseTest;

import static constants.Constant.Urls.LINUX_HOME_PAGE;

public class AllNewsFilterTest extends BaseTest {
    @BeforeMethod
    public void openUrlLinuxHomePage() {
        basePage.open(LINUX_HOME_PAGE);
    }

    @Test
    public void checkFilterLinux() {
        allNewsFilter.checkLinuxFilter();
    }
    @Test
    public void checkAllFilter() {
        allNewsFilter.check();
    }

}
