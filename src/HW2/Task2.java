package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the text boxes
    click on sign up button
    close the pop up
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Yaroslav");
        driver.findElement(By.name("lastname")).sendKeys("Zaderaka");
        driver.findElement(By.name("reg_email__")).sendKeys("+380984792479");
        driver.findElement(By.name("reg_passwd__")).sendKeys("newpassword1");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
        driver.quit();
    }
}
