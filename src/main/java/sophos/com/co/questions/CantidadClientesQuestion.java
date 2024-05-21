package sophos.com.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sophos.com.co.ui.WebTablesUI;

public class CantidadClientesQuestion implements Question<Integer> {

    public static CantidadClientesQuestion cuantosClientesHay(){
        return new CantidadClientesQuestion();
    }
    @Override
    public Integer answeredBy(Actor actor) {
        return WebTablesUI.CANTIDAD_FILAS.resolveAllFor(actor).size();
    }
}
