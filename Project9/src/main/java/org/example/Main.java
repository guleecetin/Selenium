package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();
        List<String> tabs=new java.util.ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
       WebElement buton= driver.findElement(By.name("emailid"));
        buton.sendKeys("gulendamcetin970@gmail.com");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();


    }
    }
