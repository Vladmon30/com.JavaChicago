package day50_abstraction_task;

public class InternetUser {
public static void main(String[] args) {
	
	Chrome chrome = new Chrome(512);
	chrome.version="68.08";
	chrome.launchBrowser();
	chrome.addTab("google.com");
	chrome.addTab("amazon.com");
	chrome.printInfo();
	chrome.closeTab("google.com");
	chrome.printInfo();
	chrome.addTab("google.com");
	chrome.addTab("etsy.com");
	chrome.addTab("bestbuy.com");
	chrome.seeAllUrls();
	chrome.changeTab("amazon.com");
	chrome.printInfo();
	chrome.addTab("cybertekschool.com");
	chrome.closeBrowser();
	chrome.printInfo();
	
	chrome.addExtention("extention");
	chrome.runExtention("extention");
	
	
}
}
