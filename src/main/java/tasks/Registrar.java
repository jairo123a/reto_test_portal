package tasks;

import model.TestPortalDataDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import userinterface.ElementosWebTestPortalUsuario;
import util.Constantes;
import java.util.List;

public class Registrar implements Task {


    List<TestPortalDataDrive> losdatos;
    public Registrar(List losdatos){
        this.losdatos=losdatos;
    }

   public static Registrar unUsuarioCon(List<TestPortalDataDrive> losdatos){
       return new Registrar(losdatos);
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebTestPortalUsuario.registro),
                Check.whether(losdatos.get(Constantes.posicion).getTipo().equals("Education"))
                        .andIfSo(Click.on(ElementosWebTestPortalUsuario.estudiante))
                        .otherwise(Click.on(ElementosWebTestPortalUsuario.busines)),
                Enter.theValue(losdatos.get(Constantes.posicion).getEmail()).into(ElementosWebTestPortalUsuario.email),
                Enter.theValue(losdatos.get(Constantes.posicion).getPassword()).into(ElementosWebTestPortalUsuario.passwrod),
                Enter.theValue(losdatos.get(Constantes.posicion).getNombre()).into(ElementosWebTestPortalUsuario.nombre),
                Enter.theValue(losdatos.get(Constantes.posicion).getApellido()).into(ElementosWebTestPortalUsuario.apellido),
                Enter.theValue(losdatos.get(Constantes.posicion).escuela).into(ElementosWebTestPortalUsuario.escuela),
                SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getPais()).from(ElementosWebTestPortalUsuario.pais),
                SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getZona()).from(ElementosWebTestPortalUsuario.zona),
                Enter.theValue(losdatos.get(Constantes.posicion).getTelefono()).into(ElementosWebTestPortalUsuario.telefono),
                Click.on(ElementosWebTestPortalUsuario.check),
                Click.on(ElementosWebTestPortalUsuario.guardar)
        );
    }
}
