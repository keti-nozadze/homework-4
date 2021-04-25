import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.security.Key;

public class homework4 {
    @Test
    public void homework4(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://on.ge/");
        Selenide.$(".input").setValue("კორონა ვირუსის სიმპტომები").sendKeys(Keys.ENTER);
        Selenide.sleep(7000L);
    }
}
