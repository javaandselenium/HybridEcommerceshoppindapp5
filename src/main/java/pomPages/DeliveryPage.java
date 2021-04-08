package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {
	@FindBy(xpath="//a[@title='Contact us']")
	private WebElement contactus;
	
	public DeliveryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void contactUsbtn() {
		contactus.click();
	}

}

