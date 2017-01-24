package org.funjala.automation.web.pages.mach2.menu;

import org.funjala.automation.web.model.mach2.TopMenuModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by JorgeForero on 1/19/2017.
 */
public class TopMenu {
  private WebDriver driver;
  private WebDriverWait wait;

  @FindBy(css = TopMenuModel.userMenu)
  private WebElement userMenu;

  @FindBy(css = TopMenuModel.logOutButton)
  private WebElement logOutButton;

  @FindBy(xpath = TopMenuModel.jalasoftBtn)
  private WebElement jalasoftBtn;

  @FindBy(xpath = TopMenuModel.boardDropDownBtn)
  private WebElement boardDropDownBtn;

  @FindBy(xpath = TopMenuModel.addBoardBtn)
  private WebElement addBoardBtn;

  @FindBy(xpath = TopMenuModel.addWidgetBtn)
  private WebElement addWidgetBtn;

  public TopMenu(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    wait = new WebDriverWait(driver, 20);
  }

  public void clickBoardDropDown(){
    boardDropDownBtn.click();
  }

  public void clickJalasoftBtn(){
    jalasoftBtn.click();
  }

  public void clickAddBoardBtn(){
    addBoardBtn.click();
  }

  public void clickAddWidgetBtn(){
    addWidgetBtn.click();

  }

  public void clickOnLogOut() {
    userMenu.click();
    logOutButton.click();
    driver.get("http://10.31.2.215:3666/");
  }
}
