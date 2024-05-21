package sophos.com.co.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertsUI {
    public static final Target BTN_NORMAL_ALERT = Target.the("Button para mostrar un alert normal").located(By.id("alertButton"));
    public static final Target BTN_TIMER_ALERT = Target.the("Button que espera 5 segundos").located(By.id("timerAlertButton"));
    public static final Target BTN_CONFIRM_ALERT = Target.the("Button que muestra la confirmacion").located(By.id("confirmButton"));
    public static final Target BTN_PROMPT = Target.the("Button click me que pide tu nombre").located(By.id("promtButton"));
    public static final Target RESULT = Target.the("confirmacion de resultado").located(By.id("confirmResult"));
    public static final Target RESULT_PROMPT = Target.the("confirmacion de resultado y nombre").located(By.id("promptResult"));

}
