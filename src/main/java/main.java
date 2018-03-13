import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
        public static void main(String[] args) {
            WebDriver driver = initChromeDriver();

            driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

            WebElement fieldEmail = driver.findElement(By.id("email"));
            fieldEmail.sendKeys("webinar.test@gmail.com");

            WebElement fieldPass = driver.findElement(By.id("passwd"));
            fieldPass.sendKeys("Xcg7299bnSmMuRLp9ITw");

            WebElement button = driver.findElement(By.className("ladda-button"));
            button.click();

            Sleep();

            WebElement profile = driver.findElement(By.className("img-thumbnail"));
            profile.click();

            WebElement exit = driver.findElement(By.id("header_logout"));
            exit.click();

	    driver.quit();

        }

        public static WebDriver initChromeDriver(){
              System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
      	      ChromeOptions options = new ChromeOptions();
              options.addArguments("--start-maximized");
	      return new ChromeDriver(options);
        }

        public static void  Sleep(){
            try {
                Thread.sleep(2500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }

}
