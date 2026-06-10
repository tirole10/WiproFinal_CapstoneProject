package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionsPage {

    WebDriver driver;
    Actions action;

    public ActionsPage(WebDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    // Mouse Hover

    By pointMe =
            By.xpath("//button[text()='Point Me']");

    // Double Click

    By copyBtn =
            By.xpath("//button[text()='Copy Text']");

    // Drag Drop

    By source =
            By.id("draggable");

    By target =
            By.id("droppable");
    
    By slider =
            By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']");



    public void mouseHover() {

        action.moveToElement(
                driver.findElement(pointMe))
                .perform();

        System.out.println("Mouse Hover Done");
    }

    public void doubleClick() {

        action.doubleClick(
                driver.findElement(copyBtn))
                .perform();

        System.out.println("Double Click Done");
    }

    public void dragAndDrop() {

        WebElement src =
                driver.findElement(source);

        WebElement dest =
                driver.findElement(target);

        action.dragAndDrop(src, dest)
              .perform();

        System.out.println("Drag And Drop Done");
    }
    
    public void moveSlider() {

        WebElement slide =
                driver.findElement(slider);

        action.dragAndDropBy(
                slide,
                100,
                0)
                .perform();

        System.out.println("Slider Done");
    }

}