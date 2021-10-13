import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchBox extends basePage {

    By searchBoxLocator= new By.ByCssSelector("input[type='text']");
    By searchBoxButtonLocator=  new By.ByCssSelector("button[type='button']");

    public searchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String searchText) {
        click(searchBoxLocator);
        type(searchBoxLocator,searchText);
        click(searchBoxButtonLocator);
    }

}
