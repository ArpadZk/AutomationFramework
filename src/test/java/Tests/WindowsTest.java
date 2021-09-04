package Tests;

import Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest extends BaseTest {

    @Test
    public void TestWindows (){

        WebElement Skipsigninbutton = driver.findElement(By.id("btn2"));
        Skipsigninbutton.click();

        WebElement SwitchElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        Actions Switchaction = new Actions(driver);
        Switchaction.moveToElement(SwitchElement).build().perform();

        WebElement AlertsElement = driver.findElement(By.cssSelector("a[href='Windows.html']"));
        AlertsElement.click();
        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> meniuwindows = driver.findElements(By.cssSelector(".nav-tabs li"));
        meniuwindows.get(0).click();
        WebElement clickelement = driver.findElement(By.cssSelector(".btn.btn-info"));
        clickelement.click();

        System.out.println(driver.getTitle());
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); //returneaza o lista cu taburi
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(tabs.get(0));

        meniuwindows.get(2).click();
        WebElement okbuttonElement = driver.findElement(By.cssSelector("button[onclick='multiwindow()']"));
        okbuttonElement.click();
        ArrayList<String> multipletabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(multipletabs.get(2));
        System.out.println("title 1/2 tabs"+ " "+driver.getTitle());
        driver.close();

        driver.switchTo().window(multipletabs.get(1));
        System.out.println("title 2/2 tabs"+ " "+driver.getTitle());
        driver.close();
        driver.switchTo().window(multipletabs.get(0));

        meniuwindows.get(1).click();
        WebElement windowElement = driver.findElement(By.cssSelector("button[onclick='newwindow()']"));
        windowElement.click();

        ArrayList<String> newwindow = new ArrayList<>(driver.getWindowHandles()); //returneaza o lista cu taburi
        driver.switchTo().window(newwindow.get(1));
        System.out.println("title new window:"+ " "+ driver.getTitle());
        driver.close();
        driver.switchTo().window(newwindow.get(0));

    }
}
