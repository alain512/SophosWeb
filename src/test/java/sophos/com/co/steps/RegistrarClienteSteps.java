package sophos.com.co.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import sophos.com.co.models.Cliente;
import sophos.com.co.questions.ClienteAgregadoQuestion;
import sophos.com.co.tasks.AgregarClienteTask;
import sophos.com.co.tasks.DirigirteATask;

public class RegistrarClienteSteps {

    private Cliente cliente;

    @Given("^que me encuentro en \"([^\"]*)\"$")
    public void queMeEncuentroEnHttpsDemoqaCom(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));

    }

    @When("^registro al cliente en la tabla$")
    public void registroAlClienteEnLaTabla(Cliente cliente) {
        this.cliente = cliente;
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Elements", "Web Tables"), AgregarClienteTask.agregar(cliente));
    }

    @Then("^el cliente es registrado en la tabla$")
    public void elClienteEsRegistradoEnLaTabla() {
        OnStage.theActorInTheSpotlight().asksFor(ClienteAgregadoQuestion.agregado(cliente));
    }
}
