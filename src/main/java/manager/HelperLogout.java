package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperLogout extends HelperBase implements Logoutlocator{

    public HelperLogout(WebDriver driver) {
        super(driver);
    }



    public void logout() {
        click(HEADER_MENU_BTN);
        click(MENU_LOGOUT_BTN);
        click(LOGOUT_SUBMIT_BTN);
    }
}
