package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcusBtn;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustnametbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustdesptbx;
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcustdd;
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ' ]")
	private WebElement bigbangcompany;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustbtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualcustname;
	
	


	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddnewBtn() {
		return addnewBtn;
	}


	public WebElement getNewcusBtn() {
		return newcusBtn;
	}


	public WebElement getEntercustnametbx() {
		return entercustnametbx;
	}


	public WebElement getEntercustdesptbx() {
		return entercustdesptbx;
	}


	public WebElement getSelectcustdd() {
		return selectcustdd;
	}


	public WebElement getBigbangcompany() {
		return bigbangcompany;
	}


	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}
	public WebElement getActualcustname() {
		return actualcustname;
	}
	
}
