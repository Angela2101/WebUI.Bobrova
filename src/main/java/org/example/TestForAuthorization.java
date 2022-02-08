package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class TestForAuthorization
{
    private static WebDriver driver;

    public static void main(String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://happy-sushi.ru/");
        WebElement webElement = driver.findElement(By.xpath(".//div[@class='user-log-in']/a"));
        webElement.click();

        driver.findElement(By.xpath(".//div[@class='form-item__group form-item__username']/input"))
                .sendKeys("lik.bobrova@yandex.ru");

        driver.findElement(By.xpath(".//div[@class='form-item__group form-item__password']/input"))
                .sendKeys("Angela21A");

        driver.findElement(By.xpath(".//div[@class='custom-tab__box custom-tab__one active']/form[@class='authorization-form']/div[@class='form-item form-item--btn']/button")).click();

        //driver.close();
    }
}
