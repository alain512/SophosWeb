package sophos.com.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sophos.com.co.ui.DataPickerUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class FechaMostradaQuestion implements Question<Boolean> {

    public String fecha;
    public Boolean soloFecha;

    public FechaMostradaQuestion(String fecha, Boolean soloFecha) {
        this.fecha = fecha;
        this.soloFecha = soloFecha;
    }

    public static FechaMostradaQuestion  correcta(String fecha, Boolean soloFecha){
        return new FechaMostradaQuestion(fecha, soloFecha);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        if (soloFecha){
            actor.should(seeThat(the(DataPickerUI.INPUT_DATE), hasValue(fecha)));
        } else {
            actor.should(seeThat(the(DataPickerUI.INPUT_DATE_TIME), hasValue(fecha)));
        }

        return true;
    }
}
