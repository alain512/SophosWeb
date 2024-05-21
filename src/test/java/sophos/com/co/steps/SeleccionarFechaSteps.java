package sophos.com.co.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import sophos.com.co.questions.FechaMostradaQuestion;
import sophos.com.co.tasks.DirigirteATask;
import sophos.com.co.tasks.SeleccionarFechaTask;

public class SeleccionarFechaSteps {

    public Boolean soloFecha;
    public String fecha;

    @When("selecciono la fecha {string}")
    public void seleccionoLaFecha(String fecha) {
        String fcha = fecha.substring(0,2);
        soloFecha = fcha.matches("[0-9][0-9]");
        this.fecha = fecha;
        OnStage.theActorInTheSpotlight().attemptsTo(DirigirteATask.ir("Widgets", "Date Picker"), SeleccionarFechaTask.seleeciona(fecha, soloFecha));
    }

    @Then("la fecha es mostrada")
    public void laFechaEsMostrada() {
        OnStage.theActorInTheSpotlight().asksFor(FechaMostradaQuestion.correcta(fecha, soloFecha));
    }
}
