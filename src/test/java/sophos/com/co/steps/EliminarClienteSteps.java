package sophos.com.co.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import sophos.com.co.questions.ClienteEliminadoQuestion;
import sophos.com.co.tasks.DirigirteATask;
import sophos.com.co.tasks.EliminarClientesTask;

public class EliminarClienteSteps {

    String email;

    @When("elimino al cliente asociado al email {string} en la tabla")
    public void eliminoAlClienteAsociadoAlEmailEnLaTabla(String email) {
        this.email = email;
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Elements", "Web Tables"), EliminarClientesTask.eliminar(email));
    }

    @Then("el cliente es eliminado de la tabla")
    public void elClienteEsEliminadoDeLaTabla() {
        OnStage.theActorInTheSpotlight().asksFor(ClienteEliminadoQuestion.eliminado(email));
    }
}
