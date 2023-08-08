package Task.LoginNetflix;

import Ui.LogearseNeftlixUi.HomePrincipal;
import Ui.LogearseNeftlixUi.PantallaInicio;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Logearse {

    public static Performable LoginNetfliz(String usuario,  String contrasena){
        return Task.where(Actor -> {
            Actor.attemptsTo(Click.on(PantallaInicio.BTN_INICIO_SESION));
            Actor.attemptsTo(Enter.theValue(usuario).into(PantallaInicio.INPUT_USUARIO));
            Actor.attemptsTo(Enter.theValue(contrasena).into(PantallaInicio.INPUT_PASSWORD));
            Actor.attemptsTo(Click.on(PantallaInicio.BTN_INICIAR_SESION));
            Actor.attemptsTo(Click.on(HomePrincipal.BTN_PERFIL));
            Actor.attemptsTo(WaitUntil.the(HomePrincipal.TITULO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());


        });
    }

}
