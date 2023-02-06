package org.utilitys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement textUser;
	@FindBy(id="pass")
	private WebElement textPass;
	@FindBy(name="login")
	private WebElement textLogin;
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement textForget;
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement textFindAccount;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement textEnter;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement textSearchButton;
	public WebElement getTextSearchButton() {
		return textSearchButton;
	}
	public WebElement getTextEnter() {
		return textEnter;
	}
	public WebElement getTextFindAccount() {
		return textFindAccount;
	}
	public WebElement getTextForget() {
		return textForget;
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
