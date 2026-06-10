package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;


public class GUIElementsPage {

    WebDriver driver;

    // Constructor
    public GUIElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    // =========================
    // Locators
    // =========================

    By name = By.id("name");

    By email = By.id("email");

    By phone = By.id("phone");

    By address = By.id("textarea");

    By femaleGender = By.id("female");

    By sunday = By.id("sunday");

    By monday = By.id("monday");

    By friday = By.id("friday");
    
    By country = By.id("country");
    
    By colors = By.id("colors");
    
    By animals = By.id("animals");
    
    By datePicker1 = By.id("datepicker");

    By datePicker2 = By.id("txtDate");
    
    By startDate = By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]");

    By endDate = By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]");

    By submitBtn = By.xpath("//button[text()='Submit']");
    
    By singleFileInput = By.id("singleFileInput");

    By multipleFileInput = By.id("multipleFilesInput");
    
    By tableRows =
            By.xpath("//table[@name='BookTable']//tr");

    By tableColumns =
            By.xpath("//table[@name='BookTable']//th");
    
    By specificCell =
            By.xpath("//table[@name='BookTable']//tr[4]/td[1]");
    
    By chromeCPU =
    		By.xpath("//td[text()='Chrome']/following-sibling::td[3]");
    
    By pageNumbers =
            By.xpath("//ul[@id='pagination']//li");
    
    By brokenLinks =
            By.xpath("//h2[contains(text(),'Broken Links')]/following::a");
    
    
    
    
    
    
    // =========================
    // Methods
    // =========================

    public void enterName(String userName) {

        driver.findElement(name).sendKeys(userName);
    }

    public void enterEmail(String userEmail) {

        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPhone(String userPhone) {

        driver.findElement(phone).sendKeys(userPhone);
    }

    public void enterAddress(String userAddress) {

        driver.findElement(address).sendKeys(userAddress);
    }

    public void selectFemaleGender() {

        driver.findElement(femaleGender).click();
    }

    public void selectDays() {

        driver.findElement(sunday).click();

        driver.findElement(monday).click();

        driver.findElement(friday).click();
    }
    
    public void selectCountry() {

        Select countryDropdown =
                new Select(driver.findElement(country));

        countryDropdown.selectByVisibleText("India");
    }
    
    public void selectColors() {

        Select colorDropdown =
                new Select(driver.findElement(colors));

        colorDropdown.selectByVisibleText("Red");

        colorDropdown.selectByVisibleText("Blue");

        colorDropdown.selectByVisibleText("Green");
    }
    
    public void selectAnimals() {

        Select animalDropdown =
                new Select(driver.findElement(animals));

        animalDropdown.selectByVisibleText("Cat");

        animalDropdown.selectByVisibleText("Dog");

        animalDropdown.selectByVisibleText("Lion");
    }
    public void selectDatePicker1() {

        driver.findElement(datePicker1)
              .sendKeys("06/08/2026");
    }

    public void selectDatePicker2() {

        driver.findElement(datePicker2).click();

        List<WebElement> dates =
                driver.findElements(
                By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for (WebElement date : dates) {

            if (date.getText().equals("15")) {

                date.click();

                break;
            }
        }
    }
    
    public void selectDateRange() {

        driver.findElement(startDate)
              .sendKeys("01-06-2026");

        driver.findElement(endDate)
              .sendKeys("15-06-2026");

        driver.findElement(submitBtn).click();
    }
    public void uploadSingleFile() {

        driver.findElement(singleFileInput)
              .sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\TestFiles\\Wipro_day19_Assignment.pdf");

        System.out.println("Single File Uploaded");
    }

    public void uploadMultipleFiles() {

        String file1 =
                "C:\\Users\\HP\\OneDrive\\Desktop\\TestFiles\\Wipro_day19_Assignment.pdf";

        String file2 =
                "C:\\Users\\HP\\OneDrive\\Desktop\\TestFiles\\Wipro_Day17_Assignment.pdf";

        driver.findElement(multipleFileInput)
              .sendKeys(file1 + "\n" + file2);

        System.out.println("Multiple Files Uploaded");
    }
    public void readStaticTable() {

        List<WebElement> rows =
                driver.findElements(tableRows);

        List<WebElement> columns =
                driver.findElements(tableColumns);

        System.out.println("Total Rows = "
                + rows.size());

        System.out.println("Total Columns = "
                + columns.size());
    }
    
    public void printStaticTableData() {

        List<WebElement> rows =
                driver.findElements(
                By.xpath("//table[@name='BookTable']//tr"));

        for (WebElement row : rows) {

            System.out.println(row.getText());
        }
    }
    
    public void readSpecificCellData() {

        String value =
                driver.findElement(specificCell)
                      .getText();

        System.out.println("Specific Cell Data = "
                + value);
    }
    
    public void getChromeCPU() {

        String cpu =
                driver.findElement(chromeCPU)
                      .getText();

        System.out.println("Chrome CPU = " + cpu);
    }
    
    public void countPaginationPages() {

        List<WebElement> pages =
                driver.findElements(pageNumbers);

        System.out.println("Total Pages = "
                + pages.size());
    }
    
    public void readPaginationTable() {

        for (int i = 1; i <= 4; i++) {

            driver.findElement(
                    By.xpath("//ul[@id='pagination']//li[" + i + "]"))
                    .click();

            List<WebElement> products =
                    driver.findElements(
                            By.xpath("//table[@id='productTable']//tbody/tr/td[2]"));

            for (WebElement product : products) {

                System.out.println(product.getText());
            }
        }
    }
    
    public void verifyBrokenLinks() {

        List<WebElement> links =
                driver.findElements(
                By.xpath("//a[contains(text(),'Errorcode')]"));

        System.out.println("Total Broken Links = "
                + links.size());

        for(WebElement link : links) {

            System.out.println(link.getText());
        }
    }
    

}