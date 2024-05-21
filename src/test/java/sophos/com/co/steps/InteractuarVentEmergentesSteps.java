package sophos.com.co.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import sophos.com.co.questions.LeyendaEsperadaQuestion;
import sophos.com.co.questions.MensajeRespuestaQuestion;
import sophos.com.co.tasks.AperturarVentanaEmergenteTask;
import sophos.com.co.tasks.DirigirteATask;

public class InteractuarVentEmergentesSteps {

    @When("aperturo una ventana emergente")
    public void aperturoUnaVentanaEmergente() {
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Alerts, Frame & Windows", "Alerts"),
                AperturarVentanaEmergenteTask.aperturarVentana());
    }
    @When("aperturo una ventana emergente que tiene retraso de cinco segundos")
    public void aperturoUnaVentanaEmergenteQueTieneRetrasoDeCincoSegundos() {
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Alerts, Frame & Windows", "Alerts"),
                AperturarVentanaEmergenteTask.aperturarVentanaConRetraso());
    }
    @When("aperturo una ventana emergente de confirmacion")
    public void aperturo_una_ventana_emergente_de_confirmacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Alerts, Frame & Windows", "Alerts"),
                AperturarVentanaEmergenteTask.aperturarVentanaConConfirmacion());
    }
    @When("aperturo una ventana emergente con prompt")
    public void aperturo_una_ventana_emergente_con_prompt() {
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Alerts, Frame & Windows", "Alerts"),
                AperturarVentanaEmergenteTask.aperturarVentanaConPrompt());
    }
    @Then("aparece una ventana emergente con la leyenda {string}")
    public void apareceUnaVentanaEmergenteConLaLeyenda(String leyenda) {
        OnStage.theActorInTheSpotlight().asksFor(LeyendaEsperadaQuestion.leyenda(leyenda));
    }
    @Then("acepto la alerta")
    public void aceptoLaAlerta() {
        Serenity.getDriver().switchTo().alert().accept();
    }
    @Then("registro mi nombre {string} en el prompt de la alert")
    public void registroMiNombreYAceptoLaLeyenda(String name) {
        Serenity.getDriver().switchTo().alert().sendKeys(name);
    }
    @Then("se muestra {string}")
    public void seMuestra(String mensaje) {
        OnStage.theActorInTheSpotlight().asksFor(MensajeRespuestaQuestion.verify(mensaje));
    }
}
