package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverUtilies {
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
	    s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void scrollbar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void frame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	public void verify(String actual,String expected,String page) {
		Assert.assertEquals(actual, expected);
		Reporter.log(page+ " is dispalyed ",true);
	}
}