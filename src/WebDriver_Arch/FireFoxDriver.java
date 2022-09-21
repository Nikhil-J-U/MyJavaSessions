package WebDriver_Arch;

public class FireFoxDriver implements WebDriver{

	public FireFoxDriver() {
		System.out.println("launch FFD");
	}
	@Override
	public void findElement() {
		System.out.println("FFD find");
		
	}

	@Override
	public void findElements() {
		System.out.println("FFD find elements");
		
	}

	@Override
	public void click() {
		System.out.println("click FFD");
		
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
