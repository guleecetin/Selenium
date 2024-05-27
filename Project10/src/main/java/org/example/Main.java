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
        driver.get("https://demo.guru99.com/test/social-icon.html");
        String expectdata="Github";
        WebElement githubButton =driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[4]"));
        String actualData=githubButton.getAttribute("title");
        expectdata.equals(actualData);
        if(expectdata.equals(actualData)) {
            System.out.println("tooltip is valid");
        }
        else{
            System.out.println("tooltip is not valid");

        }
    }
}