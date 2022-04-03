package test;

 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ValidationPage;
import util.BrowserFactory;

  
 
 

public class ValidationTest {
	 
	WebDriver driver;
	 
   String category ="QA Engineer Exam";
   String Months_Dropdown;
	
  @Test
  public void userShouldAddCategory() {
		
		driver = BrowserFactory.init();
	     
		 ValidationPage validationpage = PageFactory.initElements(driver, ValidationPage.class);
		 validationpage.add_Category(category);
		 validationpage.validateDuplicate();
		 validationpage.dropdownsMonths(Months_Dropdown);
	}

}
