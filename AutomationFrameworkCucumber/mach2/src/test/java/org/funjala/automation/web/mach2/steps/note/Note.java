package org.funjala.automation.web.mach2.steps.note;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.funjala.automation.web.common.drivers.Driver;
import org.funjala.automation.web.pages.mach2.HomePage;
import org.funjala.automation.web.pages.mach2.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * Created by Administrator on 1/25/2017.
 */
public class Note {

  WebDriver driver;
  HomePage homePage;
  LoginPage loginPage;
  WebDriverWait wait;

  @Given("^I navigate to match2$")
  public void iNavigateToMatch() throws IOException {
    driver = Driver.getDriver().openBrowser(Driver.Mach2);
    wait = new WebDriverWait(driver,10);
    loginPage = new LoginPage(driver);
    loginPage.setUsernameTextField("sergio-landa@fundacion-jala.org");
    loginPage.setPasswordTextField("Erblicken1");
    homePage = loginPage.clickNextButton();

  }
}
