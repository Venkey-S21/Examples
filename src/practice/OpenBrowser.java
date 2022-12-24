package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Sources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
		
	}
	

}
