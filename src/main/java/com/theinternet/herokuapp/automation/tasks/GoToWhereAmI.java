package com.theinternet.herokuapp.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.theinternet.herokuapp.automation.userinterface.GeolocationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToWhereAmI implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Button_WhereAmI)
        );
    }
    public static GoToWhereAmI WhereAmI(){
        return instrumented(GoToWhereAmI.class);
    }
}
