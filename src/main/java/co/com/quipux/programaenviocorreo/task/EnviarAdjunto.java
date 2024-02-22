package co.com.quipux.programaenviocorreo.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.quipux.programaenviocorreo.userinterface.InicioDeSesion.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnviarAdjunto implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    WaitUntil.the(CORREO_NUEVO, isClickable()).forNoMoreThan(8).seconds(),
                    Click.on(CORREO_NUEVO),
                    Enter.theValue("pruebautomatizacionquipux@gmail.com").into(DESTINATARIO),
                    WaitUntil.the(SELEC_DISTRAE, isClickable()).forNoMoreThan(8).seconds(),
                    Click.on(SELEC_DISTRAE),
                    WaitFor.seconds(5),
                    WaitUntil.the(ASUNTO, isEnabled()).forNoMoreThan(8).seconds(),
                    Click.on(ASUNTO),
                    Enter.theValue("Robot enviando correo").into(ASUNTO),
                    //WaitFor.seconds(5),
                    WaitUntil.the(ESPACIO_EDIT, isEnabled()).forNoMoreThan(8).seconds(),
                    JavaScriptClick.on(ESPACIO_EDIT),
                    Enter.theValue("Hola equipo, Se enviará un adjunto mediante link https://drive.google.com/file/d/1OWCjpQ1j-2j11gG0D6eaHQseawCev6vQ/view?usp=sharing").into(ESPACIO_EDIT),
                    WaitUntil.the(ADJUNTAR, isEnabled()).forNoMoreThan(8).seconds(),
                    JavaScriptClick.on(ADJUNTAR),
                    WaitFor.seconds(7),
                    WaitUntil.the(EXAM_ONE_DRIVE, isClickable()).forNoMoreThan(5).seconds(),
                    JavaScriptClick.on(EXAM_ONE_DRIVE),
                    WaitFor.seconds(8),
                    JavaScriptClick.on(SELECT_DOC),
                    WaitFor.seconds(6),
                    Click.on(SELECT_DOC_COMPARTIR),

                    WaitFor.seconds(5),
                    JavaScriptClick.on(ABRIR_ENVIAR_CORREO),
                    WaitUntil.the(ENVIAR_CORREO, isClickable()).forNoMoreThan(6).seconds(),
                    JavaScriptClick.on(ENVIAR_CORREO),
                    WaitFor.seconds(7)
            );

        }



    public static EnviarAdjunto enviarAdjunto() {
        return instrumented(EnviarAdjunto.class);
    }
}
