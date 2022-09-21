package WebDriver_Arch;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("launch chrome");
	}
	@Override
	public void findElement() {
		System.out.println("CD find");
		
	}

	@Override
	public void findElements() {
		System.out.println("CD find elements");
		
	}

	@Override
	public void click() {
		System.out.println("click CD");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter"+value);
		
	}

	@Override
	public void get(String url) {
		System.out.println("launch"+url);
		
	}

	@Override
	public String getTitle() {
		
		return "some title";
	}

	@Override
	public void close() {
		System.out.println("close");
		
	}

}
