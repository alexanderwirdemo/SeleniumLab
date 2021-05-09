import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumLab {

    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("zV9nZe")).click();
        WebElement searchfield = driver.findElement(By.name("q"));
        searchfield.sendKeys("Software Testing");
        searchfield.submit();

    }


}
