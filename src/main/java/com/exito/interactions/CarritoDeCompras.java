package com.exito.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

import static com.exito.tasks.AgregarProductos.cantidadDeProductos;
import static com.exito.userinterfaces.CarritoUI.LBL_CANTIDAD;

public class CarritoDeCompras implements Interaction {

    int cantidadDeProductosTotal;

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> cantidadProductos = LBL_CANTIDAD.resolveAllFor(actor);

        for (int i = 0; i < 5; i++) {
            String nombreProducto = actor.recall("nombreProducto");
            Integer cantidad = actor.recall("cantidad");
            String precio = actor.recall("precioProducto");


            Target TXT_NOMBRE_PRODUCTO = Target.the("").located(By.xpath("//span[contains(text(),'" + nombreProducto + "')]"));
            Target TXT_CANTIDAD = Target.the("").located(By.xpath("//span[contains(text(),'" + cantidad + "')]"));

            Ensure.that(nombreProducto).contains(String.valueOf(TXT_NOMBRE_PRODUCTO));
            Ensure.that(cantidad).equals(TXT_CANTIDAD);
        }

        cantidadDeProductosTotal = cantidadProductos.size();
        Ensure.that(cantidadDeProductos).equals(cantidadDeProductosTotal);
    }

    public static CarritoDeCompras verProductos() {
        return Instrumented.instanceOf(CarritoDeCompras.class).withProperties();
    }
}
