package Tests;

import Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {

//    public WebDriver driver;   // o variabila globala - public variabila tip WebDriver


    @Test
    public void Test(){


//        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Chrome\\chromedriver.exe");
//             // "cheia", locul unde e driverul pe calculator
//
//             // deschizi un browser + accesam un URL
//        driver = new ChromeDriver();
//        driver.get("http://demo.automationtesting.in/Index.html");


        String expectedindexpage="Index";  //Validam pagina de index
        String actualindexpage=driver.getTitle();
        Assert.assertEquals("Index page nu a aparut",expectedindexpage,actualindexpage);  //returneaza valoarea din tag ul de titlu



        driver.manage().window().maximize();    //Facem browserul modul maximize (mare).


        WebElement SigninElement= driver.findElement(By.id("btn1"));   // declar elementul "Sign in"
        SigninElement.click();

        String expectedindexlogin="SignIn";
        String actualindexlogin=driver.getTitle();
        Assert.assertEquals("Pagina nu a fost gasit",expectedindexlogin,actualindexlogin);

        WebElement EmailElement = driver. findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue = System.currentTimeMillis()+"@gss.com";
        EmailElement.sendKeys(emailvalue);

        WebElement passwordElement = driver. findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordvalue= "parolameasecreta";
        passwordElement.sendKeys(passwordvalue);

        WebElement submitElement= driver.findElement(By.id("enterbtn"));
        submitElement.click();

            // validare mesajul de eroare

        WebElement errormessage=driver.findElement(By.id("errormsg"));
        String expectederrormessage="Invalid User Name or PassWord";
        String actualerrormessage = errormessage.getText();

        Assert.assertEquals("Mesajul de eroare pentru login nu e bun",expectederrormessage,actualerrormessage);

    }



}
