package com.exito.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Random;

import static com.exito.userinterfaces.CarritoUI.BTN_MAS;

public class SeleccionarCantidad implements Interaction {

    Random random = new Random();

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> cantidad = BTN_MAS.resolveAllFor(actor);

        for (int i = 0; i < cantidad.size(); i++){
            int numeroRandom = random.nextInt(4)+1;
            for (int j = 0; j < numeroRandom; j++){
                cantidad.get(i).click();
                EsperaExplicita.esperar(5);
                actor.remember("cantidad", numeroRandom);
            }
        }
    }

    public static SeleccionarCantidad aleatoriamente() {
        return Instrumented.instanceOf(SeleccionarCantidad.class).withProperties();
    }
}
