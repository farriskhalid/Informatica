import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Informatica {
	WebDriver browser;
	public static void main(String[] args) {
//		new Informatica().login();
		
	}
	
	//constructor, runs on initialization of the class
	Informatica(){
		//point to where your selenium driver sits on your system 
		System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
		browser = new ChromeDriver();
	}
	
	/**
	 * Login to Informatica Cloud
	 */
	public void login(){
		String baseUrl = "https://app.informaticaondemand.com/ma/";
		
		//launch google chrome 
		browser.get(baseUrl);
		
		//input the username and password 
		browser.findElement(By.name("username")).sendKeys("yourUsernameForInformaticaHere");
		browser.findElement(By.name("password")).sendKeys("yourUsernameForInformaticaHere");
		
		//Pressing Login by mimicking the enter key 
		browser.findElement(By.name("password")).sendKeys(Keys.ENTER);
	}
	
	public void openProcessBuild(){
		
	};
}

