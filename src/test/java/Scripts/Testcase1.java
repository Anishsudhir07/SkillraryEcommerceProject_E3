package Scripts;

import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import PomPages.Addtocart;
import PomPages.SkillraryLoginpage;
import PomPages.SkillrarydemoLoginpage;


public class Testcase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		SkillrarydemoLoginpage sd=new SkillrarydemoLoginpage(driver);
		utilities.mousehover(driver, sd.getcoursetab());
		sd.SeleniumTrainingtab();
		Addtocart d=new Addtocart(driver);
		utilities.doubleclick(driver, d.getAddbtn());
		d.carttobutton();
		utilities.alertpopup(driver);
	}
	

}
