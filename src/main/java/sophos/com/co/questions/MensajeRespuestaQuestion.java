package sophos.com.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import sophos.com.co.ui.AlertsUI;

public class MensajeRespuestaQuestion implements Question<Boolean> {

    public String mensajeEsperado;

    public MensajeRespuestaQuestion(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static MensajeRespuestaQuestion verify(String mensajeEsperado){
        return new MensajeRespuestaQuestion(mensajeEsperado);
    }
    @Override
    public Boolean answeredBy(Actor actor) {

        if (mensajeEsperado.equalsIgnoreCase("You selected Ok")){
            actor.attemptsTo(Ensure.that(AlertsUI.RESULT).text().isEqualTo(mensajeEsperado));
        }else {
            actor.attemptsTo(Ensure.that(AlertsUI.RESULT_PROMPT).text().isEqualTo(mensajeEsperado));
        }

        return true;
    }
}
