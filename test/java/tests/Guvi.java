package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Guvi extends mainChorme{
    //signin
    @Test
    public void signin() {

        //load url
        chromeDriver.get("https://www.guvi.in");

        //locate sign in
        WebElement signIn = chromeDriver.findElement(By.xpath("//a[@href=\"/register/\"]"));
        signIn.click();

        //locate Xpath
        WebElement username = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        WebElement mobile = chromeDriver.findElement(By.xpath("//input[@id='mobileNumber']"));
        WebElement signup = chromeDriver.findElement(By.xpath("//a[@id='signup-btn']"));
        username.sendKeys("Ishitha");
        email.sendKeys("test@123.com");
        password.sendKeys("Test@1234");
        mobile.sendKeys("7892623048");
        signup.click();

        String title = "GUVI | Sign Up";
        if(chromeDriver.getTitle().equals(title)) {
            System.out.println("User register successfully");
        }
        else {
            System.out.println("User register failed");
        }

    }
    //login
    @Test
    public void login() {

        //load url
        chromeDriver.get("https://www.guvi.in");

        //click login
        WebElement login = chromeDriver.findElement(By.xpath("//a[@href=\"/sign-in/\"]"));
        login.click();

        //locate Xpath
        WebElement emailLogin = chromeDriver.findElement(By.className().xpath("//input[@id='email']"));
        WebElement passwordLogin = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        WebElement submit = chromeDriver.findElement(By.xpath("//a[@id='login-btn']"));
        emailLogin.sendKeys("test@123.com");
        passwordLogin.sendKeys("Test@1234");
        submit.click();

        String titleLogin = "GUVI | Login";
        if(chromeDriver.getTitle().equals(titleLogin)) {
            System.out.println("User login successfully");
        }
        else {
            System.out.println("User login failed");
        }
    }


}
