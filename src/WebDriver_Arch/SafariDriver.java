package WebDriver_Arch;

public class SafariDriver implements WebDriver {


	public SafariDriver() {
		System.out.println("launch Safari");
	}
	@Override
	public void findElement() {
		System.out.println("SD find");
		
	}

	@Override
	public void findElements() {
		System.out.println("SD find elements");
		
	}

	@Override
	public void click() {
		System.out.println("click SD");
		
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
