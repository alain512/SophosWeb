package sophos.com.co.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPickerUI {
    public static final Target INPUT_DATE = Target.the("input para solo fechas").located(By.id("datePickerMonthYearInput"));
    public static final Target INPUT_DATE_TIME = Target.the("input para fecha y hora").located(By.id("dateAndTimePickerInput"));

}
