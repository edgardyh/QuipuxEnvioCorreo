package co.com.quipux.programaenviocorreo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioDeSesion {

    public static final Target INICAR_SESION = Target.the("btn_iniciar")
            .locatedBy("(//*[@data-bi-cn='SignIn'])[1]");
    public static final Target USERNAME = Target.the("username")
            .locatedBy("//input[@type='email']");

    public static final Target SIGUIENTE = Target.the("siguiente")
            .locatedBy("(//input[@type='submit'])[1]");
    public static final Target PASSWORD = Target.the("password")
            .locatedBy("//input[@type=\"password\"]");
    public static final Target SIGUIENTE_PASS = Target.the("siguiente")
            .locatedBy("//input[@value='Iniciar sesión']");
    public static final Target MANTENER_SESION_NO = Target.the("no_sesion")
            .locatedBy("(//button[@type='submit'])[1]");


    public static final Target CORREO_NUEVO = Target.the("redactar")
            .locatedBy("//*[@id=\"innerRibbonContainer\"]/div[1]/div/div/div/div[1]/div/div/span/button[1]");
    public static final Target DESTINATARIO = Target.the("destinatario")
            .locatedBy("//*[@id=\"docking_InitVisiblePart_0\"]/div/div[3]/div[1]/div/div[3]/div/div/div[1]");
    public static final Target SELEC_DISTRAE = Target.the("selecc_distrae")
            .locatedBy("//*[@id=\"Ir a la lista de mensajes-region\"]/div[1]/div[1]/div/div[2]/div/div/button/span/i/span/i");

    public static final Target ASUNTO = Target.the("asunto")
            .locatedBy("//*[@id=\"TextField251\"]");
    public static final Target ESPACIO_EDIT = Target.the("espacio editable")
            .locatedBy("//div[@tabindex=0 and @role='textbox']");

    public static final Target ADJUNTAR = Target.the("adjuntar")
            .locatedBy("//button[@aria-label='Adjuntar archivo']");

    public static final Target EXAM_ONE_DRIVE = Target.the("examinar")
            .locatedBy("//span[text()='OneDrive']");
    public static final Target SELECT_DOC = Target.the("examinar")
            .locatedBy("//div[@data-selection-index='0']");
    public static final Target SELECT_DOC_COMPARTIR = Target.the("examinar")
            .locatedBy("//*[text()='Compartir vínculo']");



    public static final Target ABRIR_ENVIAR_CORREO = Target.the("enviar")
            .locatedBy("//*[@id=\"docking_InitVisiblePart_0\"]/div/div[2]/div[1]/div/span/button[2]/span/i");

    public static final Target ENVIAR_CORREO = Target.the("enviar")
            .locatedBy("//*[@id=\"id__233-menu\"]/div/ul/li[1]/button/div/span");
    //(//span[@data-automationid='splitbuttonprimary'])[21]
    public static final Target CONIR_ENVIAR = Target.the("enviados")
            .locatedBy("*[@id=\"id__1420\"]");
//////span[text()='Elementos enviados']


}
