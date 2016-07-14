package UiMap;

import org.openqa.selenium.By;

public class RAEventPageElements {

	public static final By eventLink = By.cssSelector("h1[itemprop='summary'] > a");
	public static final By lineUpItems = By.cssSelector("p.lineup > a");
	public static final By eventTitle = By.cssSelector("div#sectionHead > h1");

	public static final By keepNewList = By
			.cssSelector("div.notes-container > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2)");
	public static final By googleEmail = By.cssSelector("input#Email");
	public static final By googleNextBtn = By.cssSelector("input#next");
	public static final By googlePassword = By.cssSelector("input#Passwd");
	public static final By googleSignInBtn = By.cssSelector("input#signIn");

	public static final By keepListField = By.cssSelector(
			"div.notes-container > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div > div:nth-of-type(3)");
}
