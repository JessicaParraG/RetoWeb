package com.exito.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.Random;

import static com.exito.userinterfaces.ProductosUI.*;

public class SeleccionarProductos implements Interaction {

    public int numeroRandom;
    public String nombreProducto;
    public String precioProducto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        List<WebElementFacade> listaProductos = BTN_PRODUCTO.resolveAllFor(actor);
        List<WebElementFacade> nombresProductos = LBL_NOMBRE_PRODUCTO.resolveAllFor(actor);
        List<WebElementFacade> preciosProductos = LBL_PRECIO_PRODUCTO.resolveAllFor(actor);
        numeroRandom = random.nextInt(listaProductos.size());
        nombreProducto = nombresProductos.get(numeroRandom).getText();
        precioProducto = preciosProductos.get(numeroRandom).getText();
        listaProductos.get(numeroRandom).click();
        actor.remember("nombreProducto", nombreProducto);
        actor.remember("precioProducto", precioProducto);
        EsperaExplicita.esperar(5);
    }

    public static SeleccionarProductos aleatoriamente() {
        return Instrumented.instanceOf(SeleccionarProductos.class).withProperties();
    }
}
