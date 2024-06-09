import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class If_else {
    public static void main(String args[]) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MAHAKAAL\\Documents\\GitHub\\maven-practise\\src\\drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        WebElement  searchInput = driver.findElement(By.xpath("//*[@id='search-input']/input"));
        WebElement  searchButton = driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));

        if(searchInput.isDisplayed()){
            searchInput.sendKeys("automation");;
            searchButton.click();
//            driver.wait(20);
            System.out.println("clicked");
            Assert.assertTrue("automation".equals(searchInput.getText()));
            System.out.println("completed");
        }

        driver.quit();
    }
}
