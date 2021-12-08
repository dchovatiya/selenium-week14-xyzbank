package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility
{
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button[contains(.,'Deposit')]")
    WebElement deposit;
    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement amtToBeDeposited;
    @FindBy(xpath="//button[contains(.,'Transactions')]")
    WebElement transactions;
    @FindBy(xpath="//button[text()='Deposit']")
    WebElement depositBtn;
    @FindBy(xpath="//span[contains(.,'Deposit Successful')]")
    WebElement verifyDepSucTxt;
    @FindBy(xpath="//button[contains(.,'Withdrawl')]")
    WebElement withdrawal;
    @FindBy(xpath="//input[contains(@ng-model,'amount')]")
    WebElement amtToBeWith;
    @FindBy(xpath="//button[text()='Withdraw']")
    WebElement withBtn;
    @FindBy(xpath="//span[contains(.,'Transaction successful')]")
    WebElement verifyTranSuc;

    public void clickOnDepTab()
    {
        Reporter.log("Clicking on login button" + deposit.toString() + "<br>");
        clickOnElement(deposit);
    }
    public void enterAmtToBeDeposited() throws InterruptedException
    {
        Reporter.log("Enter amount to be deposited" + amtToBeDeposited.toString() + "<br>");
        sendTextToElement(amtToBeDeposited,"500");
        Reporter.log("Clicking on deposit button" + depositBtn.toString() + "<br>");
        clickOnElement(depositBtn);

    }
    public void verifyTheMsgOfAmtDep() throws InterruptedException
    {
        Reporter.log("Verify deposit successful" + verifyDepSucTxt.toString() + "<br>");
        verifyThatTextIsDisplayed(verifyDepSucTxt,"Deposit Successful");
    }
    public void clickOnWithWithTab() throws InterruptedException
    {
        Reporter.log("Click on withdrawal button" + withdrawal.toString() + "<br>");
        clickOnElement(withdrawal);
        Reporter.log("Enter amount to withdraw" + withdrawal.toString() + "<br>");
        Thread.sleep(2000);
        sendTextToElement(amtToBeWith,"50");
        Thread.sleep(2000);
        Reporter.log("Click on withdraw button" + withdrawal.toString() + "<br>");
        clickOnElement(withBtn);
    }
    public void verifyTranSuccess() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Verify transaction successful" + withdrawal.toString() + "<br>");
        verifyThatTextIsDisplayed(verifyTranSuc,"Transaction successful");
        Thread.sleep(5000);
    }
}
