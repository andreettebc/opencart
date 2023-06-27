package com.nttdata.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class ShopPageInterface {

    public static final Target BTN_ADD_TO_CART_1 = Target.the("Button add to cart Product 1").located(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]"));
    public static final Target BTN_ADD_TO_CART_2 = Target.the("Button add to cart Product 2").located(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[3]/button[1]"));

    public static final Target BTN_CART = Target.the("Boton Cart").located(By.xpath("//*[@id='cart']/button"));

    public static final Target BTN_VIEW_CART = Target.the("Boton View Cart").located(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]"));
    public static final Target BTN_CHECKOUT = Target.the("Boton Checkout").located(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
    public static final Target BTN_GUEST_CHECKOUT = Target.the("Boton GuestCheckout").located(By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input"));
    public static final Target BTN_CONTINUE = Target.the("Boton Continue").located(By.xpath("//*[@id='button-account']"));



}
