package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility
{
    public BankManagerLoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button[contains(@class,'btn home')]")
    WebElement home;
    @FindBy(xpath="//button[contains(.,'Add Customer')]")
    WebElement addCustomer;
    @FindBy(xpath="//button[contains(.,'Open Account')]")
    WebElement openAct;
    @FindBy(xpath="//button[contains(.,'Customers')]")
    WebElement customers;

    public void clickOnAddCustomer() throws InterruptedException
    {
        Reporter.log("Clicking add customer button " + addCustomer.toString() + "<br>");
        clickOnElement(addCustomer);
    }
    public void clickOnOpenAccount() throws InterruptedException
    {
        Reporter.log("Clicking on open account" + openAct.toString() + "<br>");
        clickOnElement(openAct);
    }
}
