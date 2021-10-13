import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends basePage{

    By emailLocator = By.id("LoginEmail");
    By passwordLocator= By.id("Password");
    By loginButtonLocator=By.xpath("//*[@id=\'loginLink\']");
    By menuUserIconLocator=By.id("menuUserIcon");
    By onHomePageLocator = new By.ByCssSelector("  img[class=\'inspiring_Dortlu lazyautosizes ls-is-cached lazyloaded\']");

    By basketButtonLocator = new By.ByCssSelector("a[data-tracking-category='Giris']");
    By quantityUpButtonLocator=new By.ByCssSelector("a[class='oq-up plus']");
    By deleteButtonLocator=new By.ByCssSelector("i[class='fa fa-trash-o']");
    By deleteSliderButtonLocator=new By.ByCssSelector("a[class='inverted-modal-button sc-delete ins-init-condition-tracking']");
    By goToLoginPageLocator = By.xpath("//*[@id=\'header__container\']/div/header/div[2]/div/div[3]/div[2]/div[1]/a/span" );
    searchBox searchBox;
    public homePage(WebDriver driver) {
        super(driver);
        searchBox =new searchBox(driver);
    }

    public searchBox searchBox(){
        return this.searchBox;

    }

    public void loginEvent(String username, String password) {
        driver.findElement(goToLoginPageLocator).click();
        type(emailLocator,username);
        type(passwordLocator,password);
        click(loginButtonLocator);
    }

    public boolean isProductCountUp() {
        return true;
    }

    public void goToCart() throws InterruptedException {


        driver.findElement(basketButtonLocator).click();
        driver.findElement(quantityUpButtonLocator).click();

            Thread.sleep(2000);

        driver.findElement(deleteButtonLocator).click();

            Thread.sleep(1000);

        driver.findElement(deleteSliderButtonLocator).click();
    }

    public boolean isOnLoginPage() {
        return isDisPlayed(menuUserIconLocator);
    }

    public boolean isOnHomePage() {
        return true;
    }

    /*public static void main(String[] args) {
        basePage basePage=new basePage();
        String username="selami-kadioglu@outlook.com";
        String password="selami123";
        basePage.loginEvent(username,password);
    }*/

    /*public  void loginEvent(String username,String password){
        driver.findElement(goToLoginPageLocator).click();
        driver.findElement(emailLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }*/
}
