package RAEventDJs.RAEventDJs;

import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameworkUtils.CommonFunctions;
import UiMap.RAEventPageElements;

public class RAEventDJs {
	private static ArrayList<String> urls = new ArrayList<String>();

	public static void getcurrentListings(WebDriver driver, int year, int month, int day) {
		driver.get(buildDate(year, month, day));

		urls = CommonFunctions.getStringListOfAttributes(driver, RAEventPageElements.eventLink, "href");

		System.out.println(urls.size() + " events found");
		System.out.println();

		for (String s : urls) {
			System.out.println("-------------------------------------------------------------------------------------------------");
			
			driver.get(s);
			System.out.println(urls.indexOf(s) + " of " + urls.size());
			System.out.println(s);
			System.out.println(CommonFunctions.getElementText(driver, RAEventPageElements.eventTitle));

			CommonFunctions.wait(1);
			for (WebElement we : driver.findElements(RAEventPageElements.lineUpItems)) {
				System.out.println(we.getText());
			}
		}
	}

	public static String buildDate(int year, int month, int day) {
		StringBuilder sb = new StringBuilder();

		sb.append("https://www.residentadvisor.net/events.aspx?ai=13&v=day&mn=");
		sb.append(month);
		sb.append("&yr=");
		sb.append(year);
		sb.append("&dy=");
		sb.append(day);

		return sb.toString();
	}
}
