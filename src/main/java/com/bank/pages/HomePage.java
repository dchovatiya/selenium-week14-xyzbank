package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility
{
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button[contains(@class,'btn home')]")
    WebElement home;
    @FindBy(xpath="//button[@ng-click='customer()']")
    WebElement customerLogin;
    @FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManaLogBtn;


    public void clickOnCustomLogin()
    {
        Reporter.log("Click on customer login" + customerLogin.toString() + "<br>");
        clickOnElement(customerLogin);
    }
    public void clickOnBankLoNBtn()
    {
        Reporter.log("Click on bank login button" + bankManaLogBtn.toString() + "<br>");
        clickOnElement(bankManaLogBtn);
    }
}
