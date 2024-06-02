import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String args[]) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MAHAKAAL\\Documents\\GitHub\\maven-practise\\src\\drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.quit();
    }
}
