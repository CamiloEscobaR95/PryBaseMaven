package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;
import static userinterfaces.Login.*;

public class LoginTask implements Task {

    private String user;
    private String password;

    public LoginTask(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnLogIn),
                Enter.theValue(user).into(INPUT_USER_NAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_SIG_IN)
        );
    }

    public static LoginTask login(String user, String password) {
        return instrumented(LoginTask.class, user, password);
    }
}
