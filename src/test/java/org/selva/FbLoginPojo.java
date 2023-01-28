package org.selva;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {

	
	public FbLoginPojo() {
		
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbtn;

	public WebElement getEmail() {
		return email;
	}

	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
