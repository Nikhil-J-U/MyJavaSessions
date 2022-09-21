package WebDriver_Arch;

public class GoogleTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		
		//cross browser logic:
		
		String browser = "safari";
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FireFoxDriver();
		} 
		else {
			System.out.println("please enter correct browser!");
		}
		//WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement();
		driver.findElements();
		
		driver.click();
		driver.sendKeys("nikhi@gmail.com");
		driver.close();

	}

}
