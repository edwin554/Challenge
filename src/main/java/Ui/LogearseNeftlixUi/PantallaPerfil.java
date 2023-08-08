package Ui.LogearseNeftlixUi;

import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class PantallaPerfil {

    public static  final Target TITULO = Target.the("titulo netflix").locatedBy("//span[@class='default-ltr-cache-1qwdmuy']").waitingForNoMoreThan(Duration.ofSeconds(10));
}
