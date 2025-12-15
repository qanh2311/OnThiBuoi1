package Bai3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginAndRegisterTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException{
        driver.get("https://vitimex.com.vn/account/register");
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("Phan");
        driver.findElement(By.id("first_name")).sendKeys("Thao Nhi");
        driver.findElement(By.id("radio1")).click();
        driver.findElement(By.id("birthday")).sendKeys("01/01/2008");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("password")).sendKeys("test123");
        driver.findElement(By.cssSelector("input[type = 'submit'][value = 'Đăng ký']")).click();
        Thread.sleep(2000);
    }
    @Test
    public void login()throws InterruptedException{
        driver.get("https://vitimex.com.vn/account/login");
        Thread.sleep(2000);
        driver.findElement(By.id("customer_email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("customer_password")).sendKeys("test123");
        driver.findElement(By.cssSelector("input[type = 'submit'][value = 'Đăng nhập']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void find()throws InterruptedException{
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(2000);
        driver.findElement(By.className("h-search")).click();
        driver.findElement(By.id("inputSearchAuto")).sendKeys("quần");
        driver.findElement(By.id("search-header-btn")).click();
        Thread.sleep(2000);
    }
    @Test
    public void menu()throws InterruptedException{
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.menu-link[href='/collections/all']")).click();
        Thread.sleep(2000);
    }
    @Test
    public void themGioHang()throws InterruptedException{
        driver.get("https://vitimex.com.vn/products/arc7686");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label.aspect-ratio[data-value='42']")).click();
        driver.findElement(By.id("btn-addtocart")).click();
        Thread.sleep(2000);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
