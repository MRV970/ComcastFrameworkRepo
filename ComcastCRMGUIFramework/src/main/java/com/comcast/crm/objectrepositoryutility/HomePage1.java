package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	WebDriver driver;
	public HomePage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Organizations")
	private WebElement orgLink;
	@FindBy(linkText="logout")
	private WebElement logout;
	@FindBy(linkText="button")
	private WebElement button;
	
	public WebElement getOrgLink() {
		return orgLink;
	}
	@FindBy(linkText="books")
	private WebElement books;
	public WebElement getBooks() {
		return books;
	}

}
