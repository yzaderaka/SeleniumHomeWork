package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Yaroslav");
        driver.findElement(By.id("customer.lastName")).sendKeys("Zaderaka");
        driver.findElement(By.id("customer.address.street")).sendKeys("Sribnokilska");
        driver.findElement(By.id("customer.address.city")).sendKeys("Kyiv");
        driver.findElement(By.id("customer.address.state")).sendKeys("Kyivska");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("02140");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+380984792479");
        driver.findElement(By.id("customer.ssn")).sendKeys("3103814119");
        driver.findElement(By.id("customer.username")).sendKeys("yzaderaka");
        driver.findElement(By.id("customer.password")).sendKeys("password1234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password1234");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
