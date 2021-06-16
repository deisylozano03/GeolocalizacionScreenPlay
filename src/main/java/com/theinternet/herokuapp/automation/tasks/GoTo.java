package com.theinternet.herokuapp.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.theinternet.herokuapp.automation.userinterface.HomePage.*;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Button_Geolocation)
        );
    }
    public static GoTo theGeolocation(){
        return instrumented(GoTo.class);
    }
}
