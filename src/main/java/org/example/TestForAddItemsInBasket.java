package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestForAddItemsInBasket {

    private static WebDriver driver;

    public static void main(String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        Thread t = null;
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://happy-sushi.ru/");

        driver.findElement(By.xpath(".//div[@id='mixit-block']/div[@class='mixitBlock-menu']/button[@data-btn='cat17']")).click();
        t.sleep(10000);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath(".//form[@id='ms_form_137']/a")).click();
        driver.findElement(By.xpath(".//form[@id='product-form']/div[@class='product-page__content']/div[@class='row']/div[@class='col-lg-7 col-xl-6']/div[@class='product-set']/div[@class='product-set__footer']/div[@class='total-amount']/button")).click();
        t.sleep(10000);
        WebDriverWait webDriverWait1 = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath(".//div[@id='msMiniCart']/div[@class='not_empty text-center']/a")).click();

        //driver.close();
    }
}
