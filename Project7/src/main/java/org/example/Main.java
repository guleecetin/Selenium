package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static java.lang.Thread.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.id("downloadButton")).click();
        String downloadPath = "C:\\Users\\gulen\\Downloads";
        String fileName = "sampleFile.jpeg";
        Thread.sleep(2000);

        System.out.println(Download(downloadPath,fileName));

    }
        public static boolean Download(String downloadPath,String fileName){
            File file=new File(downloadPath);
            File [] files=file.listFiles();
            for(int i=0;i<files.length;i++) {
                if (files[i].getName().equals(fileName)) {
                    return true;
                }
            }
            return false;
        }
    }