package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {

    public static  final Target btnLogIn = Target.the("boton de inicio de sesion").locatedBy("(//a[contains(text(),'Log In')])[1]");
}
