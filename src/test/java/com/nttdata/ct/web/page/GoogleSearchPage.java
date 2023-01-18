package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class GoogleSearchPage extends WebBase {

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]")
    protected WebElement buttonelement;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]")
    protected WebElement radiobutton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
    protected WebElement buttonyes;


    /*@FindBy(xpath = "//*[@id="password"]")
    protected WebElement loginpass;
    @FindBy(xpath = "//*[@id="login-button"]")
    protected WebElement loginboton;*/

   /* public void writeuser(String user) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginuser));
        type(loginuser, user);
    }

    public void writepass(String pass) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginpass));
        type(loginpass, pass);
    }
    public void login() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginboton));
        click(loginboton);
    }*/
   public void element() {
       var wait = webDriverWait(Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(buttonelement));
       click(buttonelement);
       var wait2 = webDriverWait(Duration.ofSeconds(5));
       wait2.until(ExpectedConditions.elementToBeClickable(radiobutton));
       click(radiobutton);
       var wait3 = webDriverWait(Duration.ofSeconds(5));
       wait3.until(ExpectedConditions.elementToBeClickable(buttonyes));
       click(buttonyes);
   }
}