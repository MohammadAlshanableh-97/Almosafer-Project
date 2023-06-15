import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MyTestCases extends Parameter {

	@BeforeTest
	public void myBeforeTest() {
		driver.get(TheWebSite);
		driver.manage().window().maximize();
	}
//
//	@Test(priority = 1)
//	public void CheckTheLangueg() {
//		String TheActualLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//				.getText();
//		myAssert.assertEquals(TheActualLanguage, ExbectedLanguaeArabic);
//	}
//
//	@Test(priority = 2)
//	public void CheckTheCurrency() {
//		String TheActualCurrency = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
//		myAssert.assertEquals(TheActualCurrency, ExbectedCurrency);
//
//	}
//
//	@Test(priority = 3)
//	public void CheckTheContactIsCorrect() {
//		String TheActualContactNumber = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
//		myAssert.assertEquals(TheActualContactNumber, ExbectedContactNumber);
//
//	}
//
//	@Test(priority = 4)
//	public void CheckQitafLogoIsTarr() {
//		WebElement MyFooter = driver.findElement(By.tagName("footer"));
//
//		List<WebElement> TheListOfSVGImeg = MyFooter.findElements(By.tagName("svg"));
//
//		for (int i = 0; i < TheListOfSVGImeg.size(); i++) {
//			String CheckAttribute = TheListOfSVGImeg.get(i).getAttribute("data-testid");
//
//			if (CheckAttribute == null) {
//				continue;
//			}
//
//			else if (TheListOfSVGImeg.get(i).getAttribute("data-testid").equals("Footer__QitafLogo")) {
//				ActualValueQitafLogo = true;
//			}
//		}
//
//		myAssert.assertEquals(ActualValueQitafLogo, true);
//
//		// WebElement QitafLogo =
//		// driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]/svg"));
//
//	}
//
//	@Test(priority = 5)
//	public void Hotel_Tab_Is_Not_Selcted() {
//
//		WebElement Hotel_Tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String ActualAttribute = Hotel_Tab.getAttribute("aria-selected");
//		myAssert.assertEquals(ActualAttribute, ExbectedAttributeValev);
//
//	}
//
//	@SuppressWarnings("deprecation")
//	@Test(priority = 6)
//	public void Check_The_Depataur_data() {
//
//		int NumberOfDaysExtera = 1;
//
//		Date TodaytTome = new Date();
//		// Date TodayTime = new Date();
//		// System.out.println(TodayTime);
//		// LocalDate mmmmf = LocalDate.now().plusDays(1);
//		// System.out.println(mmmmf);
//
//		// String TodayAsString = TodayTime.getDay().toString;
//
//		int ActualDayOfTheMonth = TodaytTome.getDate();
//
//		String TheDayInWebsite = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]"))
//				.getText();
//		int UpdatedDateISint = Integer.parseInt(TheDayInWebsite);
//		myAssert.assertEquals(UpdatedDateISint, ActualDayOfTheMonth + NumberOfDaysExtera);
//
//	}
//
//	@SuppressWarnings("deprecation")
//	@Test(priority = 7)
//	public void Check_The_Return_data() {
//
//		int NumberOfDaysExtera = 2;
//
//		Date TodaytTome = new Date();
//		// Date TodayTime = new Date();
//		// System.out.println(TodayTime);
//		// LocalDate mmmmf = LocalDate.now().plusDays(1);
//		// System.out.println(mmmmf);
//
////	String TodayAsString = TodayTime.getDay().toString;
//
//		int ActualDayOfTheMonth = TodaytTome.getDate();
//
//		String TheDayInWebsite = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"))
//				.getText();
//		int UpdatedDateISint = Integer.parseInt(TheDayInWebsite);
//		myAssert.assertEquals(UpdatedDateISint, ActualDayOfTheMonth + NumberOfDaysExtera);
//	}
//
//	
//	@Test(priority = 8,invocationCount = 10)
//	public void RandomCheckTheWebsiteLangauge() {
//		
//		
//		String [] myWebSiteURL = {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
//		
//		int myIndex = rand.nextInt(0,2);
//		
//		driver.get(myWebSiteURL[myIndex]);
//		if(driver.getCurrentUrl().contains("ar")) {
//			
//			String Land = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
//            myAssert.assertEquals(Land, ExbectedLanguaeEnglish);		
//		}else {
//			String Land = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
//			myAssert.assertEquals(Land, ExbectedLanguaeArabic);
//		}
//		
//	}

	@Test(priority = 1)
	public void TestTheHotalTab() throws InterruptedException {

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		String[] ArabicCantres = { "جده", "دبي" };
		int ArabicIndex = rand.nextInt(0, 1);
		String[] EnglishCantres = { "dubai", "jeddah", "riyadh" };
		int EnglishIndex = rand.nextInt(0, 3);

		String[] myWebSiteURL = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };

		int myIndex = rand.nextInt(0, 2);

		driver.get(myWebSiteURL[myIndex]);
		if (driver.getCurrentUrl().contains("ar")) {

			WebElement hotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			hotelTab.click();
			Thread.sleep(2000);
			WebElement SarchBar = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			SarchBar.sendKeys(ArabicCantres[ArabicIndex]);
			Thread.sleep(1000);
			WebElement Serch_Button = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			SarchBar.sendKeys(Keys.chord(Keys.ARROW_DOWN) + Keys.ENTER);
			Thread.sleep(1000);
			Serch_Button.click();

		} else {

			WebElement hotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			hotelTab.click();
			Thread.sleep(2000);
			WebElement SarchBar = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			WebElement Serch_Button = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));

			SarchBar.sendKeys(EnglishCantres[EnglishIndex]);
			Thread.sleep(1000);
			SarchBar.sendKeys(Keys.chord(Keys.ARROW_DOWN) + Keys.ENTER);
			Thread.sleep(1000);
			Serch_Button.click();
		}
	}

	@Test(priority = 2)
	public void RandumlySelctNumberOfVister() {

		WebElement NumberOfVistor = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));

		Select mySelectar = new Select(NumberOfVistor);
		int myIndex = rand.nextInt(0, 2);
		mySelectar.selectByIndex(myIndex);

	}

	@Test(priority = 3)
	public void SarchHotels() {

		WebElement SarchButeen = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[4]/button"));
		SarchButeen.click();
	}

	@Test(priority = 4)
	public void DoneSarshing() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement SarshResulat = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span"));
		String TaxtOfTheSarshResulet = SarshResulat.getText();
		//System.out.println(TaxtOfTheSarshResulet);
		boolean ActualRuseltinWebSite = TaxtOfTheSarshResulet.contains("found")
				|| TaxtOfTheSarshResulet.contains("وجدنا");
		myAssert.assertEquals(ActualRuseltinWebSite, true);
	}

	@Test(priority = 5)
	public void Sorting_from_low_to_high() throws InterruptedException {

		WebElement LowestPrice = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]"));
		LowestPrice.click();

		Thread.sleep(3000);
        WebElement RightSide = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[2]/div[1]"));
		List<WebElement> thePrices = RightSide.findElements(By.className("Price__Value"));

		//for (int i = 0; i < thePrices.size(); i++) {
		//String PriceinTheWebSite = thePrices.get(i).getText();
	//	int UbdatePriceAsInInteger = Integer.parseInt(PriceinTheWebSite);
			
			String PriceinTheWebSiteforTheFirstElement = thePrices.get(0).getText();
			String PriceinTheWebSiteforTheLastElement = thePrices.get(thePrices.size() - 1).getText();
			int FirstItemInt = Integer.parseInt(PriceinTheWebSiteforTheFirstElement);
			int LastItemInt = Integer.parseInt(PriceinTheWebSiteforTheLastElement);
			assertEquals(FirstItemInt < LastItemInt, true);
			
	//	}
			

	}
}
