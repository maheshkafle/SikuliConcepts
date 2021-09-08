import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class YoutubeVideoTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // dynamic Timeouts
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com/watch?v=DS88TwUvzjM");

        //create the object reference of screen class
        Screen s = new Screen();

        //pause icon
        Pattern playImg = new Pattern("resources\\pause.png");
        s.wait(playImg, 2000);
        s.click();
        s.click();


    }
}
