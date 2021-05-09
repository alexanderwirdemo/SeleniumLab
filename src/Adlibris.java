import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adlibris {
    public static void main(String[] args) throws InterruptedException {
        buyBook();
    }
    public static void buyBook() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://Adlibris.Com/se/");
        WebElement searchfield = driver.findElement(By.name("q"));
        searchfield.sendKeys("praktisk mjukvarutestning\n");
        Thread.sleep(1000);
        driver.findElement(By.className("search-result__product__name")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("product__primary-action")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Kundvagn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Till kassan']")).click();
        Thread.sleep(1000);
        /*WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Ove");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Sundberg");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ove.sundberg@solsidan.se");
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Svensk Kontorshygien AB");*/
    }
}
