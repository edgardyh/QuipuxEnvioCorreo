package co.com.quipux.pogramaenviocorreo.stepdefinitions;

import co.com.quipux.programaenviocorreo.task.EnviarAdjunto;
import co.com.quipux.programaenviocorreo.task.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EnvioCorreo {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("YoRobot");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("Inicia sesion y accede al correo")
    public void iniciaSesionYAccedeAlCorreo() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://hotmail.com"));
        theActorInTheSpotlight().attemptsTo(IniciarSesion.iniciarSesion());
    }

    @When("redacta agrega destinatario asunto descripcion documento adjunto y envie el correo")
    public void redactaAgregaDestinatarioAsuntoDescripcionDocumentoAdjuntoYEnvieElCorreo() {
        theActorInTheSpotlight().attemptsTo(EnviarAdjunto.enviarAdjunto());

    }

    @Then("valide en enviados el correo enviado")
    public void valideEnEnviadosElCorreoEnviado() {
    }



}
