package manager;

import org.openqa.selenium.By;

public interface Logoutlocator {
     By HEADER_MENU_BTN = By.xpath("//button[@data-testid='header-member-menu-button']");
     By MENU_LOGOUT_BTN = By.xpath("//button[@data-testid='account-menu-logout']");

     By LOGOUT_SUBMIT_BTN = By.xpath("//button[@id='logout-submit']");
}
