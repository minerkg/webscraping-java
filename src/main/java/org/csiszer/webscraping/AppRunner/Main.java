package org.csiszer.webscraping.AppRunner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Optional;

public class Main {

//    public static void setupWebdriverChromeDriver() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
//    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //find the search input filed
        Optional<WebElement> element = Optional.ofNullable(driver.findElement(By.id("twotabsearchtextbox")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        if (element.isPresent()) {
            element.get().click();
            // search for any keyword
            element.get().sendKeys("BMW");
            WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            
            searchButton.click();
        }


        //driver.close();




    }
}