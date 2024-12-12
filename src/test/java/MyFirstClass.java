import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//        Thread.sleep(1000);
        driver.navigate().to("https://www.udemy.com");
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google Url is:" + googleUrl );
//        Thread.sleep(2000);
        driver.navigate().refresh();
        googleUrl = driver.getCurrentUrl();
        System.out.println("Google Url is:" + googleUrl );
//        Thread.sleep(2000);
        driver.navigate().forward();
        String udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy Url is:" + udemyUrl );
//        Thread.sleep(1000);
        driver.quit();

    }
}
