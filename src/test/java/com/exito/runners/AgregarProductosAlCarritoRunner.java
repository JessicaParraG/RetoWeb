package com.exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregarProductosAlCarrito.feature",
        glue = "com.exito.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AgregarProductosAlCarritoRunner {
}
