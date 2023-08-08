package StepDefinitions;

import Question.ValidoLogin;
import Task.LoginNetflix.Logearse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {
    @Given("navego a plataforma netflix")
    public void navegoAPlataformaNetflix() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.netflix.com/co/"));
    }
    @When("ingreso las credenciales {string}, {string}")
    public void ingresoLasCredenciales(String usuario, String password) {
    OnStage.theActorInTheSpotlight().attemptsTo(Logearse.LoginNetfliz(usuario,password));
    }
    @Then("valido login exitoso e imprimo titulo")
    public void validoLoginExitosoEImprimoTitulo() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidoLogin.titulo()));

    }
}
