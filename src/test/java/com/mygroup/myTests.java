package com.mygroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class MyTests {
    
    @Test
    public void sampleTest() {
        System.out.println("This is a sample TestNG test.");
        
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");

    }

}