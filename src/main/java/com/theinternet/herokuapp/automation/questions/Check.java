package com.theinternet.herokuapp.automation.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import static com.theinternet.herokuapp.automation.userinterface.GeolocationPage.Latitude_Text;
import static com.theinternet.herokuapp.automation.userinterface.GeolocationPage.Longitude_Text;
public class Check {
    public static Question<String> coordinatesLatitude(){
        return actor -> TextContent.of(Latitude_Text).viewedBy(actor).asString().trim();
}
public static Question<String> coordinatesLongitude(){
        return actor -> TextContent.of(Longitude_Text).viewedBy(actor).asString().trim();
}
}
