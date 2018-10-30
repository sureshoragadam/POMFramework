package test.java;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.Guru99homepage;
import pages.Guru99loginpage;
import utility.Constant;
import utility.ExcelUtils;

public class Test99GuruLogin   {

	WebDriver driver;
	pages.Guru99loginpage objlogin;
	pages.Guru99homepage objhome;
	//String userName= "mngr159292";
	//String password = "synUqav";
	
	@BeforeTest
	
	public void setup() throws Exception{

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(Constant.URL);
        //driver.get(Constant.URL);

    }
	@Test ( groups = { "test3" } )	
	public void test_Login_Page() throws Exception {
		objlogin = new Guru99loginpage(driver);
		String loginPageTitle = objlogin.getLoginTitle();
		//Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		Assert.assertTrue(loginPageTitle.equalsIgnoreCase(Constant.loginPageTitle));
		String userName1=ExcelUtils.getCellData(1,1);
		String password1=ExcelUtils.getCellData(1, 2);
		//objlogin.loginToGuru99(Constant.Username, Constant.Password);
		objlogin.loginToGuru99(userName1, password1);
		ExcelUtils.setCellData("Pass", 1,14);
	}
	
	@Test(groups = {"test4"})
	public void test_Home_Page() {
		objhome = new Guru99homepage(driver);
		String homePageUserName = objhome.getHomePageDashboardUserName();
		Assert.assertTrue(homePageUserName.equalsIgnoreCase("Manger Id : " + Constant.Username));
	}
	
	@AfterTest()
	public void close_instance() throws Exception {
		driver.close();
		 
	}
	
	
}
