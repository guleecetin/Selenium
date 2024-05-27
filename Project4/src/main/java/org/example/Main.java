package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Stackholm=driver.findElement(By.id("box2"));
        WebElement Washington=driver.findElement(By.id("box3"));
        WebElement Copenhagen=driver.findElement(By.id("box4"));
        WebElement Seoul=driver.findElement(By.id("box5"));
        WebElement Rome=driver.findElement(By.id("box6"));
        WebElement Madrid=driver.findElement(By.id("box7"));


        WebElement Italy=driver.findElement(By.id("box106"));
        WebElement Spain=driver.findElement(By.id("box107"));
        WebElement Norway=driver.findElement(By.id("box101"));
        WebElement Denmark=driver.findElement(By.id("box104"));
        WebElement South_Korea=driver.findElement(By.id("box105"));
        WebElement Sweden =driver.findElement(By.id("box102"));
        WebElement United_States=driver.findElement(By.id("box103"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(Oslo,Norway).build().perform();
        actions.dragAndDrop(Stackholm,Sweden).build().perform();
        actions.dragAndDrop(Washington,United_States).build().perform();
        actions.dragAndDrop(Copenhagen,Denmark).build().perform();
        actions.dragAndDrop(Seoul,South_Korea).build().perform();
        actions.dragAndDrop(Rome,Italy).build().perform();
        actions.dragAndDrop(Madrid,Spain).build().perform();

    }}

