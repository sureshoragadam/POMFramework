package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99loginpage {
	WebDriver driver;
	By user99GuruName = By.name("uid");

    By password99Guru = By.name("password");

    By titleText =By.className("barone");
    By login = By.name("btnLogin");
    
	 public Guru99loginpage(WebDriver driver){

	        this.driver = driver;

	    }
	 
	 public void setUserName(String username) {
		 driver.findElement(user99GuruName).sendKeys(username);
	 }
	 
	 public void setPassword(String password) {
		 driver.findElement(password99Guru).sendKeys(password);	 
		 
	 }
	 
	 public void clickLoginButton() {
		 driver.findElement(login).submit();
		 
	 }
	 
	 public String getLoginTitle(){
		 return driver.findElement(titleText).getText();
		 
	 }
	 
	 public void loginToGuru99(String username, String password) {
		 this.setUserName(username);
		 this.setPassword(password);
		 this.clickLoginButton();
	 }
	 
	 

}
