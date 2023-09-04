package com.exito.tasks;

import com.exito.interactions.EsperaExplicita;
import com.exito.interactions.SeleccionarCantidad;
import com.exito.interactions.SeleccionarProductos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.userinterfaces.CarritoUI.*;
import static com.exito.userinterfaces.PaginaPrincipalUI.*;
import static com.exito.userinterfaces.ProductosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProductos implements Task {

    public static String cantidadDeProductos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIO),
                Click.on(BTN_CATEGORIA),
                Click.on(BTN_SUBCATEGORIA)
        );
        EsperaExplicita.esperar(5);

        for (int i = 0; i < 5; i++){
            actor.attemptsTo(
                    WaitUntil.the(BTN_PRODUCTO, isClickable()).forNoMoreThan(30).seconds(),
                    Scroll.to(BTN_PRODUCTO).andAlignToBottom(),
                    SeleccionarProductos.aleatoriamente()
            );
        }
        cantidadDeProductos = LBL_CANTIDAD_PRODUCTOS.resolveFor(actor).getText();

        actor.attemptsTo(
                Click.on(BTN_CARRITO),
                WaitUntil.the(TXT_EMAIL, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue("jpg@gmail.com").into(TXT_EMAIL),
                Click.on(BTN_CONFIRMAR),
                Scroll.to(BTN_MAS).andAlignToBottom(),
                SeleccionarCantidad.aleatoriamente()
        );
    }

    public static AgregarProductos alCarrito() {
        return Instrumented.instanceOf(AgregarProductos.class).withProperties();
    }

}
