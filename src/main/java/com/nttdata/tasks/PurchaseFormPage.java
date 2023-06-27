package com.nttdata.tasks;

import com.nttdata.userinterfaces.PurchasePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {

    public final String first_name;
    public final String last_name;
    public final String email;
    public final String phone;
    public final String company;
    public final String address;
    public final String city;
    public final String post_code;
    public final String country;
    public final String region;

    public PurchaseFormPage(String first_name, String last_name, String email, String phone, String company, String address, String city, String post_code, String country, String region){
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.phone=phone;
        this.company=company;
        this.address=address;
        this.city=city;
        this.post_code=post_code;
        this.country=country;
        this.region=region;

    }

    public static Performable withData(String first_name, String last_name, String email, String phone, String company, String address, String city, String post_code, String country, String region){
        return instrumented(PurchaseFormPage.class, first_name,last_name,email,phone,company,address,city,post_code,country,region );
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                WaitUntil.the(PurchasePageInterface.INP_FIRST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(first_name).into(PurchasePageInterface.INP_FIRST_NAME),

                WaitUntil.the(PurchasePageInterface.INP_LAST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(last_name).into(PurchasePageInterface.INP_LAST_NAME),

                WaitUntil.the(PurchasePageInterface.INP_EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(email).into(PurchasePageInterface.INP_EMAIL),

                WaitUntil.the(PurchasePageInterface.INP_PHONE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(phone).into(PurchasePageInterface.INP_PHONE),

                WaitUntil.the(PurchasePageInterface.INP_COMPANY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(company).into(PurchasePageInterface.INP_COMPANY),

                WaitUntil.the(PurchasePageInterface.INP_ADDRESS, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(address).into(PurchasePageInterface.INP_ADDRESS),

                WaitUntil.the(PurchasePageInterface.INP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.INP_CITY),

                WaitUntil.the(PurchasePageInterface.INP_POST_CODE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(post_code).into(PurchasePageInterface.INP_POST_CODE),

                WaitUntil.the(PurchasePageInterface.INP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.INP_COUNTRY),

                WaitUntil.the(PurchasePageInterface.INP_REGION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.INP_REGION),

                WaitUntil.the(PurchasePageInterface.OPT_REGION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.OPT_REGION),

                WaitUntil.the(PurchasePageInterface.BTN_CONTINUE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_CONTINUE),

                WaitUntil.the(PurchasePageInterface.BTN_NEXT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_NEXT),

                WaitUntil.the(PurchasePageInterface.BTN_TERMS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_TERMS),

                WaitUntil.the(PurchasePageInterface.BTN_NEXT_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_NEXT_2),

                WaitUntil.the(PurchasePageInterface.BTN_CONFIRM, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_CONFIRM)

        );


    }


}
