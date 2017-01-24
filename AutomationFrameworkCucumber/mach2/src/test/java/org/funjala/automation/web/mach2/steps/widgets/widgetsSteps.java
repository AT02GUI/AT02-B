package org.funjala.automation.web.mach2.steps.widgets;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.funjala.automation.web.pages.mach2.HomePage;
import org.funjala.automation.web.pages.mach2.LoginPage;
import org.funjala.automation.web.pages.mach2.MyDashboard;
import org.funjala.automation.web.pages.mach2.menu.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 1/24/2017.
 */
public class widgetsSteps {
  WebDriver driver;
  HomePage homePage;
  LoginPage loginPage;
  TopMenu topmenu;
  MyDashboard dashboard;

  @Given("^I Log-in to MACH2 website page$")
  public void onPivotalTrackerPage() throws IOException {
    System.setProperty("webdriver.chrome.driver", "../tools/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    loginPage = new LoginPage(driver);
    driver.get("http://10.31.2.215:3666/");
  }

  @And("^I set ([^\"]*) in user textfield$")
  public void putNameAndPressNextButton(String userName) {
    loginPage.setUsernameTextField(userName);
  }

  @And("^I set ([^\"]*) in password textfield and press Submit button$")
  public void putPasswordAndPressSubmitButton(String password) {
    loginPage.setPasswordTextField(password);
    homePage = loginPage.clickNextButton();
  }

  @And("^I click on Jalasoft top menu button$")
  public void iClickOnJalasoftTopMenuButton() {
    topmenu = new TopMenu(driver);
    topmenu.clickJalasoftBtn();
  }

  @And("^I click on Board dropdown menu$")
  public void iClickOnBoardDropdownMenu() {
    topmenu.clickBoardDropDown();
  }

  @And("^I click on Board Item to create a new Board$")
  public void iClickOnBoardItemToCreateANewBoard() {
    topmenu.clickAddBoardBtn();
  }

  @When("^I click on Widget top menu button$")
  public void iClickOnWidgetTopMenuButton()  {
    topmenu.clickAddWidgetBtn();
  }

  @Then("^A new Widgets List should be displayed on the body of MACH2$")
  public void aNewWidgetsListShouldBeDisplayedOnTheBodyOfMACH()  {
//    dashboard = new MyDashboard(driver);
//    assertTrue(dashboard.verifyWidgetsGridList());
  }
}



