package org.funjala.automation.web.pages.erp.login;

import org.funjala.automation.web.common.objectReader.ReadObject;
import org.funjala.automation.web.model.erp.login.LoginModel;
import org.funjala.automation.web.pages.erp.home.OEHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Properties;

public class OELoginPage {
  private WebDriver driver;
  private WebDriverWait wait;
  private Properties configurationObj;
  private String username;
  private String userPassword;

  public OELoginPage(WebDriver driver) throws IOException {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    wait = new WebDriverWait(driver, 10);
    ReadObject object = new ReadObject();
    configurationObj = object.getObjectRepository();
    username = configurationObj.getProperty("userNameOpenERP");
    userPassword = configurationObj.getProperty("userPasswordOpenERP");
  }

  @FindBy(id = LoginModel.password)
  WebElement userName;

  @FindBy(id = LoginModel.userName)
  WebElement password;

  @FindBy(xpath = "//*[@id='fm1']/section[3]/input[4]")
  WebElement btnSubmit;

  public void setUserName() {
    userName.sendKeys(username);
  }

  public void setPassword() {
    password.sendKeys(userPassword);
  }

  public OEHomePage clickBtnSubmit() {
    btnSubmit.click();
    return new OEHomePage(driver);
  }
}
