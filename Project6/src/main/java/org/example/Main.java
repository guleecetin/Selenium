package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement buton=driver.findElement(By.id("uploadfile_0"));
        buton.sendKeys("C:\\Users\\gulen\\IdeaProjects\\Project6\\src\\images\\colloseumm.jpg");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();


        }
    }
