package Helpmethodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//decalaram metode generale la nivel de interactiune cu elemente

public class ElementMethodes {


    public WebDriver driver;

    public ElementMethodes(WebDriver driver){

        this.driver=driver;
    }

    public void clickElement(WebElement elemente){
        elemente.click();
    }

    public void  fillElement(WebElement element, String value){
        element.sendKeys(value);
    }
    public void selectElementbytxt(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }

}
