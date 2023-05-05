package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import ICC_Base.ICC_Base;


public class Icc_Homepage extends ICC_Base {
	public Icc_Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//section[@class='main-navigation__wrapper']/div[1]/a/span[1]")
	WebElement ICClogo;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[1]")
	WebElement HomeOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]")
	WebElement ScoresOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[3]")
	WebElement RankingsOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[4]")
	WebElement EventsOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[5]")
	WebElement NewsOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[6]")
	WebElement AwardsOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[7]")
	WebElement VideosOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[8]")
	WebElement IccTvOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[9]")
	WebElement ShopOption;
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[10]")
	WebElement TravelOption;
	
	public WebElement IccLogoVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return ICClogo;
		
	}
	public WebElement HomeOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return HomeOption;
		 	
	}
	public WebElement ScoresOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return ScoresOption;
		 	
	}
	public WebElement RankingsOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return RankingsOption;
		 	
	}
	public WebElement EventsOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return EventsOption;
		 	
	}
	public WebElement NewsOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return NewsOption;
		 	
	}
	public WebElement AwardsOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return AwardsOption;
		 	
	}
	public WebElement VideosOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return VideosOption;
		 	
	}
	public WebElement IccTvOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return IccTvOption;
		 	
	}
	public WebElement ShopOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return ShopOption;
		 	
	}
	public WebElement TravelOptionVisibility() throws InterruptedException  {
		Thread.sleep(5000);
		return TravelOption;
		 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//----------------------------------Navbar Options-------------------------

	
//	@Test(priority = 0)
//	public void ScoresOption()  {
//		WebElement Scores = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]"));
//		Assert.assertEquals(Scores.isDisplayed(), true);
//		System.out.println("Scores Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void RankingsOption()  {
//		WebElement Rankings = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[3]"));
//		Assert.assertEquals(Rankings.isDisplayed(), true);
//		System.out.println("Rankings Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void EventsOption()  {
//		WebElement Events = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[4]"));
//		Assert.assertEquals(Events.isDisplayed(), true);
//		System.out.println("Events Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void NewsOption()  {
//		WebElement News = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[5]"));
//		Assert.assertEquals(News.isDisplayed(), true);
//		System.out.println("News Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void AwardsOption()  {
//		WebElement Awards = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[6]"));
//		Assert.assertEquals(Awards.isDisplayed(), true);
//		System.out.println("Awards Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void VideosOption()  {
//		WebElement Videos = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[7]"));
//		Assert.assertEquals(Videos.isDisplayed(), true);
//		System.out.println("Videos Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void IccTvOption()  {
//		WebElement IccTv = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[8]"));
//		Assert.assertEquals(IccTv.isDisplayed(), true);
//		System.out.println("IccTv Option is present");
//			
//	}
//	
//	@Test(priority = 0)
//	public void ShopOption()  {
//		WebElement Shop = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[9]"));
//		Assert.assertEquals(Shop.isDisplayed(), true);
//		System.out.println("Shop Option is present");
//			
//	}
//	@Test(priority = 0)
//	public void TravelOption()  {
//		WebElement Travel = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[10]"));
//		Assert.assertEquals(Travel.isDisplayed(), true);
//		System.out.println("Travel Option is present");
//			
//	}
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void quit() 
	{
		driver.quit();
	}

}
