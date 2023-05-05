package ICC_Test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.Icc_Homepage;

public class ICC_Homepage_TestPerform extends ICC_Base {
	Icc_Homepage IccHP;
	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		IccHP = new Icc_Homepage();	
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}

	@Test(priority = 0)
	public void LogoVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.IccLogoVisibility().isDisplayed(), true);
		
	}
	@Test(priority = 0)
	public void HomeSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.HomeOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void ScoresSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.ScoresOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void RankingsSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.RankingsOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void EventsSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.EventsOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void NewsSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.NewsOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void AwardsSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.AwardsOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void VideosSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.VideosOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void IccTvSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.IccTvOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 0)
	public void ShopSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.ShopOptionVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 0)
	public void TravelSectionVisibility() throws InterruptedException{
		Assert.assertEquals(IccHP.TravelOptionVisibility().isDisplayed(), true);
	}
	
	

	
}
