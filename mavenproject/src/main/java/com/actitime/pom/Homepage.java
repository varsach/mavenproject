package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(id="logoutLink")
	private WebElement lgBtn;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement TasksTab;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
		public void setlogout() {
			lgBtn.click();
		}
	public void setTasks() {
		TasksTab.click();
		
	}
}
