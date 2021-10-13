
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class basePage {

    WebDriver driver;
    public basePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator,String text){
        find(locator).sendKeys(text);
    }
    public boolean isDisPlayed(By locator){
      return   find(locator).isDisplayed();
    }
   /* searcBox searcBox;
    WebDriver driver;

    String BaseUrl="https://www.lcwaikiki.com/tr-TR/TR";
    By goToLoginPageLocator = By.xpath("//*[@id=\'header__container\']/div/header/div[2]/div/div[3]/div[2]/div[1]/a/span" );
    By emailLocator = By.id("LoginEmail");
    By passwordLocator= By.id("Password");
    By loginButtonLocator=By.xpath("//*[@id=\'loginLink\']");

    public basePage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BaseUrl);
        driver.manage().window().maximize();
    }*/





}
