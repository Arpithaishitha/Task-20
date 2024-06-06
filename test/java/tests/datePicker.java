package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class datePicker extends mainChorme{
    @Test
    public void date() {

        //load url
        chromeDriver.get("https://jqueryui.com/datepicker/");

        //switch to frame
        chromeDriver.switchTo().frame(chromeDriver.findElement(By.className().className("demo-frame")));

        //click date input field
        WebElement dateInput = chromeDriver.findElement(By.xpath("//input[@id='datepicker']"));
        dateInput.click();

        //click next month
        WebDriverWait wait = new  WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        WebElement nextMonth = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//a[@title='Next']"))));
        nextMonth.click();

        //pick 22th date
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//a[@data-date='22']"))));
        date.click();


        //print selected date
        String selectDate =date.getText();
        System.out.println("Selected Date: " +selectDate);

    }

}
