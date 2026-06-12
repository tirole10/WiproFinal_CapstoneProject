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
    
    By wikiSearchBox =
            By.id("Wikipedia1_wikipedia-search-input");

    By wikiSearchButton =
            By.xpath("//input[@type='submit']");
    
    
    
    
    
    
    
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
    
    public void clickSVGElements() {

        try {

            driver.findElement(
                    By.xpath("(//*[name()='svg'])[1]"))
                    .click();

            driver.findElement(
                    By.xpath("(//*[name()='svg'])[2]"))
                    .click();

            driver.findElement(
                    By.xpath("(//*[name()='svg'])[3]"))
                    .click();

            System.out.println("SVG Elements Clicked");

        } catch (Exception e) {

            System.out.println("SVG Elements Not Found");
        }
    }

    public void getVisitorCount() {

        try {

            WebElement visitors =
                    driver.findElement(
                    By.xpath("//h2[contains(text(),'Visitors')]"));

            System.out.println(
                    "Visitors Section Found = "
                    + visitors.getText());

        } catch (Exception e) {

            System.out.println(
                    "Visitor Count Not Found");
        }
    }

    public void verifyMobileLabels() {

        try {

            List<WebElement> labels =
                    driver.findElements(
                    By.xpath("//*[contains(text(),'Samsung') or contains(text(),'Real Me') or contains(text(),'Moto')]"));

            for(WebElement label : labels) {

                System.out.println(
                        "Mobile Label = "
                        + label.getText());
            }

        } catch (Exception e) {

            System.out.println(
                    "Mobile Labels Not Found");
        }
    }

    public void verifyLaptopLinks() {

        try {

            List<WebElement> links =
                    driver.findElements(
                    By.xpath("//a"));

            for(WebElement link : links) {

                String text =
                        link.getText();

                if(text.equals("Apple")
                        || text.equals("Lenovo")
                        || text.equals("Dell")) {

                    System.out.println(
                            "Laptop Link = "
                            + text);
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Laptop Links Not Found");
        }
    }
    
    public void handleShadowDOM() {

        WebElement shadowHost =
                driver.findElement(By.id("shadow_host"));

        org.openqa.selenium.SearchContext shadowRoot =
                shadowHost.getShadowRoot();

        String mobile =
                shadowRoot.findElement(
                        By.cssSelector(".info"))
                        .getText();

        System.out.println("Shadow Mobile = "
                + mobile);

        WebElement blogLink =
                shadowRoot.findElement(
                        By.linkText("Blog"));

        System.out.println("Blog Link = "
                + blogLink.getText());

        driver.findElement(
                By.xpath("(//input[@type='text'])[5]"))
                .sendKeys("Prachi");

        driver.findElement(
                By.xpath("(//input[@type='checkbox'])[5]"))
                .click();

        System.out.println(
                "Shadow Textbox and Checkbox Handled");
    }
    
    public void performWikiSearch() {

        driver.findElement(wikiSearchBox)
                .sendKeys("Selenium");

        driver.findElement(wikiSearchButton)
                .click();

        System.out.println(
                "Wiki Search Performed");
    }
    
    public void handleHiddenElementsAjax() {

        try {

            driver.navigate().to(
            "https://testautomationpractice.blogspot.com/p/hidden-elements.html");

            Thread.sleep(2000);

            System.out.println("Hidden Elements Page Opened");

        } catch (Exception e) {

            System.out.println("Hidden Elements Section Not Found");
        }
    }
    
    public void handleDownloadFiles() {

        driver.navigate().to(
        "https://testautomationpractice.blogspot.com/p/download-files_25.html");

        driver.findElement(
                By.id("inputText"))
                .sendKeys("Prachi Wipro Final Project");

        driver.findElement(
                By.id("generateTxt"))
                .click();

        System.out.println(
                "Text File Download Triggered");

        driver.findElement(
                By.id("generatePdf"))
                .click();

        System.out.println(
                "PDF File Download Triggered");
    }
    
    public void handleSectionsForm() {

        driver.findElement(By.id("input1"))
              .sendKeys("Prachi");

        driver.findElement(By.id("btn1"))
              .click();

        driver.findElement(By.id("input2"))
              .sendKeys("Wipro");

        driver.findElement(By.id("btn2"))
              .click();

        driver.findElement(By.id("input3"))
              .sendKeys("Automation");

        driver.findElement(By.id("btn3"))
              .click();

        System.out.println("Section Forms Handled");
    }
}