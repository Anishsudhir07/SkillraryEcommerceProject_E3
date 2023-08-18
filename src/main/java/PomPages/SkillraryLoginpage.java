package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage 
{
   
	
	@FindBy(xpath="//a[contains(text(), 'GEARS')] ")
	private WebElement gearsbtn;
	
	@FindBy(xpath="//a[contains(text(), 'SkillRary Demo APP')][2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	
	private WebElement searchtb;
	@FindBy(xpath="//input[@value='go']")
	
	private WebElement searchbtn;
	
	
	
	public SkillraryLoginpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	
	public void gobutton()
	{
		searchbtn.click();
	}
}
