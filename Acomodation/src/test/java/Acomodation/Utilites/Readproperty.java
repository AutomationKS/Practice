package Acomodation.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {
	Properties p;

	public Readproperty() {
		File src = new File("./Configuration/config.properties");
		FileInputStream f = null;
		try {
			f = new FileInputStream(src);
			p = new Properties();
			p.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String URL() {
		String urls = p.getProperty("Urls");
		return urls;

	}

	public String Chromepath() {
		String Chromepaths = p.getProperty("chromepath");
		return Chromepaths;

	}

}
