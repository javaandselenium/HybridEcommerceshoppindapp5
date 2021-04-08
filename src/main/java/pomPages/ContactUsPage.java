package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	@FindBy(id="id_contact")
	private WebElement headingdd;

	public WebElement getHeadingdd() {
		return headingdd;
	}
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="id_order")
	private WebElement oderref;
	
	@FindBy(id="fileUpload")
	private WebElement choosefile;
	
	@FindBy(id="message")
	private WebElement messagetb;
	
	@FindBy(id="submitMessage")
	private WebElement sendbtn;
	
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailAddress(String email) {
		emailtb.sendKeys(email);
	}
	
	public void orderReffence(String ref) {
		oderref.sendKeys(ref);
	}
	
	public void choosefile(String path) {
		choosefile.sendKeys(path);
	}
	
	public void messageTb(String msg) {
		messagetb.sendKeys(msg);
	}
	public void sendBtn() {
		sendbtn.click();
	}
	
	

}

