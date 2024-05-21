package sophos.com.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import sophos.com.co.models.Cliente;
import sophos.com.co.ui.WebTablesUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarClienteTask implements Task {

    Cliente cliente;

    public AgregarClienteTask(Cliente cliente) {
        this.cliente = cliente;
    }

    public static AgregarClienteTask agregar(Cliente cliente){
        return instrumented(AgregarClienteTask.class, cliente);
    }

    @Override
    @Step("Agrega al cliente a la tabla")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(WebTablesUI.BTN_ADD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(WebTablesUI.BTN_ADD),
                WaitUntil.the(WebTablesUI.FIRST_NAME, isEnabled()).forNoMoreThan(10).seconds(),
                Type.theValue(cliente.firstName).into(WebTablesUI.FIRST_NAME),
                Type.theValue(cliente.lastName).into(WebTablesUI.LAST_NAME),
                Type.theValue(cliente.email).into(WebTablesUI.EMAIL),
                Type.theValue(cliente.age).into(WebTablesUI.AGE),
                Type.theValue(cliente.salary).into(WebTablesUI.SALARY),
                Type.theValue(cliente.departrment).into(WebTablesUI.DEPARTMENT),
                Click.on(WebTablesUI.BTN_SUBMIT)
                );
    }
}
