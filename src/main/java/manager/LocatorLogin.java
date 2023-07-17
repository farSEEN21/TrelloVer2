package manager;

import org.openqa.selenium.By;

public interface LocatorLogin {
    By OPEN_LOGIN_PAGE_BTN = By.xpath("//a[contains(text(), 'Log in')]");
    By INPUT_EMAIL = By.xpath("//input[@id='user']");
    By BTN_LOGIN = By.xpath("//input[@id='login']");
    By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    By CONFIRM_PASSWORD_BTN = By.xpath("//button[@id='login-submit']");
    By TEXT_WORKSPACE_AFTER_LOGIN = By.xpath("//span[@data-testid='home-team-tab-name']");

    By TEXT_INCORRECT_PASSWORD = By.xpath("//div[@data-testid='form-error--content']/span/span");
}
