package sophos.com.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import sophos.com.co.ui.MainPageUI;
import sophos.com.co.ui.MenuListUI;
import sophos.com.co.ui.WebTablesUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarClientesTask implements Task {
    String email;

    public EliminarClientesTask(String email) {
        this.email = email;

    }

    public static EliminarClientesTask eliminar(String email){
        return instrumented(EliminarClientesTask.class, email);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebTablesUI.ICON_DELETE.of(email))
        );
    }
}
