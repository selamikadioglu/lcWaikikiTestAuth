import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(testResultLogger.class)
public class baseTest {
    //By goToLoginPageLocator = By.xpath("//*[@id=\'header__container\']/div/header/div[2]/div/div[3]/div[2]/div[1]/a/span" );
    WebDriver driver;
    @BeforeAll
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
       // driver.findElement(goToLoginPageLocator).click();
    }



}
