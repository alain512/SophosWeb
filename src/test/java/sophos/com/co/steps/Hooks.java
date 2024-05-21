package sophos.com.co.steps;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sophos.com.co.models.Cliente;

import java.util.Map;

public class Hooks {
    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        Actor yeison = OnStage.theActorCalled("Yeison");
        yeison.can(BrowseTheWeb.with(driver));
    }

    @DataTableType
    public Cliente clienteEntry(Map<String, String> entry) {
        return new Cliente(
                entry.get("firstName"),
                entry.get("lastName"),
                entry.get("email"),
                entry.get("age"),
                entry.get("salary"),
                entry.get("department"));
    }
}
