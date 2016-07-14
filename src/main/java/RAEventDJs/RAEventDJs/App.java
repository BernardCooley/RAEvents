package RAEventDJs.RAEventDJs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import FrameworkUtils.BrowserLauncher;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many days from now:");
		int daysFromNow = sc.nextInt();
		
		String url = "https://www.residentadvisor.net/events.aspx?ai=13&v=day&mn=7&yr=2016&dy=16";
		String browser = "Firefox";
		BrowserLauncher bL = new BrowserLauncher();
    	WebDriver driver = bL.launchBrowser(browser);
		
    	
    	
		RAEventDJs.getcurrentListings(driver, daysFromNow);
		
		
	}
}
