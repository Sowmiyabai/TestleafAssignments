package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumSampleCode {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.close();

	}

}
