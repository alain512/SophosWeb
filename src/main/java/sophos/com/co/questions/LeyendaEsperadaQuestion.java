package sophos.com.co.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LeyendaEsperadaQuestion implements Question<Boolean> {

    public String leyendaEsperada;

    public LeyendaEsperadaQuestion(String leyendaEsperada) {
        this.leyendaEsperada = leyendaEsperada;
    }

    public static LeyendaEsperadaQuestion leyenda(String leyendaEsperada){
        return new LeyendaEsperadaQuestion(leyendaEsperada);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Ensure.that(Serenity.getDriver().switchTo().alert().getText()).isEqualTo(leyendaEsperada));
        return true;
    }
}
