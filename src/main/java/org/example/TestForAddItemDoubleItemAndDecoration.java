package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestForAddItemDoubleItemAndDecoration {

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

        driver.findElement(By.xpath(".//form[@id='ms_form_147']/button")).click();

        t.sleep(10000);
        WebDriverWait webDriverWait2 = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath(".//div[@id='msMiniCart']/div[@class='not_empty text-center']/a")).click();
        driver.findElement(By.xpath(".//div[@class='product-counter product-counter--big']/button[@class='product-counter--plus product-counter-btn']")).click();
        driver.findElement(By.xpath(".//div[@class='basket-btn']/a")).click();
        //driver.close();
    }
}
