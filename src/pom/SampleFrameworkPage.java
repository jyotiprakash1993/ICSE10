package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class SampleFrameworkPage extends BasePage implements AutoConstant
{
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;	

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement emailidTextfield;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement maleRadiobutton;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement femaleRadiobutton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement remembermeCheckbox;
	
	@FindBy(xpath = "//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement mobilenoTextfield;
	
	@FindBy(xpath = "//textarea")
	private WebElement addressTextarea;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement saveButton;	
	
	public SampleFrameworkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submitdata() throws IOException
	{
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 0));
		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 1));
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 2));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 3));
		emailidTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 4));
		maleRadiobutton.click();
		remembermeCheckbox.click();
		selectbyvisibiletext(countrycodeDropdownlist, "+33");
		mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 5));
		addressTextarea.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 6));
		saveButton.click();
	}
}