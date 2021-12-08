package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility
{
    public CustomersPage()
    {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement searchCustom;
    @FindBy(xpath ="//button[contains(text(),'Delete')]")
    WebElement delBtn;
    @FindBy(xpath ="//button[contains(.,'Login')]")
    WebElement loginBtn;
    @FindBy(xpath ="//button[@class='btn logout']")
    WebElement logout;

    public void searchCustomer(String name) throws InterruptedException
    {
        Reporter.log("Click on search customer " + searchCustom.toString() + "<br>");
        selectByVisibleTextFromDropDown(searchCustom,name);
    }
    public void clickOnLoginBtn()
    {
        Reporter.log("Click on login button" + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);

    }
    public void verifyLogout() throws InterruptedException
    {
        Thread.sleep(2000);
        Boolean logoutBtnPresent=logout.isDisplayed();
        System.out.println("The logout button display status is "+logoutBtnPresent);
        Thread.sleep(2000);
    }
    public void clickOnLogoutBtn() throws InterruptedException
    {
        Reporter.log("Click on logout button" + logout.toString() + "<br>");
        Thread.sleep(2000);
        clickOnElement(logout);
        Thread.sleep(5000);

    }
    public void verifyYourNm()
    {

    }
}
