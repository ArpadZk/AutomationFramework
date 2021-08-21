package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public WebDriver driver;   // o variabila globala - public variabila tip WebDriver


    @Test
    public void Test(){


        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Chrome\\chromedriver.exe");// "cheia", locul unde e driverul pe calculator

        // deschizi un browser + accesam un URL
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Index.html");
        //Facem browserul modul maximize (mare).
        driver.manage().window().maximize();

        // declar elementul "Sign in"

        WebElement SigninElement= driver.findElement(By.id("btn1"));
        SigninElement.click();
        WebElement EmailElement = driver. findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue = "alexandru.alexandruy@gss.com";
        EmailElement.sendKeys(emailvalue);

        WebElement passwordElement = driver. findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordvalue= "parolameasecreta ";
        passwordElement.sendKeys(passwordvalue);

        WebElement submitElement= driver.findElement(By.id("enterbtn"));
        submitElement.click();





    }



}
