package sophos.com.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import sophos.com.co.ui.WebTablesUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClienteEliminadoQuestion implements Question<Boolean> {

    String email;

    public ClienteEliminadoQuestion(String email) {
        this.email = email;
    }
    @Step("Se verifica que haya sido eliminado el cliente")
    public static ClienteEliminadoQuestion eliminado(String email){
        return new ClienteEliminadoQuestion(email);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThat(the(WebTablesUI.EMAIL_LABEL.of(email)), isNotPresent()));
        return true;
    }
}
