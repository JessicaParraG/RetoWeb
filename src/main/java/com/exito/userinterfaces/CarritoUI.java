package com.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target TXT_EMAIL = Target.the("Email").located(By.xpath("//input[@name='email']"));
    public static final Target BTN_CONFIRMAR = Target.the("Confirmar").located(By.xpath("//button[@class='exito-checkout-io-0-x-preLoginActiveButton']"));
    public static final Target BTN_MAS = Target.the("Boton aumentar cantidad").located(By.xpath("//div[@data-molecule-product-detail-quantity]//button/following-sibling::button"));
    public static final Target LBL_CANTIDAD = Target.the("Cantidad de productos").located(By.xpath("//*[@class='exito-checkout-io-0-x-iconCloseActive ']"));
    public static final Target LBL_TOTAL = Target.the("Total a pagar").located(By.xpath("//span[@class='exito-checkout-io-0-x-paymentButtonTextBold']"));
}
