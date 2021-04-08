package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.DressPage;
import pomPages.HomePage;
import pomPages.LoginPage;

public class AddingProductTocart extends BaseClass{
	@Test
	public void cart() throws FileNotFoundException, IOException {
		LoginPage l=new LoginPage(driver);
		l.signButton();
		l.serachTextbox(p.getData("product"));
		l.goButton();
		
		HomePage h=new HomePage(driver);
		utilies.dropDown(h.getSortdd(),p.getData("sortdd"));
		h.dressbtn();
		
		DressPage d=new DressPage(driver);
		d.plusbutton();
		utilies.dropDown(d.getSizedd(),p.getData("sizedd"));
		//d.colorButton();
		d.addingTocart();
		d.processtocheckoutbtn();
		utilies.verify(driver.getTitle(),p.getData("er"),p.getData("page"));
	}

}

