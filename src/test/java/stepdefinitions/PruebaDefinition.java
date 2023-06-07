package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import questions.InicioSession;
import tasks.LoginTask;
import userinterfaces.HomePage;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaDefinition {

    HomePage homePage = new HomePage();

    @Given("^el usuario ingresa a home page$")
    public void elUsuarioIngresaAHomePage() {
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn(homePage)
        );
    }


    @When("^el usuario hace login(.*) (.*)")
    public void elUsuarioHaceLogin(String user, String password) {
        theActorInTheSpotlight().wasAbleTo(
                LoginTask.login(user, password)
        );
    }

    @Then("^el usuario podra ver su username (.*)$")
    public void elUsuarioPodraVerSuUsername(String correo) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(InicioSession.validarInicioSession(correo), equalTo(correo))
        );
    }
}
