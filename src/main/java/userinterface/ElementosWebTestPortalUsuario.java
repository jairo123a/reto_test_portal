package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebTestPortalUsuario {
    public static final Target registro=Target.the("click en registrar").located(By.xpath("//a[@class='btn btn-yellow mdc-button mdc-card__action mdc-card__action--button']"));
    public static final Target busines=Target.the("click en busines").located(By.xpath("//body[contains(@class,'login-page')]/div[@class='login-card-container mdc-typography']/div[@class='login-card']/div[@class='choose-account-container']/div[1]"));
    public static final Target estudiante=Target.the("click en estudiante").located(By.xpath("//div[@class='login-card']//div[2]"));
    public static final Target email=Target.the("ingreso email").located(By.id("email"));
    public static final Target passwrod=Target.the("ingreso passwrod").located(By.id("plainPassword"));
    public static final Target nombre=Target.the("ingreso nombre").located(By.id("firstName"));
    public static final Target apellido=Target.the("ingreso apellido").located(By.id("lastName"));
    public static final Target escuela=Target.the("ingreso escuela").located(By.id("companyName"));
    public static final Target pais=Target.the("ingreso pais").located(By.id("RegisterEdu_country"));
    public static final Target zona=Target.the("ingreso zona").located(By.id("RegisterEdu_timezoneId"));
    public static final Target telefono=Target.the("ingreso telefono").located(By.id("phone"));
    public static final Target check=Target.the("click en check").located(By.id("termsApproval"));
    public static final Target guardar=Target.the("click en registrar").located(By.xpath("//button[@class='mdc-button mdc-button--raised']"));
    public static final Target verificar=Target.the("verificar pregunta").located(By.xpath("//div[contains(text(),'Welcome to the tests manager. Create new tests. Ma')]"));
}
