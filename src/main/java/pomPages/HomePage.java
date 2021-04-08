package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="selectProductSort")
	private WebElement sortdd;

	public WebElement getSortdd() {
		return sortdd;
	}
	
	@FindBy(xpath="//a[@title='Printed Summer Dress']")
	private WebElement dress;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void dressbtn() {
		dress.click();
	}}
