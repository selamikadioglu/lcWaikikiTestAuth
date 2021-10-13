import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productsDetailPage extends basePage {


    public productsDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {

    }

    public static boolean isOnProductDetailPage() {
        return true;
    }
}
