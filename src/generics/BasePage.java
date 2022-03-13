package generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void selectbyvisibiletext(WebElement element , String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void robotTAB() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void alertok(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void fetchtitle(WebDriver driver)
	{
		String actualtitle=driver.getTitle();
	}
	
	public void javascriptclick(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
}