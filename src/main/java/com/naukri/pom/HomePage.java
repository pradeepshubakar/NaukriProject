package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//*[@id='root']/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/a[1]/div[2]/div[1]")
private WebElement nameLink;
@FindBy(xpath="//a[.='Update']")
private WebElement updateLink;
@FindBy(xpath="//input[@id='attachCV']")
private WebElement attachCv;
@FindBy(xpath="//a[.='Logout']")
private WebElement logoutLink;

public  HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickNameLink() {
	nameLink.click();
}
public void clickUpdateLink() {
	updateLink.click();
}
public WebElement getAttachCv() {
	return attachCv;
}
public void clickOnLogout() {
	logoutLink.click();
}

}
