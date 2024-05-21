package sophos.com.co.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;
import sophos.com.co.ui.AlertsUI;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Browser.*;

public class AperturarVentanaEmergenteTask implements Task {

    public String alertSeleccionada;

    public AperturarVentanaEmergenteTask(String alertSeleccionada) {
        this.alertSeleccionada = alertSeleccionada;
    }

    public AperturarVentanaEmergenteTask() {
    }

    public static AperturarVentanaEmergenteTask aperturarVentana(){
        return instrumented(AperturarVentanaEmergenteTask.class, "normalAlert");
    }

    public static AperturarVentanaEmergenteTask aperturarVentanaConPrompt(){
        return instrumented(AperturarVentanaEmergenteTask.class, "promptAlert");
    }

    public static AperturarVentanaEmergenteTask aperturarVentanaConRetraso(){
        return instrumented(AperturarVentanaEmergenteTask.class, "timerAlert");
    }

    public static AperturarVentanaEmergenteTask aperturarVentanaConConfirmacion(){
        return instrumented(AperturarVentanaEmergenteTask.class, "confirmationAlert");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (alertSeleccionada){
            case "normalAlert" :
                actor.attemptsTo(
                        Click.on(AlertsUI.BTN_NORMAL_ALERT)
                );
                Serenity.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case "timerAlert" :
                actor.attemptsTo(
                        Click.on(AlertsUI.BTN_TIMER_ALERT)
                );
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "confirmationAlert" :
                actor.attemptsTo(
                        Click.on(AlertsUI.BTN_CONFIRM_ALERT)
                );
                Serenity.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case "promptAlert" :
                actor.attemptsTo(
                        Click.on(AlertsUI.BTN_PROMPT)
                );
                Serenity.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
        }
    }
}
