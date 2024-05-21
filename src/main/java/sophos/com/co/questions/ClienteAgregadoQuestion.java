package sophos.com.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import sophos.com.co.models.Cliente;
import sophos.com.co.ui.WebTablesUI;

public class ClienteAgregadoQuestion implements Question<Boolean> {

    Cliente cliente;

    public ClienteAgregadoQuestion(Cliente cliente) {
        this.cliente = cliente;
    }

    public static ClienteAgregadoQuestion agregado(Cliente cliente){
        return new ClienteAgregadoQuestion(cliente);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String ultimaFila = String.valueOf(actor.asksFor(CantidadClientesQuestion.cuantosClientesHay()));
        Cliente clienteObtenido =
                new Cliente(WebTablesUI.CAMPO_DE_TABLA.of(ultimaFila,"1").resolveFor(actor).getText(), WebTablesUI.CAMPO_DE_TABLA.of(ultimaFila,"2").resolveFor(actor).getText(),
                WebTablesUI.CAMPO_DE_TABLA.of(ultimaFila,"4").resolveFor(actor).getText(), WebTablesUI.CAMPO_DE_TABLA.of(ultimaFila,"3").resolveFor(actor).getText(),
                WebTablesUI.CAMPO_DE_TABLA.of(ultimaFila,"5").resolveFor(actor).getText(), WebTablesUI.CAMPO_DE_TABLA.of(ultimaFila,"6").resolveFor(actor).getText());

        actor.attemptsTo(
            Ensure.that(cliente.firstName).isEqualTo(clienteObtenido.firstName),
            Ensure.that(cliente.lastName).isEqualTo(clienteObtenido.lastName),
            Ensure.that(cliente.email).isEqualTo(clienteObtenido.email),
            Ensure.that(cliente.age).isEqualTo(clienteObtenido.age),
            Ensure.that(cliente.salary).isEqualTo(clienteObtenido.salary),
            Ensure.that(cliente.departrment).isEqualTo(clienteObtenido.departrment)
        );
        return true;
    }
}
