import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class simplelogin {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("priyanka.sankepally@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hfjhfjhgjfh");
		driver.quit();
		

	}

}
