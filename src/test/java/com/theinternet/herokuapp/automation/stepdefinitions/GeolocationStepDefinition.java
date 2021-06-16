package com.theinternet.herokuapp.automation.stepdefinitions;

import com.theinternet.herokuapp.automation.questions.Check;
import com.theinternet.herokuapp.automation.tasks.GoTo;
import com.theinternet.herokuapp.automation.tasks.GoToWhereAmI;
import com.theinternet.herokuapp.automation.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GeolocationStepDefinition {
    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor deisy =Actor.named("Deisy");

    @Before
    public void setUp(){
        deisy.can(BrowseTheWeb.with(hisBrowser));
        deisy.wasAbleTo(Open.browserOn(new HomePage()));
        hisBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("^that deisy enters the geolocation option$")
    public void thatDeisyEntersTheGeolocationOption(){
        deisy.attemptsTo(GoTo.theGeolocation());

    }

    @When("^she clicked on the Where am I button$")
    public void sheClickedOnTheWhereAmIButton(){
        deisy.attemptsTo(GoToWhereAmI.WhereAmI());

    }

    @Then("^she should see the latitude and longitude value$")
    public void sheShouldSeeTheLatitudeAndLongitudeValue(){
        System.out.println(Check.coordinatesLatitude().answeredBy(deisy));
        System.out.println(Check.coordinatesLongitude().answeredBy(deisy));
        //deisy.should(
                //seeThat("you are in Pamplona Latitude, north of santander", Check.coordinatesLatitude(),equalTo("7.3820314")),
                //seeThat("you are in Pamplona Longuitude, north of santander", Check.coordinatesLongitude(),equalTo("-72.6456212")));

    }
}

