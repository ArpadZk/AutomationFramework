package Tests;

import Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.List;


public class AlertsTest extends BaseTest {



    @Test
    public void testRegister() {

        WebElement Skipsigninbutton = driver.findElement(By.id("btn2"));
        Skipsigninbutton.click();

        //Validam pagina de inregistrare
        String expectedindezpageinregistrare="Register";
        String actualindexpageinregistrare =driver.getTitle();//returneaza valoarea din tag ul de titlu
        Assert.assertEquals("pagina deinregistrare nu e corect",expectedindezpageinregistrare,actualindexpageinregistrare);


        WebElement SwitchElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        Actions Switchaction = new Actions(driver);
        Switchaction.moveToElement(SwitchElement).build().perform();

        WebElement AlertsElement = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
        AlertsElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertElemnt = driver.findElements(By.cssSelector(".nav-tabs.nav-stacked li"));
        AlertElemnt.get(0).click();
        WebElement AlertaOkElement = driver.findElement(By.cssSelector("button[onclick='alertbox()']"));
        AlertaOkElement.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        AlertElemnt.get(1).click();
        WebElement AlertOkCancelElement = driver.findElement(By.cssSelector("button[onclick='confirmbox()']"));
        AlertOkCancelElement.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        AlertElemnt.get(2).click();
        WebElement AlertTextboxlElement = driver.findElement(By.cssSelector("button[onclick='promptbox()']"));
        AlertTextboxlElement.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Egy");
        driver.switchTo().alert().accept();
    }
}
