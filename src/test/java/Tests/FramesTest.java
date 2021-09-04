package Tests;

import Base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FramesTest extends BaseTest {

    @Test
    public void FramesTest (){

        WebElement Skipsigninbutton = driver.findElement(By.id("btn2"));
        Skipsigninbutton.click();

        WebElement SwitchElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        Actions Switchaction = new Actions(driver);
        Switchaction.moveToElement(SwitchElement).build().perform();

        WebElement AlertsElement = driver.findElement(By.cssSelector("a[href='Windows.html']"));
        AlertsElement.click();
        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        List<WebElement> frameElement = driver.findElements(By.cssSelector(".nav.nav-tabs li"));

        frameElement.get(0).click();

        driver.switchTo().frame("singleframe");
        WebElement textframeElemnt = driver.findElement(By.cssSelector("input[type='text']"));
        textframeElemnt.sendKeys("Kisgyorgy");

        driver.switchTo().defaultContent(); // te intoarce cu focusul la pagina principala

        frameElement.get(1).click();

        WebElement BigFrame = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
        driver.switchTo().frame(BigFrame);

        WebElement LittleFrame = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
        driver.switchTo().frame(LittleFrame);

        WebElement textboxElemnt = driver.findElement(By.cssSelector("input[type='text']"));
        textboxElemnt.sendKeys("Kisgyorgy");

        driver.switchTo().defaultContent();
        frameElement.get(0).click();

    }
}
