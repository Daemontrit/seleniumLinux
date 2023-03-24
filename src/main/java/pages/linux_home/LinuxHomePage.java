package pages.linux_home;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import static org.testng.Assert.*;

public class LinuxHomePage extends BasePage {
    public LinuxHomePage(WebDriver driver) {
        super(driver);
    }

    private final By news = By.xpath("//article[@class='news']");
    private final By newsFirstElement = By.xpath("//article[@id='topic-17163962']/h1/a");
    private final By newsTextFirstElement = By.xpath("//article[@id='topic-17163962']/header/h1/a");

    private final By newsHrefDownloadBinarPackageLinux = By.xpath("//article[@id='topic-17163962']//p[contains(text(),'Скачать бинарные пакеты для Linux можно здесь:')]/a");
    private final By newsHrefSimulIDE = By.xpath("//article[@id='topic-17163962']//a[contains(text(),'Сайт проекта SimulIDE')]");

    private final By tegCad = By.xpath("//article[@id='topic-17163962']//p[@class='tags']/a[text()='cad']");
    private final By textTegCad = By.xpath("//div[@id='bd']//h1[contains(text(),'Cad')]");
    private final By tegEda = By.xpath("//article[@id='topic-17163962']//p[@class='tags']/a[text()='eda']");
    private final By textTegEda = By.xpath("//div[@id='bd']//h1[contains(text(),'Eda')]");
    private final By tegRadioAmateurs = By.xpath("//article[@id='topic-17163962']//p[@class='tags']/a[text()='радиолюбители']");
    private final By textTegRadioAmateurs = By.xpath("//div[@id='bd']//h1[contains(text(),'Радиолюбители')]");
    private final By tegElectronica = By.xpath("//article[@id='topic-17163962']//p[@class='tags']/a[text()='электроника']");
    private final By textTegElectronica = By.xpath("//div[@id='bd']//h1[contains(text(),'Электроника')]");
    private final By countUsersComent = By.xpath("//article[@class='msg']");
    private final By hrefOnTheUsersComment = By.xpath("//article[@id='topic-17163962']//div[@class='nav']/a");
    private final By imageInFirstNews = By.xpath("//article[@id='topic-17163962']//img");
    private final By authorNews = By.xpath("//article[@id='topic-17163962']//a[@rel='author']");
    private final By dateAndTime = By.xpath("//article[@id='topic-17163962']//time");
    private final By entrance = By.xpath("//a[@id='loginbutton']");
    private final By register = By.xpath("//div[@id='regmenu']/a");
    private final By nickOrEmail = By.xpath("//form[@id='regform']/label[contains(text(),'Имя')]");
    private final By parol = By.xpath("//form[@id='regform']/label[contains(text(),'Пароль')]");
    private final By menuNuws = By.xpath("//div[@class='menu']/ul/li/a[contains(text(),'Новости')]");
    private final By menuGalery = By.xpath("//div[@class='menu']/ul/li/a[contains(text(),'Галерея')]");
    private final By menuArticle = By.xpath("//div[@class='menu']/ul/li/a[contains(text(),'Статьи')]");
    private final By menuForum = By.xpath("//div[@class='menu']/ul/li/a[contains(text(),'Форум')]");
    private final By menuTreker = By.xpath("//div[@class='menu']/ul/li/a[contains(text(),'Трекер')]");
    private final By menuSearch = By.xpath("//div[@class='menu']/ul/li/a[contains(text(),'Поиск')]");
    private final By top10 = By.xpath("//div[@class='boxlet']/h2[contains(text(),'Top 10')]/../div/ul/li");
    private final By addNews = By.xpath("//div[@id='news']/nav/a[contains(text(),'Добавить новость')]");
    private final By allNews = By.xpath("//div[@id='news']/nav/a[contains(text(),'Все новости')]");
    private final By anconfirmedNews = By.xpath("//div[@id='news']/nav/a[contains(text(),'Неподтвержденные новости')]");


    public void checkCountNews() {
        int countNews = driver.findElements(news).size();
        assertEquals(countNews, 5);
    }

    public void checkFirstNewsHref() {
        String hrefFirstNews = driver.findElement(newsFirstElement).getAttribute("href");
        String textFirstNews = driver.findElement(newsFirstElement).getText();
        driver.findElement(newsFirstElement).click();
        assertEquals(driver.getCurrentUrl(), hrefFirstNews);
        assertEquals(driver.findElement(newsTextFirstElement).getText(), textFirstNews);

    }

    public void checkFirstNewsHrefDownloadBinarPackageLinux() {
        String hrefFirstNews = driver.findElement(newsHrefDownloadBinarPackageLinux).getAttribute("href");
        driver.findElement(newsHrefDownloadBinarPackageLinux).click();
        assertEquals(driver.getCurrentUrl(), hrefFirstNews);

    }

    public void checkFirstNewsHrefWebsiteSimulIDE() {
        String href = driver.findElement(newsHrefSimulIDE).getAttribute("href");
        driver.findElement(newsHrefSimulIDE).click();
        assertEquals(driver.getCurrentUrl(), href);

    }

    public void checkTegCad() {
        String hrefTagCard = driver.findElement(tegCad).getAttribute("href");
        driver.findElement(tegCad).click();
        String textFirstNews = driver.findElement(textTegCad).getText();
        assertEquals(driver.getCurrentUrl(), hrefTagCard);
        assertTrue(textFirstNews.contains("Cad"));

    }

