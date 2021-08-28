package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class RegisterTest {

     public WebDriver driver;

     @Test
      public void testRegister() {
         System.setProperty("webdriver.chrome.driver", "C:\\automation\\Chrome\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("http://demo.automationtesting.in/Index.html");
         driver.manage().window().maximize();

         //Validam pagina de de pornire
         String expectedindexpage="Index";
         String actualindexpage=driver.getTitle();// returneaza valoarea din tag-ul de titlu
         Assert.assertEquals("Index page nu a aparut",expectedindexpage,actualindexpage);

         WebElement Skipsigninbutton = driver.findElement(By.id("btn2"));
         Skipsigninbutton.click();

         //Validam pagina de inregistrare
         String expectedindezpageinregistrare="Register";
         String actualindexpageinregistrare =driver.getTitle();//returneaza valoarea din tag ul de titlu
         Assert.assertEquals("pagina deinregistrare nu e corect",expectedindezpageinregistrare,actualindexpageinregistrare);

         WebElement Firstnameelement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
         String firstnamevalue="Arpad Zsolt";
         Firstnameelement.sendKeys(firstnamevalue);

         WebElement Lastnameelement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
         String lastnamevalue="Kisgyorgy";
         Lastnameelement.sendKeys(lastnamevalue);

        WebElement Addresselement = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
        String addressvalue="Cluj Napoca";
        Addresselement.sendKeys(addressvalue);

        WebElement LanguagesElement = driver.findElement(By.id("msdd"));
        LanguagesElement.click();
        List<WebElement> Languagesvalue = driver.findElements(By.cssSelector(".ui-autocomplete.ui-front li"));
        String Languagesdvalue ="Arabic";
        String Languagesd2value ="English";
        for (int i=0; i<Languagesvalue.size(); i++){
            if (Languagesvalue.get(i).getText().equals(Languagesdvalue) || Languagesvalue.get(i).getText().equals(Languagesd2value)){
                Languagesvalue.get(i).click();
            }
        }
        Addresselement.click();

        WebElement CountrySelectElement = driver.findElement(By.cssSelector(".select2-selection"));
        CountrySelectElement.click();

        WebElement CountryS2Element = driver.findElement(By.cssSelector(".select2-search__field"));
        CountryS2Element.sendKeys("India",Keys.RETURN);
       // CountryS2Element.sendKeys(Keys.ENTER);










//         WebElement EmailElement = driver.findElement(By.cssSelector("imput[placeholder='Email']"));
//         String emailvalie ="kisgyorgyza@gmail.com";
//         EmailElement.sendKeys(emailvalie);
//
//         WebElement PhoneElement = driver.findElement(By.cssSelector("imput[placeholder='tel']"));
//         String phonevalue="0726395067";
//         PhoneElement.sendKeys(phonevalue);
//
//         WebElement Malebuttonelement = driver.findElement(By.cssSelector("input[value='Male']"));
//         Malebuttonelement.click();
//
//         WebElement Moviesbuttonelement = driver.findElement(By.cssSelector("input[value='Movies']"));
//         Moviesbuttonelement.click();
//
//         //Interactionez cu un dropdown
//         WebElement CountydropdownElement = driver.findElement(By.id("countries"));
//         Select countryselect = new Select(CountydropdownElement);
//         countryselect.selectByVisibleText("Hungary");
//
//         WebElement SeleccountrydropdownElement = driver.findElement(By.cssSelector("imput[placeholder='country']"));
//         Select  select2countrycontainer = new Select(SeleccountrydropdownElement);
//         select2countrycontainer.selectByVisibleText("Australia");
//
//         WebElement SkilldropdownElement = driver.findElement(By.id("Skills"));
//         Select skillselect = new Select(SkilldropdownElement);
//         skillselect.selectByVisibleText("Tech Support");
//
//         WebElement YearselectElement = driver.findElement(By.id("yearbox"));
//         Select Yearselect = new Select(YearselectElement);
//         Yearselect.selectByValue("1994");
//
//         WebElement DayselectElement = driver.findElement(By.id("daybox"));
//         Select Dayselect = new Select(DayselectElement);
//         Dayselect.selectByValue("20");
//
//         WebElement importElement = driver.findElement(By.id("imagesrc"));
//         String importfile ="C:\\Users\\Arpad\\Pictures\\Saved Pictures";
//         importElement.sendKeys(importfile);
//
//         WebElement PasswordElement = driver.findElement(By.cssSelector("input[placeholder='firstpassword']"));
//         String firstpasswordvalue="Jegesmedve";
//         PasswordElement.sendKeys(firstpasswordvalue);
//
//         WebElement SecondPasswordElement = driver.findElement(By.cssSelector("input[placeholder='secondpassword']"));
//         String secondpasswordvalue="Jegesmedve";
//         SecondPasswordElement.sendKeys(secondpasswordvalue);
     }

}


