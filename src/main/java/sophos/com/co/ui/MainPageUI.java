package sophos.com.co.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPageUI {
    public static final Target CATEGORY = Target.the("{0}").locatedBy("//div[@class=\"category-cards\"]//div[@class=\"card mt-4 top-card\"][descendant::h5[contains(text(), \"{0}\")]]");
}