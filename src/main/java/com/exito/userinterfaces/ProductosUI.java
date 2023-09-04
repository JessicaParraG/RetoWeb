package com.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {

    public static final Target BTN_PRODUCTO = Target.the("Productos").located(By.xpath("//span[@class='exito-vtex-components-4-x-buttonText']"));
    public static final Target LBL_NOMBRE_PRODUCTO = Target.the("Nombre producto").located(By.xpath("//span[@class='vtex-store-components-3-x-productBrand ']"));
    public static final Target LBL_PRECIO_PRODUCTO = Target.the("Precio producto").located(By.xpath("//span[@class='exito-vtex-components-4-x-currencyContainer']"));
    public static final Target BTN_CARRITO = Target.the("Carrito").located(By.xpath("//a[@class='exito-header-3-x-minicartLink']"));
    public static final Target LBL_CANTIDAD_PRODUCTOS = Target.the("Cantidad productos").located(By.xpath("//div[@class='exito-header-3-x-minicartQuantity']"));

}
