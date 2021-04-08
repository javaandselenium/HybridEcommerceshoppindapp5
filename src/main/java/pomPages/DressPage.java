package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
@FindBy(xpath="//i[@class='icon-plus']")
private WebElement plusbtn;


@FindBy(id="group_1")
private WebElement sizedd;

@FindBy(id="color_8")
private WebElement colorbtn;

public WebElement getSizedd() {
	return sizedd;
}

@FindBy(xpath="//span[text()='Add to cart']")
private WebElement addtocartbtn;

@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
private WebElement processtoCheckout;


public DressPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void plusbutton() {
	plusbtn.click();
}

public void colorButton() {
	colorbtn.click();
}

public void addingTocart() {
	addtocartbtn.click();
}

public void processtocheckoutbtn() {
	processtoCheckout.click();
}}
