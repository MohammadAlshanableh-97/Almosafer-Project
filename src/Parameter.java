import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameter {
	
	static WebDriver driver = new ChromeDriver();
	String TheWebSite = "https://www.almosafer.com/en";
	String ExbectedLanguaeArabic = "العربية";
	String ExbectedLanguaeEnglish = "English";
	String ExbectedCurrency = "SAR";
	String ExbectedContactNumber = "+966554400000";
	boolean ActualValueQitafLogo ;
	String ExbectedAttributeValev = "false";
	Random rand = new Random();
	
	Assertion myAssert = new Assertion();
	
}
