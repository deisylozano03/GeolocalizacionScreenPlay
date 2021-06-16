package com.theinternet.herokuapp.automation.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://the-internet.herokuapp.com/")

public class HomePage extends PageObject{

    public static final Target Button_Geolocation = Target.the("Geolocation button").located(By.xpath("//*[@id=\"content\"]/ul[1]/li[23]/a[1]"));

}
