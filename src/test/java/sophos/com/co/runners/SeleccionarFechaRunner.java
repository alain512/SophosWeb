package sophos.com.co.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "sophos.com.co.steps",
        features = "src/test/resources/features/SeleccionarFecha.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class SeleccionarFechaRunner {
}
