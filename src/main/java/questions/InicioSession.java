package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.Login;

import java.util.Locale;

public class InicioSession implements Question<String> {

    private final String correo;

    public InicioSession(String correo) {
        this.correo = correo;
    }

    public static InicioSession validarInicioSession(String correo) {
        return new InicioSession(correo);
    }

    @Override
    public String answeredBy(Actor actor) {
        String userName;
        userName = Text.of(Login.LABEL_USER_NAME.of(correo.toLowerCase())).viewedBy(actor).asString();
        return userName;
    }

}
