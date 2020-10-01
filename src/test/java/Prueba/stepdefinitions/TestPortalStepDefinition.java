package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TestPortalDataDrive;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PreguntaUsuario;
import tasks.Abrir;
import tasks.Registrar;

import java.util.List;

public class TestPortalStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ingresar al sitio web$")
    public void ingresarAlSitioWeb() {
        OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }

    @When("^diligenciar los datos y registrar un usuario$")
    public void diligenciarLosDatosYRegistrarUnUsuario(List<TestPortalDataDrive> losdatos) {
      OnStage.theActorInTheSpotlight().attemptsTo(Registrar.unUsuarioCon(losdatos));
    }

    @Then("^Verificar el registro exitoso  \"([^\"]*)\"$")
    public void verificarElRegistroExitoso(String lapregunta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaUsuario.seRegistro(lapregunta)));
    }
}
