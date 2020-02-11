package day50_abstraction_task;

import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

public abstract class Browser {
	// 1.Create abstract class Browser
	// Public Instance variables: version(String), memory, urls(List of String),
	// browserLaunched(boolean), focusedUrl, windowMaximized(boolean).

	public String version;
	public int memory;
	public List<String> urls;
	public boolean browserLaunched;
	public String focusedUrl;
	public boolean windowMaximized;

	

//Abstract methods: lauchBrowser(), closeBrowser(), addTab(takes url), closeTab(takes url), 
//changeTab(takes url). Only closeTab method returns boolean type, all other abstract methods are void.

public abstract void launchBrowser();

public abstract void closeBrowser();

public abstract void addTab(String urls);

public abstract boolean closeTab(String urls);

public abstract void changeTab(String urls);
//------------------------------------------------------------------------------


//Create void method maximizeWindow. This method doesn’t take any argument. 
//Simply print “Browser is maximized” and change maximized variable value to ‘true’.
public void maximizedWindows() {
	this.windowMaximized=true;
	System.out.println("Browser is maximized");
	
}
//-----------------------------------------------


//Create void method printInfo. This method doesn’t take any argument. 
//Method should print current info in following format:
//Browser version: %versionAvailable 
//memory: %memoryWindow 
//maximized: %windowMaximized
//Current URL: %focusedUrl
//Total open tabs: % size of list of open tabs
public void printInfo() {
	System.out.println("\nCURRENT BROWSER STATUS INFO\n");
	System.out.println("Browser version: " + this.version);
	System.out.println("memory: " + this.memory);
	System.out.println("Windows maximized: " + this.windowMaximized);
	System.out.println("Current URL: " + this.focusedUrl);
	System.out.println("Total open tabs: " + urls.size() );
}
//------------------------------------------------------------

//Create method seeAllUrls. This method doesn’t take any argument. 
//Simply prints out each open urls as following format.
//URL - 1: google.com
//URL - 2: amazon.com
//URL - 3: etsy.com

public void seeAllUrls() {
	System.out.println("\nALL URLS IN OPEN TABS\n");
	int count=0;
	for(String url:urls){
	System.out.println("URL - " +count+ ": " + url);
	count++;
    }
  }
}

