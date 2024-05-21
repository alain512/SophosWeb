package sophos.com.co.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MenuListUI {
    public static final Target BTN_MENU = Target.the("{0}").locatedBy("//li[contains(@class, \"btn\")][descendant::span[contains(text(), \"{0}\")]]");
}
