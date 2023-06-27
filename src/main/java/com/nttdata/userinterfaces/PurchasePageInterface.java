package com.nttdata.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class PurchasePageInterface {


    public static final Target INP_FIRST_NAME = Target.the("Input Name").located(By.xpath("//*[@id='input-payment-firstname']"));
    public static final Target INP_LAST_NAME = Target.the("Input Last Name").located(By.xpath("//*[@id='input-payment-lastname']"));
    public static final Target INP_EMAIL = Target.the("Input Email").located(By.xpath("//*[@id='input-payment-email']"));
    public static final Target INP_PHONE = Target.the("Input Phone").located(By.xpath("//*[@id='input-payment-telephone']"));
    public static final Target INP_COMPANY = Target.the("Input Company").located(By.xpath("//*[@id='input-payment-company']"));
    public static final Target INP_ADDRESS  = Target.the("Input Address1").located(By.xpath("//*[@id='input-payment-address-1']"));
    public static final Target INP_CITY = Target.the("Input City").located(By.xpath("//*[@id='input-payment-city']"));
    public static final Target INP_POST_CODE = Target.the("Input Post Code").located(By.xpath("//*[@id='input-payment-postcode']"));
    public static final Target INP_COUNTRY = Target.the("Input Country").located(By.xpath("//*[@id='input-payment-country']"));
    public static final Target INP_REGION = Target.the("Input Region").located(By.xpath("//*[@id='input-payment-zone']"));
    public static final Target OPT_REGION = Target.the("Input Region").located(By.xpath("//*[@id='input-payment-zone']/option[6]"));
    public static final Target BTN_DELIVERY = Target.the("Button Delivery").located(By.xpath("//*[@id='collapse-payment-address']/div/div[2]/label/input"));
    public static final Target BTN_CONTINUE = Target.the("Button Continue").located(By.xpath("//*[@id='button-guest']"));

    public static final Target BTN_NEXT = Target.the("Button Next").located(By.xpath("//*[@id='button-shipping-method']"));
    public static final Target BTN_TERMS = Target.the("Button Terms").located(By.xpath("//*[@id='collapse-payment-method']/div/div[3]/div/input[1]"));
    public static final Target BTN_NEXT_2 = Target.the("Button Next").located(By.xpath("//*[@id='button-payment-method']"));
    public static final Target BTN_CONFIRM = Target.the("Button Confirm").located(By.xpath("//*[@id='button-confirm']"));
}
