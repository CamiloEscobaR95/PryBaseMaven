package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {

    public static final Target INPUT_USER_NAME = Target.the("input para ingresar el user name").locatedBy("//input[@id='username']");
    public static final Target INPUT_PASSWORD = Target.the("input para contraseña").locatedBy("//input[@id='password']");
    public static final Target BTN_SIG_IN = Target.the("boton de sig in").locatedBy("//button[@id='kc-login']");
    public static final Target LABEL_USER_NAME = Target.the("nombre de usuario despues de login").locatedBy("//span[contains(text(),'{0}')]");
}
