package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(
            WebDriver driver,
            String screenshotName) {

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        File source =
                ts.getScreenshotAs(
                        OutputType.FILE);

        File destination =
                new File(
                "Screenshots\\"
                + screenshotName
                + ".png");

        try {

            FileUtils.copyFile(
                    source,
                    destination);

            System.out.println(
                    "Screenshot Captured");

        }

        catch (IOException e) {

            e.printStackTrace();
        }
    }
}