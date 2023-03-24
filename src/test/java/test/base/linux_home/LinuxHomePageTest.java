package test.base.linux_home;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.BaseTest;

import static constants.Constant.Urls.LINUX_HOME_PAGE;

public class LinuxHomePageTest extends BaseTest {

    @BeforeMethod
    public void openUrlLinuxHomePage() {
        basePage.open(LINUX_HOME_PAGE);
    }

    @Test
    public void checkCountNewsTest() {
        linuxHomePage.checkCountNews();
        linuxHomePage.checkFirstNewsHref();

    }

    @Test
    public void checkFirstNewsHrefDownloadBinarPackageLinuxTest() {
        linuxHomePage.checkFirstNewsHrefDownloadBinarPackageLinux();
    }

    @Test
    public void checkFirstNewsHrefWebsiteSimulIDE() {
        linuxHomePage.checkFirstNewsHrefWebsiteSimulIDE();
    }

    @Test
    public void checkTegCadtest() {
        linuxHomePage.checkTegCad();
    }

    @Test
    public void checkTegEdatest() {
        linuxHomePage.checkTegEda();
    }

    @Test
    public void checkTegRadioAmateurs() {
        linuxHomePage.checkTegRadioAmateurs();
    }

    @Test
    public void checkTegElectronic() {
        linuxHomePage.checkTegElectronic();
    }

    @Test
    public void CommentFirstNews() {
        linuxHomePage.CommentFirstNews();
    }

    @Test
    public void checkImagesTest() {
        linuxHomePage.checkImageOnTheHomePage()
                .checkImageAfterTransitionHref();
    }

    @Test
    public void checkingThatTheUserTimeAndDAteAreDisplayedCorrectly() {
        linuxHomePage.checkingThatTheUserTimeAndDAteAreDisplayedCorrectly();
    }

    @Test
    public void checkEntrance() {
        linuxHomePage.checkEnter()
                .checkEnterField("slava", "1234");
    }

    @Test
    public void checkRegister() {
        linuxHomePage.checkRegister();
    }

    @Test
    public void checkMenuNews() {
        linuxHomePage.checkMenuNews().checkMenuNewsHref();
    }

    @Test
    public void checkMenuGalery() {
        linuxHomePage.checkMenuGalery().checkMenuGaleryHref();
    }

    @Test
    public void checkMenuForum() {
        linuxHomePage.checkMenuForum().checkMenuForumHref();
    }

    @Test
    public void checkMenuTreker() {
        linuxHomePage.checkMenutreker().checkMenuTrekerHref();
    }

    @Test
    public void checkMenuSearch() {
        linuxHomePage.checkMenuSearch().checkMenuSearchHref();
    }

    @Test
    public void checkCountopics() {
        linuxHomePage.checkCounTopics();
    }

    @Test
    public void checkAddNews() {
        linuxHomePage.checkAddNews().checkAddNewsHref();
    }

    @Test
    public void checkAllNews() {
        linuxHomePage.checkAllNews().checkAllNewsHref();
    }

    @Test
    public void checkAnconfirmeNews() {
        linuxHomePage.checkAnconfirmeNews().checkAnconfirmeNewsHref();
    }

}
