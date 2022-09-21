package OOP_Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("Page -- default const ");
	}
	
	public Page(int t) {
		System.out.println("Page -- one param const "+t);
	}
	
	public abstract void title();
	public abstract void url();
	
	public void header() {
		System.out.println("page header");
	}
	
	public final void logo() {
		System.out.println("page -- logo");
	}
}
