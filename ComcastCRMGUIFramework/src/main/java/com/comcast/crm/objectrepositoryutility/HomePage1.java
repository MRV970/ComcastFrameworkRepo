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
	
<<<<<<< HEAD
	
=======
	@FindBy(linkText="button")
	private WebElement button;
>>>>>>> branch 'master' of https://github.com/MRV970/ComcastFrameworkRepo.git
	
	public WebElement getOrgLink() {
		return orgLink;
	}
	@FindBy(linkText="books")
	private WebElement books;
	
	@FindBy(linkText="logout")
	private WebElement logout;
	public WebElement getBooks() {
		return books;
	}

}
