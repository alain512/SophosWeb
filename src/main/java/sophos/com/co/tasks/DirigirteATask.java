package sophos.com.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import sophos.com.co.ui.MainPageUI;
import sophos.com.co.ui.MenuListUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DirigirteATask implements Task {

    String category;
    String listMenuElement;

    public DirigirteATask(String category, String listMenuElement) {
        this.category = category;
        this.listMenuElement = listMenuElement;
    }

    public static DirigirteATask ir(String category, String listMenuElement){
        return instrumented(DirigirteATask.class, category, listMenuElement);
    }

    @Override
    @Step("Navega hacia la pagina de interaccion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPageUI.CATEGORY.of(category)),
                WaitUntil.the(MenuListUI.BTN_MENU.of(listMenuElement), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MenuListUI.BTN_MENU.of(listMenuElement))
        );
    }
}
