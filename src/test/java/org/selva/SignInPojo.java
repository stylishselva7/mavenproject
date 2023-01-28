package org.selva;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass{
public SignInPojo() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "(//a[@class='lte-item'])[4]")
private WebElement Dosa;

@FindBy(xpath = "(//h2[@class='woocommerce-loop-product__title'])[1]")
private WebElement MasalaDosa;



}