package Ui.LogearseNeftlixUi;

import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class PantallaInicio {

    public static  final Target BTN_INICIO_SESION = Target.the("btn inicio sesion").locatedBy("//a[contains(text(),'Iniciar sesión')]").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static  final Target INPUT_USUARIO = Target.the("input usuario").locatedBy("//input[@id='id_userLoginId']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static  final Target INPUT_PASSWORD = Target.the("input password").locatedBy("//input[@id='id_password']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static  final Target BTN_INICIAR_SESION = Target.the("btn iniciar sesion").locatedBy("//button[contains(text(),'Iniciar sesión')]").waitingForNoMoreThan(Duration.ofSeconds(10));


}
