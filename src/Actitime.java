import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

    public static void main(String[] args) throws InterruptedException {
        register();
    }

    public static void register() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com/");
        driver.findElement(By.xpath("//*[text()='Try Free']")).click();
        Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Ove");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Sundberg");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ove.sundberg@solsidan.se");
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Svensk Kontorshygien AB");
    }
}
