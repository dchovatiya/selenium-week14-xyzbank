package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListeners.class)
public class BankTest extends TestBase
{
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    AccountPage accountPage;
    @BeforeMethod
    public void inIt()
    {
        homePage=new HomePage();
        bankManagerLoginPage =new BankManagerLoginPage();
        addCustomerPage=new AddCustomerPage();
        openAccountPage=new OpenAccountPage();
        customersPage=new CustomersPage();
        accountPage= new AccountPage();
    }

    @Test(priority = 0,groups={"smoke","Regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException
    {
        homePage.clickOnBankLoNBtn();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstNm("Dinky");
        addCustomerPage.enterLastNm("Patel");
        addCustomerPage.enterPostCode("CF26 5UR");
        addCustomerPage.clickOnAddCustomerBtn();
        addCustomerPage.getTxtFromAlert();

    }
    @Test(priority=1, groups={"sanity", "Regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException
    {
        homePage.clickOnBankLoNBtn();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.enterCustomerName();
        openAccountPage.enterCurrency();
        openAccountPage.setTheProcess();

    }
    @Test(priority=2, groups={"sanity", "Regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnCustomLogin();
        customersPage.searchCustomer("Harry Potter");
        customersPage.clickOnLoginBtn();
        customersPage.verifyLogout();
        customersPage.clickOnLogoutBtn();
        //Verify you name
    }
    @Test(priority=3, groups={"Regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomLogin();
        customersPage.searchCustomer("Harry Potter");
        customersPage.clickOnLoginBtn();
        accountPage.clickOnDepTab();
        accountPage.enterAmtToBeDeposited();
        accountPage.verifyTheMsgOfAmtDep();
    }
    @Test(priority=4, groups={"Regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException
    {
        homePage.clickOnCustomLogin();
        customersPage.searchCustomer("Harry Potter");
        customersPage.clickOnLoginBtn();
        accountPage.clickOnDepTab();
        accountPage.enterAmtToBeDeposited();
        accountPage.clickOnWithWithTab();
        accountPage.verifyTranSuccess();
    }
}




