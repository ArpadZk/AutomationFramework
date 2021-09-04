package Helpmethodes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethodes {

        public WebDriver driver;
        public PageMethodes(WebDriver driver){
            this.driver=driver;
        }
        public void validateTitlepage(String expexted ) {
            String actualindexpage = driver.getTitle();// returneaza valoarea din tag-ul de titlu
            Assert.assertEquals("Index page nu a aparut", expectedindexpage, actualindexpage);
        }
}
