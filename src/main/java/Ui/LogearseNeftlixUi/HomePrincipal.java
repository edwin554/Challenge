package Ui.LogearseNeftlixUi;

import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class HomePrincipal {
    public static  final Target BTN_PERFIL = Target.the("btn perfil").locatedBy("//span[contains(text(),'Maira Alejandra')]").waitingForNoMoreThan(Duration.ofSeconds(12));
    public static final Target TITULO = Target.the("titulo netflix").locatedBy("//a[@class='logo icon-logoUpdate active']").waitingForNoMoreThan(Duration.ofSeconds(12));
}
