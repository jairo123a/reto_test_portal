package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebTestPortalUsuario;

public class PreguntaUsuario implements Question<Boolean> {

    String lapregunta;
    public PreguntaUsuario(String lapregunta){
        this.lapregunta=lapregunta;
    }

   public static PreguntaUsuario seRegistro(String lapregunta){
       return new PreguntaUsuario(lapregunta);
   }

    @Override
    public Boolean answeredBy(Actor actor) {
        String larespuesta;
        larespuesta= Text.of(ElementosWebTestPortalUsuario.verificar).viewedBy(actor).asString();
        if(larespuesta.equals(lapregunta)){
            return true;
        }else{
            return false;
        }
    }
}
