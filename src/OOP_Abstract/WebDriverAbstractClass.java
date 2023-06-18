package OOP_Abstract;

public abstract class WebDriverAbstractClass extends SearchContextClass {
	
	public void get(String url) {
		System.out.println("https://www.google.com");
	}
	
	public String getTitle() {
		System.out.println("Title of the page:");
		return getTitle();
	}
	
	public void click(String element) {
		System.out.println("Login button:"+ element);
	}
	
	public void sendKeys(String element, String value) {
		System.out.println("Login using UN and PW:"+ element+value);
	}
	
	public void close() {
		System.out.println("close the window");
	}
	
	@Override
	public void findElement(String element) {
		System.out.println("WEbdriver----findElement");
	}
	
	

}
