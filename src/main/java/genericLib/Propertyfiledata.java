package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfiledata implements AutoConstant{
public String getData(String keys) throws FileNotFoundException, IOException {
		
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfiledata));
		return p.getProperty(keys);
	}
}
