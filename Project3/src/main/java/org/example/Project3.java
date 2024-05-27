package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {

    public static void main(String[] args) {
        // Chrome sürücüsünü ayarlayın
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application");
        WebDriver driver = new ChromeDriver();

        // www.google.com'a gidin
        driver.get("https://www.google.com/");

        // Arama kutusuna "Merhaba Dünya!" yazın ve aramayı başlatın
        driver.findElement(By.name("q")).sendKeys("Merhaba Dünya!");
        driver.findElement(By.name("q")).submit();

        // Arama sonuçlarının sayısını bulun
        int resultsCount = driver.findElements(By.xpath("//div[@class='g']")).size();

        // Sonuçları doğrulayın
        if (resultsCount > 0) {
            System.out.println("Arama sonuçları bulundu: " + resultsCount);
        } else {
            System.out.println("Arama sonucu bulunamadı");
        }

        // Tarayıcıyı kapatın
        driver.quit();
    }
}