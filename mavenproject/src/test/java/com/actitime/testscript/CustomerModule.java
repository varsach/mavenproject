package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.Homepage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testcreatecustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createcustomer",true);
		FileLib f=new FileLib();
		String custname = f.getExcelData("createcustomer", 1, 3);
	    String custdesp = f.getExcelData("createcustomer", 1, 4);
	
		Homepage h=new Homepage(driver);
		h.setTasks();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewcusBtn().click();
		t.getEntercustnametbx().sendKeys(custname);
		t.getEntercustdesptbx().sendKeys(custdesp);
		t.getSelectcustdd().click();
		t.getBigbangcompany().click();
		t.getCreatecustbtn().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualcustname(), custname));
		String actualtext = t.getActualcustname().getText();
		Assert.assertEquals(actualtext,custname);
		
		
				
	}

}
