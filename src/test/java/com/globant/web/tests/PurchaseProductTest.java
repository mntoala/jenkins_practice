package com.globant.web.tests;

import com.globant.web.utils.BaseTest;
import com.globant.web.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseProductTest extends BaseTest {

    @Test(dataProvider = "PurchaseData", dataProviderClass = TestData.class)
    public void testPurchase(String firstName, String lastName, String postalCode){

        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());
        inventoryPage.addProduct1ToCart();
        cartPage.clickOnElement(cartPage.getCheckoutButton());
        informationPage.enterInformationPage(firstName,lastName,postalCode);
        overviewPage.clickOnElement(overviewPage.getFinishButton());
        Assert.assertEquals(successPage.getTextToValidate(),"Thank you for your order!");
    }

}
