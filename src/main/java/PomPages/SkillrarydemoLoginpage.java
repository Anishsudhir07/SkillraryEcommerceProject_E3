package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydemoLoginpage 
{
	  
	@FindBy(xpath="//a[contains(text(),'COURSE')]")
  private WebElement coursetab;
	
	
  @FindBy(xpath="//select[contains(@name,'addresstype')]")
  
  private WebElement coursedd;
  
  @FindBy(xpath="//a[contains(text(),'Selenium Training')]")
  
  private WebElement SeleniumTraining;
  
  
  
  
  
  public SkillrarydemoLoginpage(WebDriver driver)
  {
	  PageFactory.initElements( driver,this);
  }
  
  
 public WebElement getcourse() 
 {
	return coursedd;
	 
 }
 public WebElement getcoursetab()
 {
	 return coursetab;
 }
 
 public void SeleniumTrainingtab()
 {
	 SeleniumTraining.click(); 
 }
 
}


