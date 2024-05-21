package sophos.com.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sophos.com.co.ui.DataPickerUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarFechaTask implements Task {

    public String fecha;
    public Boolean soloFecha;

    public SeleccionarFechaTask(String fecha, Boolean soloFecha) {
        this.fecha = fecha;
        this.soloFecha = soloFecha;
    }

    public static SeleccionarFechaTask seleeciona(String fecha, Boolean soloFecha){
        return instrumented(SeleccionarFechaTask.class, fecha, soloFecha);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(soloFecha){
            actor.attemptsTo(WaitUntil.the(DataPickerUI.INPUT_DATE, isVisible()),
                    Clear.field(DataPickerUI.INPUT_DATE),
                    Type.theValue(fecha).into(DataPickerUI.INPUT_DATE));
        }else {
            actor.attemptsTo(WaitUntil.the(DataPickerUI.INPUT_DATE_TIME, isVisible()),
                    Clear.field(DataPickerUI.INPUT_DATE_TIME),
                    Type.theValue(fecha).into(DataPickerUI.INPUT_DATE_TIME));
        }

    }
}
