package co.com.quipux.pogramaenviocorreo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/features/envio_correo.feature",
        glue = "co/com/quipux/pogramaenviocorreo/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "")

public class EnvioCorreoRunner {
}
