package pages.linux_home.all_news_filter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AllNewsFilter extends BasePage {
    public AllNewsFilter(WebDriver driver) {
        super(driver);
    }

    private final By allNews = By.xpath("//div[@id='news']/nav/a[contains(text(),'Все новости')]");
    private final By allFilter = By.xpath("//div[@class='nav-buttons']/form/select");
    private final By allFilters = By.xpath("//div[@class='nav-buttons']/form/select/option");
    private final By filterLinux = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Linux.org.ru']");
    private final By allTag = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Все темы']");
    private final By filterDock = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Документация']");
    private final By filterLinuxGeneral = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Linux General']");
    private final By filterOpenSource = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Open Source']");
    private final By filterMozilla = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Mozilla']");
    private final By filterRedHat = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Red Hat']");
    private final By filterJava = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Java']");
    private final By filterGNOME = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='GNOME']");
    private final By filterKDE = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='KDE']");
    private final By filterGNUNotUnix = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='GNU's Not Unix']");
    private final By filterSecurity = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Безопасность");
    private final By filterLinuxInRussia = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Linux в России");
    private final By filterProparitarPO = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Проприетарное ПО");
    private final By filterCoreLinux = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Ядро Linux");
    private final By filterHardwareAndDrivers = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Hardware and Drivers");
    private final By filterBSD = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='BSD");
    private final By filterDebian = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Debian");
    private final By filterOfficeApplication = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Офисные приложения");
    private final By filterPDA = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='PDA");
    private final By filterGame = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Игры");
    private final By filterSCO = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='SCO");
    private final By filterClusters = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Кластеры");
    private final By filterUbuntuLinux = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Ubuntu Linux");
    private final By filterSlackware = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Slackware");
    private final By filterApple = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Apple");
    private final By filterNovell = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Novell");
    private final By filterCalculateLinux = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Calculate Linux");
    private final By filterGentooLinux = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Gentoo Linux");
    private final By filterMulimedia = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Мультимедиа");
    private final By filterEthernet = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Интернет");
    private final By filterAndroid = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Android");
    private final By filterConferense = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Конференции и встречи");
    private final By filterGoogle = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Google");
    private final By filterDev = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='Разработка");
    private final By filterOpenBSD = By.xpath("//div[@class='nav-buttons']/form/select/option[text()='OpenBSD");

    private final By checkFilter = By.xpath("//div[@id='bd']/h1");

    public void checkLinuxFilter() {
        driver.findElement(allNews).click();
        driver.findElement(allFilter).click();
        driver.findElement(filterLinux).click();
        assertTrue(driver.findElement(checkFilter).getText().contains("Linux.org.ru"));
    }

    public void checkFilter() {
        driver.findElement(allNews).click();
        List<WebElement> elements = driver.findElements(allFilters);
//        for (int i=1;i<=elements.size();i++){
//            driver.findElement(allFilter).click();
//            driver.findElement(filterLinux).click();
//            elements.get(i).click();
//            String str = elements.get(i).getText();
//            System.out.println(str);
//            Assert.assertTrue(driver.findElement(checkFilter).getText().contains(str));
//        }
        for (WebElement element : elements) {
            driver.findElement(allFilter).click();
            if (element.getText().contains("Все новости")){
                break;
            }
            String str = element.getText();
            System.out.println(str);
            element.click();
            Assert.assertTrue(driver.findElement(checkFilter).getText().contains(str));
        }
    }
    public void check(){
        driver.findElement(allNews).click();
        WebElement selectElement = driver.findElement(By.xpath("//div[@class='nav-buttons']/form/select"));
        Select select = new Select( selectElement);

        // Получение всех элементов этого списка
        List<WebElement> options = select.getOptions();

        // Перебор всех элементов списка
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);

            // Нажатие на каждый элемент
            option.click();

            // Получение выбранного элемента списка
            WebElement selectedOption = select.getFirstSelectedOption();

            // Проверка, что выбранный элемент соответствует нажатому элементу
            if (!selectedOption.getText().equals(option.getText())) {
                System.out.println("Ошибка: выбранный элемент не соответствует нажатому");
            }
        }
    }

}
