package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility
{
    public CustomerLoginPage(WebElement home)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//button[contains(@class,'btn home')]")
    WebElement home;
    @FindBy(xpath ="//select[@id='userSelect']")
    WebElement yourNmDD;

    public void clickOnBankManagerBtn()
    {


    }
}
