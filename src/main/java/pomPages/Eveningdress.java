package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress {
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement sizedd;
	
	@FindBy(id="layered_id_feature_16")
	private WebElement dressy;
	
	@FindBy(id="layered_manufacturer_1")
	private WebElement manufacture;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement deliverybtn;
	
	public Eveningdress(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sizecheckbox() {
		sizedd.click();
	}
	public void dressycheckbox() {
		dressy.click();
	}

	public void manufacturecheckbox() {
		manufacture.click();
	}
	
	public void delierybutton() {
		deliverybtn.click();
	}
}

