package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.ContactUsPage;
import pomPages.DeliveryPage;
import pomPages.Eveningdress;
import pomPages.LoginPage;

public class Sendingdetails extends BaseClass{
	@Test
	public void contactdetails() throws FileNotFoundException, IOException {
		LoginPage l=new LoginPage(driver);
		utilies.mouseHover(driver,l.getDressoption());
		l.eveingDressss();
		
		Eveningdress e=new Eveningdress(driver);
		e.sizecheckbox();
		e.dressycheckbox();
		e.manufacturecheckbox();
		e.delierybutton();
		
		DeliveryPage d=new DeliveryPage(driver);
		d.contactUsbtn();
		
		ContactUsPage c=new ContactUsPage(driver);
		utilies.dropDown(c.getHeadingdd(),p.getData("headingdd"));
		c.emailAddress(p.getData("email"));
		c.orderReffence(p.getData("orderef"));
		c.choosefile(p.getData("filepath"));
		c.messageTb(p.getData("msg"));
		c.sendBtn();
		
		utilies.verify(driver.getTitle(),p.getData("exresult"),p.getData("page1"));
	}

}
