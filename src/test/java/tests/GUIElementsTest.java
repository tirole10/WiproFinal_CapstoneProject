package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import pages.GUIElementsPage;
import pages.ActionsPage;
import pages.AlertPage;

import utils.DriverFactory;
import utils.ScreenshotUtil;
import utils.ExtentManager;

import listeners.TestListener;

@Listeners(TestListener.class)

public class GUIElementsTest {

    @Test
    public void launchWebsite() {

        WebDriver driver =
                DriverFactory.setupBrowser();

        driver.get(
                "https://testautomationpractice.blogspot.com");

        // Title Validation

        System.out.println(
                "Page Title = "
                + driver.getTitle());

        Assert.assertTrue(
                driver.getTitle().contains("Automation"));

        ExtentManager.test.pass(
                "Title Validation Passed");

        GUIElementsPage page =
                new GUIElementsPage(driver);

        // Form Elements

        page.enterName("Prachi");

        page.enterEmail("prachi@gmail.com");

        page.enterPhone("9617021308");

        page.enterAddress("Burhanpur Madhya Pradesh");

        page.selectFemaleGender();

        page.selectDays();

        page.selectCountry();

        page.selectColors();

        page.selectAnimals();

        page.selectDatePicker1();

        page.selectDatePicker2();

        ExtentManager.test.pass(
                "Form Filled Successfully");

        // Actions

        ActionsPage actionPage =
                new ActionsPage(driver);

        actionPage.mouseHover();

        ExtentManager.test.pass(
                "Mouse Hover Done");

        actionPage.doubleClick();

        ExtentManager.test.pass(
                "Double Click Done");

        actionPage.dragAndDrop();

        ExtentManager.test.pass(
                "Drag And Drop Done");

        actionPage.moveSlider();

        ExtentManager.test.pass(
                "Slider Done");

        // File Upload

        page.uploadSingleFile();

        ExtentManager.test.pass(
                "Single File Uploaded");

        page.uploadMultipleFiles();

        ExtentManager.test.pass(
                "Multiple Files Uploaded");

        // Tables

        page.readStaticTable();

        ExtentManager.test.pass(
                "Static Table Read");

        page.printStaticTableData();

        page.readSpecificCellData();

        page.getChromeCPU();

        ExtentManager.test.pass(
                "Dynamic Table Read");

        // Pagination

        page.countPaginationPages();

        page.readPaginationTable();

        ExtentManager.test.pass(
                "Pagination Handled");

        // Alerts

        AlertPage alertPage =
                new AlertPage(driver);

        alertPage.handleSimpleAlert();

        alertPage.handleConfirmationAlert();

        alertPage.handlePromptAlert();

        ExtentManager.test.pass(
                "Alerts Handled");

        // Window Handling

        alertPage.handleNewTab();

        alertPage.handlePopupWindow();

        ExtentManager.test.pass(
                "Window Handling Completed");

        // Broken Links

        page.verifyBrokenLinks();

        ExtentManager.test.pass(
                "Broken Links Verified");

        // Screenshot

        ScreenshotUtil.captureScreenshot(
                driver,
                "FinalProjectExecution");

        ExtentManager.test.pass(
                "Screenshot Captured");

        System.out.println(
                "Form Filled Successfully");

        driver.quit();
    }
}