package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility
{
    public AddCustomerPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(@class,'btn home')]")
    WebElement home;
    @FindBy(xpath ="//button[contains(.,'Add Customer')]")
    WebElement addCustomer;
    @FindBy(xpath ="//button[contains(.,'Open Account')]")
    WebElement openAct;
    @FindBy(xpath = "//button[contains(.,'Customers')]")
    WebElement customers;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNm;
    @FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
    WebElement lastNm;
    @FindBy(xpath = "//input[contains(@placeholder,'Post Code')]")
    WebElement postCode;
    @FindBy(xpath = "//button[text()='Add Customer']")
    WebElement addCustomer1;




    public void enterFirstNm(String firstName) throws InterruptedException
    {
        Reporter.log("Enter first name " + firstName + " to firstname field " + firstNm.toString() + "<br>");
        sendTextToElement(firstNm,firstName);

    }
    public void enterLastNm(String lastName) throws InterruptedException
    {
        Reporter.log("Enter last name " + lastName + " to lastname field " + lastNm.toString() + "<br>");
        sendTextToElement(lastNm,lastName);


    }
    public void enterPostCode(String postCode1) throws InterruptedException
    {
        Reporter.log("Enter post code " + postCode1 + " to lastname field " + postCode.toString() + "<br>");
        sendTextToElement(postCode,postCode1);
        Thread.sleep(2000);
    }
    public void clickOnAddCustomerBtn() throws InterruptedException
    {
        Reporter.log("Click on add customer "  + addCustomer1.toString() + "<br>");
        clickOnElement(addCustomer1);

    }
    public void getTxtFromAlert()
    {
        System.out.println(getTextFromAlert());
        acceptAlert();
    }
}
