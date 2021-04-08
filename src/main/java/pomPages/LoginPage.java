package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signinbtn;
	
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement goBtn;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dressoption;
	
	public WebElement getDressoption() {
		return dressoption;
	}
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveingDress;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void signButton() {
		signinbtn.click();
	}
	
	public void serachTextbox(String product) {
		serachtb.sendKeys(product);
	}
	
	public void goButton() {
		goBtn.click();
	}
	
	public void eveingDressss() {
		eveingDress.click();
	}
	
}

