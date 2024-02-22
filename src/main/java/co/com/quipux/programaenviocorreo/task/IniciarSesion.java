package co.com.quipux.programaenviocorreo.task;

import co.com.quipux.programaenviocorreo.interaction.CambioPestanaDerecha;
import co.com.quipux.programaenviocorreo.userinterface.InicioDeSesion;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.devco.automation.mobile.actions.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitFor.seconds(5),
                //WaitUntil.the(InicioDeSesion.USERNAME, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(InicioDeSesion.INICAR_SESION),
                CambioPestanaDerecha.cambioPestanaDerecha(),
                SendKeys.of("thebigbossdavid@hotmail.com").into(InicioDeSesion.USERNAME),
                WaitUntil.the(InicioDeSesion.SIGUIENTE, isClickable()).forNoMoreThan(8).seconds(),
                Click.on(InicioDeSesion.SIGUIENTE),
                WaitFor.seconds(5),
                Enter.theValue("dudamed97*").into(InicioDeSesion.PASSWORD),
                WaitUntil.the(InicioDeSesion.SIGUIENTE_PASS, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(InicioDeSesion.SIGUIENTE_PASS),
                Click.on(InicioDeSesion.MANTENER_SESION_NO),
                WaitFor.seconds(7)
        );



    }
    public static IniciarSesion iniciarSesion() {
        return instrumented(IniciarSesion.class);
    }
}
