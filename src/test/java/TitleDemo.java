import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String googleSource = driver.getPageSource();
        System.out.println("Google Source: " + googleSource);

        String googleHandle = driver.getWindowHandle();
        System.out.println("Google Handle is: " + googleHandle);

        String title1 = driver.getTitle();
        System.out.println("Google Title is: " + title1);

        driver.navigate().to("https://www.udemy.com");
        String title2 = driver.getTitle();
        System.out.println("Udemy Title is: " + title2);

        driver.quit();

    }
}
