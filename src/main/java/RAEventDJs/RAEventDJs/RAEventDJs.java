package RAEventDJs.RAEventDJs;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameworkUtils.CommonFunctions;
import UiMap.RAEventPageElements;

public class RAEventDJs {

	private static HashMap<String, String> currentListingsList = new HashMap<String, String>();
	private static StringBuilder sb = new StringBuilder();

	public static HashMap<String, String> getcurrentListings(WebDriver driver, int daysFromNow) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		sb.append("https://www.residentadvisor.net/events.aspx?ai=13&v=day&mn=");
		sb.append(localDate.getMonthValue());
		sb.append("&yr=");
		sb.append(localDate.getYear());
		sb.append("&dy=");
		sb.append(localDate.getDayOfMonth() + daysFromNow);

		driver.get(sb.toString());

		for (String s : CommonFunctions.getStringListOfAttributes(driver, RAEventPageElements.eventLink, "href")) {
			driver.get(s);
			CommonFunctions.wait(1);

			for (WebElement we : driver.findElements(RAEventPageElements.lineUpItems)) {
				currentListingsList.put(we.getText(),
						CommonFunctions.getElementText(driver, RAEventPageElements.eventTitle));
			}
		}

		Iterator<?> it = currentListingsList.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
			System.out.println(pair.getKey());
			// System.out.println(pair.getValue());
			System.out.println("----------------------------------------------------------------------------");
		}
		return currentListingsList;
	}

}
