package com.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
public class PaginaPrincipalUI extends PageObject {

    public static final Target BTN_INICIO = Target.the("Desplegar categorias").located(By.xpath("//span[@class='flex items-center nr2']"));
    public static final Target BTN_CATEGORIA = Target.the("Categoria").located(By.xpath("(//*[@id='undefined-nivel2-Celulares y accesorios'])[1]"));
    public static final Target BTN_SUBCATEGORIA = Target.the("Subcategoria").located(By.xpath("//a[@id='Categorías-nivel3-Iphone']"));

}
