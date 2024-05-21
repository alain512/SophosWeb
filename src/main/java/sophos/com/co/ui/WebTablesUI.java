package sophos.com.co.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTablesUI {
    public static final Target BTN_ADD = Target.the("Button add en Web Tables").located(By.id("addNewRecordButton"));
    public static final Target BTN_SUBMIT = Target.the("Button submit en Web Tables").located(By.id("submit"));
    public static final Target ICON_DELETE = Target.the("Icon delete asociado del cliente").locatedBy("//div[contains(text(), \"{0}\")]//following-sibling::div[3]//span[@title=\"Delete\"]");
    public static final Target CANTIDAD_FILAS = Target.the("Icon delete asociado del cliente").locatedBy("//div[@class=\"rt-tr-group\"][descendant::div[@class=\"rt-td\"][text()]]");
    public static final Target CAMPO_DE_TABLA = Target.the("campos de la tabla").locatedBy("//div[@class=\"rt-tr-group\"][{0}]//div[@class=\"rt-td\"][{1}]");
    public static final Target FIRST_NAME = Target.the("input firstname del formulario").locatedBy("//input[@id=\"firstName\"]");
    public static final Target LAST_NAME = Target.the("input lastname del formulario").locatedBy("//input[@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("input emnail del formulario").locatedBy("//input[@id=\"userEmail\"]");
    public static final Target AGE = Target.the("input age del formulario").locatedBy("//input[@id=\"age\"]");
    public static final Target SALARY = Target.the("input salary del formulario").locatedBy("//input[@id=\"salary\"]");
    public static final Target DEPARTMENT = Target.the("input department del formulario").locatedBy("//input[@id=\"department\"]");
    public static final Target EMAIL_LABEL = Target.the("busca el email").locatedBy("//*[text()=\"{0}\"]");

}

