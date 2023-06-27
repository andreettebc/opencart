package com.nttdata.glue;

import com.nttdata.tasks.AddProductPage;
import com.nttdata.tasks.OpenPage;
import com.nttdata.tasks.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {
    private static final String ACTOR_NAME = "USer";

    @Before
    public void setTheStag(){OnStage.setTheStage(new OnlineCast());}


    @Given("^(.*) estoy en la pagina opencart$")
    public void login(String actor){theActorCalled(actor).attemptsTo(OpenPage.loadpage());}

    @When("selecciono un producto del catalogo$")
    public void selectproduct() {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                AddProductPage.addProductsToCart());
    }

    @Then("agrego el producto al carrito$")
    public void addproduct() {
    }

    @And("veo el carrito$")
    public void viewcart() {
    }

    @When("^ingreso datos (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void form(String first_name,String last_name,String email, String phone, String company,String address1, String city, String post_code, String country, String region){
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(first_name,last_name,email,phone,company,address1,city,post_code,country,region));
    }

    @Then("veo nuevo formulario")
    public void  next() {
    }



}
