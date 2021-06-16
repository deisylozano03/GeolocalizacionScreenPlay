package com.theinternet.herokuapp.automation.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GeolocationPage extends PageObject {
    public static final Target Button_WhereAmI = Target.the("WhereAmI button").located(By.xpath("//*[@id=\"content\"]/div[1]/button[1]"));
    public static final Target Latitude_Text= Target.the("Latitude Value").located(By.xpath("//*[@id=\"lat-value\"]"));
    public static final Target Longitude_Text = Target.the("Longitude Value").located(By.xpath("//*[@id=\"long-value\"]"));
}
