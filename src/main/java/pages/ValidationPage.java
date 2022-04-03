package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
 
 public class ValidationPage extends BasePage{
	
	WebDriver driver;
    
	public  void ValidPage(WebDriver driver) {
		 
	}
	
   	@FindBy (how = How.CSS, using = "input[type=text]:nth-child(7)")WebElement Add_Category;
	@FindBy (how = How.CSS, using = "input[type=submit]:nth-child(8)") WebElement Validate_Duplicate;
	@FindBy (how = How.CSS, using = "select:nth-child(3)") WebElement Months_Dropdown;
	
	
	public void add_Category(String category) {
		int generatedNum = generateRandomNumber(700);
		Add_Category.sendKeys(category + generatedNum);
		System.out.println(category+generatedNum);
	}
 
	
	public void validateDuplicate() {
		Validate_Duplicate.click();
	}
	
	public void dropdownsMonths(String name) {
		Months_Dropdown.click();
		selectFromDropdown(Months_Dropdown, name);
		
	}

}

 
 
