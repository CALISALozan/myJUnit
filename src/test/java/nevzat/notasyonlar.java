package nevzat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class notasyonlar {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }

    @Test
    public void test02() {
      //  System.out.println(driver.getWindowHandle());
       driver.switchTo().newWindow(WindowType.TAB);

    }
    @Test
    public void test03() {
  driver.get("https://www.google.com");
        driver.getPageSource();

  String ilkSayfaHandleDegeri= driver.getWindowHandle();
        System.out.println(ilkSayfaHandleDegeri);
  driver.switchTo().newWindow(WindowType.TAB);
  driver.get("https://www.amazon.com");
  System.out.println(driver.getWindowHandles());
  driver.switchTo().window(ilkSayfaHandleDegeri);
  driver.switchTo().newWindow(WindowType.WINDOW);
  //driver.quit();


driver.getPageSource();



    }
}