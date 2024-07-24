package desafioPOOiphone.functions.browser;

public class BrowserInternet implements OpenCloseBrowser{

	public void openCloseBrowser() {
		openBrowser();
		System.out.println("browsing");
		System.out.println("saving history");
		closeBrowser();
	}
	
	private void openBrowser() {
		System.out.println("Opening browser" + "\n");
	}
	
	private void closeBrowser() {
		System.out.println("\n" + "Closing browser");
		System.out.println("_____________________________");
	}
}
