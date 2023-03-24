package pages.linux_home.add_news;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.linux_home.LinuxHomePage;

import static org.testng.Assert.assertEquals;

public class AddNews extends BasePage {
    public AddNews(WebDriver driver) {
        super(driver);
    }
    private final By addNews = By.xpath("//div[@id='news']/nav/a[contains(text(),'Добавить новость')]");
    private final By documentation = By.xpath("//div[@id='bd']/ul[2]/li/a[contains(text(),'Документация')]");
    private final By titleError = By.xpath("//label[@id='title-error']");
    private final By tageError = By.xpath("//label[@id='tags-error']");
    private final By buttonPlace = By.xpath("//button[text()='Поместить']");

    public void checkAddNewsHref() {
        driver.findElement(addNews).click();
        driver.findElement(documentation).click();
        driver.findElement(buttonPlace).click();
        assertEquals(driver.findElement(titleError).getText(),"Введите заголовок");
        assertEquals(driver.findElement(tageError).getText(),"Это поле необходимо заполнить.");
    }

}
