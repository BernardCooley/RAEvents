package RAEventDJs.RAEventDJs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import FrameworkUtils.BrowserLauncher;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		System.out.println("Enter month number: ");
		int month = sc.nextInt();
		System.out.println("Enter day number: ");
		int day = sc.nextInt();
		
		String url = "https://www.residentadvisor.net/events.aspx?ai=13&v=day&mn=7&yr=2016&dy=16";
		String browser = "PhantomJS";
		BrowserLauncher bL = new BrowserLauncher();
    	WebDriver driver = bL.launchBrowser(browser);
		
    	
    	
		RAEventDJs.getcurrentListings(driver, year, month, day);
		
		
	}
}
