package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.xm.com/register/account/demo?lang=es")

public class RegistroInicioPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"cookieModal\"]/div/div/div[1]/div[2]/div[2]/div/button")
	public WebElementFacade btnAceptar;
	
	@FindBy(xpath="//H1[text()='Registro de Cuenta Demo']")
	public WebElementFacade lblHome;
	
	public void VerificarHome() {
		btnAceptar.click();
		String labelv = "Registro de Cuenta Demo";
		String strMensaje = lblHome.getText();
		assertThat(strMensaje, containsString(labelv));
	}
}
