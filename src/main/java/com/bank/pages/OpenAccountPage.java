package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility
{
    public OpenAccountPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//select[@id='userSelect']")
    WebElement customNm;
    @FindBy(xpath="//select[@id='currency']")
    WebElement currency;
    @FindBy(xpath="//button[contains(.,'Process')]")
    WebElement process;

    public void enterCustomerName()
    {
        selectByVisibleTextFromDropDown(customNm,"Harry Potter");
    }
    public void enterCurrency() throws InterruptedException
    {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(currency,"Pound");
        Thread.sleep(2000);
    }
    public void setTheProcess() throws InterruptedException
    {
        Reporter.log("Click on process" + process.toString() + "<br>");
        clickOnElement(process);
        Thread.sleep(2000);
        System.out.println(getTextFromAlert());
        Thread.sleep(2000);
        acceptAlert();
        Thread.sleep(2000);
    }
}
