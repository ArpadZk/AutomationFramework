package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

     public WebDriver driver;

     @Test
      public void Test(){
          System.setProperty("webdriver.chrome.driver", "C:\\automation\\Chrome\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get("http://demo.automationtesting.in/Index.html");
     }

    //Interactionezi cu un dropdown
     WebElement CountrydropdownElement = driver.findElement(By.id("country"));
     Select Countryselect = new Select(CountrydropdownElement);


}
