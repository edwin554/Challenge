package Question;

import Ui.LogearseNeftlixUi.PantallaPerfil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidoLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(PantallaPerfil.TITULO).hasText("Netflix")
        );
        return true;
    }
    public static ValidoLogin titulo (){return new ValidoLogin();}


}
