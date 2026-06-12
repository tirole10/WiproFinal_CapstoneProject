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
import utils.ExcelUtils;

import listeners.TestListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Listeners(TestListener.class)

public class GUIElementsTest {

    Logger log = LogManager.getLogger(GUIElementsTest.class);

    @Test
    public void launchWebsite() {

    	WebDriver driver = DriverFactory.setupBrowser("chrome");

        driver.get(
                "https://testautomationpractice.blogspot.com");

        // Title Validation

        log.info(
                "Page Title = "
                        + driver.getTitle());

        Assert.assertTrue(
                driver.getTitle().contains("Automation"));

        ExtentManager.test.pass(
                "Title Validation Passed");

        log.info("Title Validation Passed");

        GUIElementsPage page =
                new GUIElementsPage(driver);

        // Form Elements (Excel Data)

        page.enterName(
                ExcelUtils.getCellData(1, 0));

        page.enterEmail(
                ExcelUtils.getCellData(1, 1));

        page.enterPhone(
                ExcelUtils.getCellData(1, 2));

        log.info("Name = " +
                ExcelUtils.getCellData(1, 0));

        log.info("Email = " +
                ExcelUtils.getCellData(1, 1));

        log.info("Phone = " +
                ExcelUtils.getCellData(1, 2));

        page.enterAddress(
                "Burhanpur Madhya Pradesh");

        page.selectFemaleGender();

        page.selectDays();

        page.selectCountry();

        page.selectColors();

        page.selectAnimals();

        page.selectDatePicker1();

        page.selectDatePicker2();

        ExtentManager.test.pass(
                "Form Filled Successfully");

        log.info("Form Filled Successfully");

        // Actions

        ActionsPage actionPage =
                new ActionsPage(driver);

        actionPage.mouseHover();

        ExtentManager.test.pass(
                "Mouse Hover Done");

        log.info("Mouse Hover Done");

        actionPage.doubleClick();

        ExtentManager.test.pass(
                "Double Click Done");

        log.info("Double Click Done");

        actionPage.dragAndDrop();

        ExtentManager.test.pass(
                "Drag And Drop Done");

        log.info("Drag And Drop Done");

        actionPage.moveSlider();

        ExtentManager.test.pass(
                "Slider Done");

        log.info("Slider Done");
        
     // Dynamic Button

        actionPage.handleDynamicButton();

        ExtentManager.test.pass(
                "Dynamic Button Handled");

        log.info(
                "Dynamic Button Handled");

        // File Upload

        page.uploadSingleFile();

        ExtentManager.test.pass(
                "Single File Uploaded");

        log.info("Single File Uploaded");

        page.uploadMultipleFiles();

        ExtentManager.test.pass(
                "Multiple Files Uploaded");

        log.info("Multiple Files Uploaded");

        // Tables

        page.readStaticTable();

        ExtentManager.test.pass(
                "Static Table Read");

        log.info("Static Table Read");

        page.printStaticTableData();

        page.readSpecificCellData();

        page.getChromeCPU();

        ExtentManager.test.pass(
                "Dynamic Table Read");

        log.info("Dynamic Table Read");

        // Pagination

        page.countPaginationPages();

        page.readPaginationTable();

        ExtentManager.test.pass(
                "Pagination Handled");

        log.info("Pagination Handled");

        // Alerts

        AlertPage alertPage =
                new AlertPage(driver);

        alertPage.handleSimpleAlert();

        alertPage.handleConfirmationAlert();

        alertPage.handlePromptAlert();

        ExtentManager.test.pass(
                "Alerts Handled");

        log.info("Alerts Handled");

        // Window Handling

        alertPage.handleNewTab();

        alertPage.handlePopupWindow();

        ExtentManager.test.pass(
                "Window Handling Completed");

        log.info("Window Handling Completed");

        // Broken Links

        page.verifyBrokenLinks();

        ExtentManager.test.pass(
                "Broken Links Verified");

        log.info("Broken Links Verified");
        
     // Shadow DOM

        page.handleShadowDOM();

        ExtentManager.test.pass(
                "Shadow DOM Handled");

        log.info(
                "Shadow DOM Handled");
        
      //
        page.performWikiSearch();

        ExtentManager.test.pass(
                "Wiki Search Completed");

        log.info(
                "Wiki Search Completed");
        
     // SVG Elements

        page.clickSVGElements();

        ExtentManager.test.pass(
                "SVG Elements Clicked");

        log.info(
                "SVG Elements Clicked");


        // Visitor Counter

        page.getVisitorCount();

        ExtentManager.test.pass(
                "Visitor Count Read");

        log.info(
                "Visitor Count Read");


        // Mobile Labels

        page.verifyMobileLabels();

        ExtentManager.test.pass(
                "Mobile Labels Verified");

        log.info(
                "Mobile Labels Verified");


        // Laptop Links

        page.verifyLaptopLinks();

        ExtentManager.test.pass(
                "Laptop Links Verified");

        log.info(
                "Laptop Links Verified");
        
     // Hidden Elements & AJAX
        
        page.handleHiddenElementsAjax();

        ExtentManager.test.pass(
                "Hidden Elements AJAX Handled");

        log.info(
                "Hidden Elements AJAX Handled");
        
     // Download Files

        page.handleDownloadFiles();

        ExtentManager.test.pass(
                "Download Files Handled");

        log.info(
                "Download Files Handled");
        
        //
        
        page.handleSectionsForm();

        ExtentManager.test.pass(
                "Section Forms Handled");

        log.info(
                "Section Forms Handled");
        // Screenshot

        ScreenshotUtil.captureScreenshot(
                driver,
                "FinalProjectExecution");

        ExtentManager.test.pass(
                "Screenshot Captured");

        log.info("Screenshot Captured");

        log.info("Test Passed");

        
    }
}