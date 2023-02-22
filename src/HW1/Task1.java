package HW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
     1. launch the browser
     2. navigate to amazon web site
     3. print out the title and the url in the console
     4. close the browser
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://amazon.com");
        System.out.println("*************************************************************************************");
        String url=driver.getCurrentUrl();
        String title= driver.getTitle();
        System.out.println(title);
        System.out.println(url);
        driver.quit();

    }
}