    public void checkTegEda() {
        String hrefTagCard = driver.findElement(tegEda).getAttribute("href");
        driver.findElement(tegEda).click();
        String textFirstNews = driver.findElement(textTegEda).getText();
        assertEquals(driver.getCurrentUrl(), hrefTagCard);
        assertTrue(textFirstNews.contains("Eda"));
    }

    public void checkTegRadioAmateurs() {
        String hrefTagCard = driver.findElement(tegElectronica).getAttribute("href");
        driver.findElement(tegElectronica).click();
        String textFirstNews = driver.findElement(textTegElectronica).getText();
        assertEquals(driver.getCurrentUrl(), hrefTagCard);
        assertTrue(textFirstNews.contains("Электроника"));
    }

    public void checkTegElectronic() {
        String hrefTagCard = driver.findElement(tegRadioAmateurs).getAttribute("href");
        driver.findElement(tegRadioAmateurs).click();
        String textFirstNews = driver.findElement(textTegRadioAmateurs).getText();
        assertEquals(driver.getCurrentUrl(), hrefTagCard);
        assertTrue(textFirstNews.contains("Радиолюбители"));
    }

    public void CommentFirstNews() {
        String hrefTagCard = driver.findElement(hrefOnTheUsersComment).getAttribute("href");
        String str = driver.findElement(hrefOnTheUsersComment).getText();
        String[] parts = str.split(" ");
        String res = parts[0];
        int result = Integer.parseInt(res);
        driver.findElement(hrefOnTheUsersComment).click();
        assertEquals(driver.getCurrentUrl(), hrefTagCard);
        int countComment = driver.findElements(countUsersComent).size() - 1;
        assertEquals(countComment, result);
    }

    public LinuxHomePage checkImageOnTheHomePage() {
        WebElement image = driver.findElement(imageInFirstNews);
        Boolean examination = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", image);
        assertTrue(examination, "Image present");
        return this;
    }

    public LinuxHomePage checkImageAfterTransitionHref() {
        driver.findElement(newsFirstElement).click();
        WebElement image = driver.findElement(imageInFirstNews);
        Boolean examination = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", image);
        assertTrue(examination, "Image present");
        return this;
    }

    public void checkingThatTheUserTimeAndDAteAreDisplayedCorrectly() {
        driver.findElement(newsFirstElement).click();
        assertNotNull(authorNews);
        assertNotNull(dateAndTime);
    }

    public LinuxHomePage checkEnter() {
        String str = driver.findElement(entrance).getText();
        assertEquals(str, "Вход");
        return this;

    }

    public LinuxHomePage checkEnterField(String email, String par) {
        driver.findElement(entrance).click();
        driver.findElement(nickOrEmail).sendKeys(email);
        driver.findElement(parol).sendKeys(par);
        assertNotNull(nickOrEmail);
        assertNotNull(parol);
        return this;

    }

    public void checkRegister() {
        String str = driver.findElement(register).getText();
        assertEquals(str, "Регистрация");
    }

    public LinuxHomePage checkMenuNews() {
        String str = driver.findElement(menuNuws).getText();
        assertEquals(str, "Новости");
        return this;
    }

    public LinuxHomePage checkMenuNewsHref() {
        String href = driver.findElement(menuNuws).getAttribute("href");
        driver.findElement(menuNuws).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public LinuxHomePage checkMenuGalery() {
        String str = driver.findElement(menuGalery).getText();
        assertEquals(str, "Галерея");
        return this;
    }

    public LinuxHomePage checkMenuGaleryHref() {
        String href = driver.findElement(menuGalery).getAttribute("href");
        driver.findElement(menuGalery).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public LinuxHomePage checkMenuForum() {
        String str = driver.findElement(menuForum).getText();
        assertEquals(str, "Форум");
        return this;
    }

    public LinuxHomePage checkMenuForumHref() {
        String href = driver.findElement(menuForum).getAttribute("href");
        driver.findElement(menuForum).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public LinuxHomePage checkMenutreker() {
        String str = driver.findElement(menuTreker).getText();
        assertEquals(str, "Трекер");
        return this;
    }

    public LinuxHomePage checkMenuTrekerHref() {
        String href = driver.findElement(menuTreker).getAttribute("href");
        driver.findElement(menuTreker).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public LinuxHomePage checkMenuSearch() {
        String str = driver.findElement(menuSearch).getText();
        assertEquals(str, "Поиск");
        return this;
    }

    public LinuxHomePage checkMenuSearchHref() {
        String href = driver.findElement(menuSearch).getAttribute("href");
        driver.findElement(menuSearch).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public void checkCounTopics() {
        int countNews = driver.findElements(top10).size();
        assertEquals(countNews, 10);
    }

    public LinuxHomePage checkAddNews() {
        String str = driver.findElement(addNews).getText();
        assertEquals(str, "Добавить новость");
        return this;
    }

    public LinuxHomePage checkAddNewsHref() {
        String href = driver.findElement(addNews).getAttribute("href");
        driver.findElement(addNews).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public LinuxHomePage checkAllNews() {
        String str = driver.findElement(allNews).getText();
        assertEquals(str, "Все новости");
        return this;
    }

    public LinuxHomePage checkAllNewsHref() {
        String href = driver.findElement(allNews).getAttribute("href");
        driver.findElement(allNews).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

    public LinuxHomePage checkAnconfirmeNews() {
        String str = driver.findElement(anconfirmedNews).getText();
        assertEquals(str, "Неподтвержденные новости");
        return this;
    }

    public LinuxHomePage checkAnconfirmeNewsHref() {
        String href = driver.findElement(anconfirmedNews).getAttribute("href");
        driver.findElement(anconfirmedNews).click();
        assertEquals(driver.getCurrentUrl(), href);
        return this;
    }

}
