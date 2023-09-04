package com.exito.stepsDefinitions;

import com.exito.interactions.CarritoDeCompras;
import com.exito.tasks.AgregarProductos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.exito.utils.Constantes.ACTOR;

public class AgregarProductosAlCarritoStepsDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingrese a la pagina del (.*)$")
    public void queElUsuarioIngresaALaPaginaDe(String url) {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(url));
    }

    @Cuando("^el agregue cinco productos al carrito$")
    public void elAgregueCincoProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito());
    }

    @Entonces("^validara sus productos en el carrito$")
    public void validaraSusProductosEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(CarritoDeCompras.verProductos());
    }
}
