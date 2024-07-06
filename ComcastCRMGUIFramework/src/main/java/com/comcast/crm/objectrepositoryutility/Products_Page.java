package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page {
	
	
	@FindBy(xpath="//img[@title=\"Create Product...\"]")
	private WebElement createProductImgBtn;
	
	@FindBy(name="search_text")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getCreateProductImgBtn() {
		return createProductImgBtn;
	}

}
