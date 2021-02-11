import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
   public static void main(String args[]){
   WebDriver driver;
//	   WebDriverManager.chromedriver().setup();
//	   driver = new ChromeDriver();
       String browserName = "ff";
       if(browserName=="ch"){
    	   WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
       }
       if(browserName=="ff"){
    	   WebDriverManager.iedriver().setup();
    	   driver = new InternetExplorerDriver();
       }
       else{
    	   WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
       }
       driver.get("https://www.google.com");
	   driver.close();
   }
}
