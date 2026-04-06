package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import utils.BaseTest;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartSuccessfully() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addBackpackToCart();

        Assert.assertEquals(inventoryPage.getCartCount(), "1");
    }
}