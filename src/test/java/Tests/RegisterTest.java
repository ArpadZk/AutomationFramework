package Tests;

import Base.BaseTest;
import Helpmethodes.ElementMethodes;
import Helpmethodes.PageMethodes;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class RegisterTest extends BaseTest {
   public WebDriver driver;
   public ElementMethodes elementMethodes;
   public PageMethodes pageMethodes;


//     public WebDriver driver;

     @Test
      public void testRegister() {


//         System.setProperty("webdriver.chrome.driver", "C:\\automation\\Chrome\\chromedriver.exe");
//         driver = new ChromeDriver();
//         driver.get("http://demo.automationtesting.in/Index.html");
//         driver.manage().window().maximize();
      elementMethodes = new ElementMethodes(driver);
      pageMethodes = new PageMethodes(driver);

         //Validam pagina de de pornire
         String expectedindexpage = "Index";
         String actualindexpage = driver.getTitle();// returneaza valoarea din tag-ul de titlu
         Assert.assertEquals("Index page nu a aparut", expectedindexpage, actualindexpage);

         WebElement Skipsigninbutton = driver.findElement(By.id("btn2"));
         Skipsigninbutton.click();

         //Validam pagina de inregistrare
         String expectedindezpageinregistrare = "Register";
         String actualindexpageinregistrare = driver.getTitle();//returneaza valoarea din tag ul de titlu
         Assert.assertEquals("pagina deinregistrare nu e corect", expectedindezpageinregistrare, actualindexpageinregistrare);

         WebElement Firstnameelement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
         String firstnamevalue = "Arpad Zsolt";
         Firstnameelement.sendKeys(firstnamevalue);

         WebElement Lastnameelement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
         String lastnamevalue = "Kisgyorgy";
         Lastnameelement.sendKeys(lastnamevalue);

         WebElement Addresselement = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
         String addressvalue = "Cluj Napoca";
         Addresselement.sendKeys(addressvalue);

         WebElement EmailElement = driver.findElement(By.cssSelector("input[type='email']"));
         String emailvalue = System.currentTimeMillis() + "@gmail.com";
         EmailElement.sendKeys(emailvalue);

         WebElement PhonenumberElement = driver.findElement(By.cssSelector("input[type='tel']"));
         String telnumbervalue = "0723506849";
         PhonenumberElement.sendKeys(telnumbervalue);

         WebElement LanguagesElement = driver.findElement(By.id("msdd"));
         LanguagesElement.click();
         List<WebElement> Languagesvalue = driver.findElements(By.cssSelector(".ui-autocomplete.ui-front li"));
         String Languagesdvalue = "Arabic";
         String Languagesd2value = "English";
         for (WebElement webElement : Languagesvalue) {
             if (webElement.getText().equals(Languagesdvalue) || webElement.getText().equals(Languagesd2value)) {
                 webElement.click();
             }
         }
         Addresselement.click();

         WebElement CountrySelectElement = driver.findElement(By.cssSelector(".select2-selection"));
         CountrySelectElement.click();

         WebElement CountryS2Element = driver.findElement(By.cssSelector(".select2-search__field"));
         CountryS2Element.sendKeys("India", Keys.RETURN);
         // CountryS2Element.sendKeys(Keys.ENTER);

         WebElement Malebuttonelement = driver.findElement(By.cssSelector("input[value='Male']"));
         Malebuttonelement.click();

         WebElement Moviesbuttonelement = driver.findElement(By.cssSelector("input[value='Movies']"));
         Moviesbuttonelement.click();

         WebElement SkilldropdownElement = driver.findElement(By.id("Skills"));
         Select skillselect = new Select(SkilldropdownElement);
         skillselect.selectByVisibleText("Tech Support");

         WebElement SeleccountrydropdownElement = driver.findElement(By.id("countries"));
         Select select2countrycontainer = new Select(SeleccountrydropdownElement);
         select2countrycontainer.selectByVisibleText("Australia");

         WebElement YearselectElement = driver.findElement(By.id("yearbox"));
         Select Yearselect = new Select(YearselectElement);
         Yearselect.selectByValue("1994");

         WebElement MonthElement = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
         Select Monthselect = new Select(MonthElement);
         Monthselect.selectByValue("June");

         WebElement DayselectElement = driver.findElement(By.id("daybox"));
         Select Dayselect = new Select(DayselectElement);
         Dayselect.selectByValue("20");

         WebElement importElement = driver.findElement(By.id("imagesrc"));
         String importfile = "C:\\Users\\Arpad\\Pictures\\Saved Pictures";
         importElement.sendKeys(importfile);

         WebElement PasswordElement = driver.findElement(By.id("firstpassword"));
         String firstpasswordvalue = "Jegesmedve";
         PasswordElement.sendKeys(firstpasswordvalue);

         WebElement ConfirmPasswordElement = driver.findElement(By.id("secondpassword"));
         String secondpasswordvalue = "Jegesmedve";
         ConfirmPasswordElement.sendKeys(secondpasswordvalue);

         WebElement SubmitButtonElement = driver.findElement(By.id("submitbtn"));
         SubmitButtonElement.click();

     }

}


