package org.BTutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BTpojoClass extends BTbaseClass {
	public BTpojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='spree_user[email]']")
	private WebElement textUser;
	@FindBy(xpath="//input[@name='spree_user[password]']")
	private WebElement textPass;
	@FindBy(xpath="//input[@value='Continue with Email']")
	private WebElement textLogin;
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement textsignin;
	@FindBy(xpath="(//input[@class='input search-input'])[1]")
	private WebElement textSearchBox;
	@FindBy(xpath="//div[text()='Ginger Oil']")
	private WebElement textGigerOil;
	@FindBy(xpath="//button[@id='add-to-cart']")
	private WebElement textAddToCart;
	@FindBy(xpath="//div[@data-search-result='ginger oil']")
	private WebElement textGigerOilSelect;
	
	
	
	
	public WebElement getTextGigerOilSelect() {
		return textGigerOilSelect;
	}
	
	
	
	public WebElement getTextAddToCart() {
		return textAddToCart;
	}
	public WebElement getTextGigerOil() {
		return textGigerOil;
	}
	public WebElement getTextSearchBox() {
		return textSearchBox;
	}
	public WebElement getTextsignin() {
		return textsignin;
	}
	public WebElement getTextUser() {
		return textUser;
	}
	public WebElement getTextPass() {
		return textPass;
	}
	public WebElement getTextLogin() {
		return textLogin;
	}

}
