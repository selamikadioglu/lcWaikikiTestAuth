import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;

public class testTasks extends baseTest{
    homePage homePage;
    productsDetailPage productsDetailPage;
    cartPage cartPage;
    By productCount = new By.ByCssSelector("b.blue");
    By seeMoreProduct =new By.ByCssSelector("a[class='lazy-load-button']");
    By allProductLocator = new By.ByCssSelector("a[class='a_model_item']");
    By sizeButtonLocator = new By.ByCssSelector("  a[data-tracking-label='BedenSecenekleri']");
    By addButtonLocator = new By.ByCssSelector("  a[id='pd_add_to_cart']");
    @Order(1)
    @Test
    public void onHomePage() {
        homePage =new homePage(driver);Assertions.assertTrue(homePage.isOnHomePage(),"ana sayfada değilsin");
    }
    @Order(2)
    @Test
    public void goToLogin() {
        homePage =new homePage(driver);
        String username="selami-kadioglu@outlook.com";
        String password="selami123";
        homePage.loginEvent(username,password);
    }
    @Order(3)
    @Test
    public void searchProduct(){
        String searchText="pantolon";
        homePage.searchBox.search(searchText);
    }
    @Order(4)
    @Test
    public void selectProduct(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(seeMoreProduct).click();
        String text= driver.findElement(productCount).getText();
        Random r=new Random();
        int itemCount=r.nextInt(Integer.parseInt(text));
        driver.findElements(allProductLocator).get(itemCount).click();
    }
    @Order(5)
    @Test
    public void addToCart(){

        driver.findElement(sizeButtonLocator).click();

        driver.findElement(addButtonLocator).click();

    }
    @Test
    public void priceControl(){

    }
    @Test
    public void goToCart() throws InterruptedException {
        homePage.goToCart();
    }


}
