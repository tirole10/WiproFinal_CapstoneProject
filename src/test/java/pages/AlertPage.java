package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;

    // Constructor
    public AlertPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By simpleAlert =
            By.xpath("//button[text()='Simple Alert']");

    By confirmationAlert =
            By.xpath("//button[text()='Confirmation Alert']");

    By promptAlert =
            By.xpath("//button[text()='Prompt Alert']");
    
    By newTab =
            By.xpath("//button[text()='New Tab']");

    By popupWindow =
            By.xpath("//button[text()='Popup Windows']");
    
    
    
 // =========================
    // Methods
    // =========================


    public void handleSimpleAlert() {

        driver.findElement(simpleAlert).click();

        driver.switchTo().alert().accept();

        System.out.println("Simple Alert Handled");
    }

    public void handleConfirmationAlert() {

        driver.findElement(confirmationAlert).click();

        driver.switchTo().alert().dismiss();

        System.out.println("Confirmation Alert Handled");
    }

    public void handlePromptAlert() {

        driver.findElement(promptAlert).click();

        driver.switchTo().alert().sendKeys("Prachi");

        driver.switchTo().alert().accept();

        System.out.println("Prompt Alert Handled");
    }
    
    public void handleNewTab() {

        String parent =
                driver.getWindowHandle();

        driver.findElement(newTab).click();

        for(String window :
                driver.getWindowHandles()) {

            if(!window.equals(parent)) {

                driver.switchTo().window(window);

                System.out.println(
                        "New Tab Title = "
                        + driver.getTitle());

                driver.close();
            }
        }

        driver.switchTo().window(parent);

        System.out.println("New Tab Handled");
    }
    
    public void handlePopupWindow() {

        String parent =
                driver.getWindowHandle();

        driver.findElement(popupWindow).click();

        java.util.Set<String> windows =
                driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(parent)) {

                driver.switchTo().window(window);

                System.out.println(
                        "Popup Title = "
                        + driver.getTitle());

                driver.close();
            }
        }

        driver.switchTo().window(parent);

        System.out.println("Popup Window Handled");
    }
    
    
}