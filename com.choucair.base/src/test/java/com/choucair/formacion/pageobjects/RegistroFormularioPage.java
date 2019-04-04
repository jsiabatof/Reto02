package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Random;

public class RegistroFormularioPage extends PageObject{
	
	@FindBy(xpath="//INPUT[@id='first_name']")
	public WebElementFacade txtPrimerNombre;
	
	@FindBy(xpath="//INPUT[@id='last_name']")
	public WebElementFacade txtApellido;
	
	@FindBy(xpath="//SELECT[@id='country']")
	public WebElementFacade cbmResidencia;
	
	@FindBy(xpath="//INPUT[@id='city']")
	public WebElementFacade txtCiudad;
	
	@FindBy(xpath="//INPUT[@id='phone_number']")
	public WebElementFacade txtTelefono;
	
	@FindBy(xpath="//INPUT[@id='email']")
	public WebElementFacade txtCorreo;
	
	@FindBy(xpath="//SELECT[@id='preferred_language']")
	public WebElementFacade cbmIdioma;
	
	@FindBy(xpath="//SELECT[@id='trading_platform_type']")
	public WebElementFacade cbmTrading;
	
	@FindBy(xpath="//SELECT[@id='account_type']")
	public WebElementFacade cbmCuenta;
	
	@FindBy(xpath="//SELECT[@id='account_currency']")
	public WebElementFacade cbmMoneda;
	
	@FindBy(xpath="//SELECT[@id='account_leverage']")
	public WebElementFacade cbmApalancamiento;
	
	@FindBy(xpath="//SELECT[@id='investment_amount']")
	public WebElementFacade cbmInversion;
	
	@FindBy(xpath="//INPUT[@id='account_password']")
	public WebElementFacade txtPassword;
	
	@FindBy(xpath="//INPUT[@id='account_password_confirmation']")
	public WebElementFacade txtConfirPassword;
	
	@FindBy(xpath="//LABEL[@for='agree_promo']")
	public WebElementFacade checkbox;
	
	@FindBy(xpath="//BUTTON[@id='submit-btn']")
	public WebElementFacade btnAbrirCuenta;
	
	@FindBy(xpath="(//LABEL[@for='first_name'])[2]")
	public WebElementFacade MenInformativo;
	
	@FindBy(xpath="//LABEL[@for='account_password_confirmation'][text()='Las contraseñas deben coincidir']")
	public WebElementFacade MenInformativoNoCoinciden;
	
	@FindBy(xpath="(//LABEL[@for='account_password_confirmation'])[2]")
	public WebElementFacade MenInformativoRequerdio;
	
	@FindBy(xpath="//DIV[@role='alert']")
	public WebElementFacade MenInformativoPositivo;
	
	
	public void primernombre(String datoPrueba) {
//		txtPrimerNombre.click();
//		txtPrimerNombre.clear();
		txtPrimerNombre.typeAndTab(datoPrueba);
	}
	public void apellido(String datoPrueba) {
//		txtApellido.click();
//		txtApellido.clear();
		txtApellido.typeAndTab(datoPrueba);
	}
	public void residencia(String datoPrueba) {
		try {
			getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 350)", "");
//			cbmResidencia.click();
			cbmResidencia.selectByVisibleText(datoPrueba);
			}catch(Exception e) {
				System.out.print("El error es: " + e.getMessage());
				e.printStackTrace();
				}
	}
	public void ciudad(String datoPrueba) {
//		txtCiudad.click();
//		txtCiudad.clear();
		txtCiudad.typeAndTab(datoPrueba);
	}
	public void telefono(String datoPrueba) {
//		txtTelefono.click();
		txtTelefono.typeAndTab("+57 " + datoPrueba);
	}
	public void correo(String datoPrueba) {
//		txtCorreo.click();
//		txtCorreo.clear();
		txtCorreo.typeAndTab(datoPrueba);
	}
	public void idioma(String datoPrueba) {
		try {
//			cbmIdioma.click();
			cbmIdioma.selectByVisibleText(datoPrueba);
			}catch(Exception e2) {
				System.out.print("El error 2 es: " + e2.getMessage());
				e2.printStackTrace();
			}
	}
	public void trading(String datoPrueba) {
		try {
			getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 350)", "");
//			cbmTrading.click();
			cbmTrading.selectByVisibleText(datoPrueba);
			}catch(Exception e3) {
				System.out.print("El error 3 es: " + e3.getMessage());
				e3.printStackTrace();
			}
	}
	public void cuenta(String datoPrueba) {
//		cbmCuenta.click();
		cbmCuenta.selectByVisibleText(datoPrueba);
	}
	public void moneda(String datoPrueba) {
		try {
//			cbmMoneda.click();
			cbmMoneda.selectByVisibleText(datoPrueba);
			}catch(Exception e4) {
				System.out.print("El error 4 es :" + e4.getMessage());
				e4.printStackTrace();
			}
	}
	public void apalancamiento(String datoPrueba) {
//		cbmApalancamiento.click();
		cbmApalancamiento.selectByVisibleText(datoPrueba);
	}
	public void inversion(String datoPrueba) {
//		cbmInversion.click();
		cbmInversion.selectByVisibleText(datoPrueba);
	}
	public void password(String datoPrueba) {
		getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 350)", "");
//		txtPassword.click();
//		txtPassword.clear();
		txtPassword.typeAndTab(datoPrueba);
	}
	public void password_aleatoria() {
		getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 350)", "");
//		txtPassword.click();
//		txtPassword.clear();
		String Aleatoria1 = "";
		Random rnd = new Random();
		int n = 0;
		for (int i=0; i<8; i++) {
			if (i<3) {
				while (n <= 2) {
					int valor = rnd.nextInt(91);
					if (valor >= 65) {
						Aleatoria1 += (char)(valor);
						n = n + 1;
					}
				}
			}
			if (i<5) {
				while (n <= 4) {
					int valor = rnd.nextInt(123);
					if (valor >= 97) {
						Aleatoria1 += (char)(valor);
						n = n + 1;
					}
				}
			}
			else {
				Aleatoria1 += rnd.nextInt(10);
			}
		}
		System.out.println("Password: " + Aleatoria1);
		txtPassword.typeAndTab(Aleatoria1);
	}
	public void confirmar_password(String datoPrueba) {
//		txtConfirPassword.click();
//		txtConfirPassword.clear();
		txtConfirPassword.typeAndTab(datoPrueba);
	}
	public void confirmar_password_aleatoria() {
//		txtConfirPassword.click();
//		txtConfirPassword.clear();
		String Aleatoria2 = "";
		Random rnd = new Random();
		int n = 0;
		for (int i=0; i<8; i++) {
			if (i<3) {
				while (n <= 2) {
					int valor = rnd.nextInt(91);
					if (valor >= 65) {
						Aleatoria2 += (char)(valor);
						n = n + 1;
					}
				}
			}
			if (i<5) {
				while (n <= 4) {
					int valor = rnd.nextInt(123);
					if (valor >= 97) {
						Aleatoria2 += (char)(valor);
						n = n + 1;
					}
				}
			}
			else {
				Aleatoria2 += rnd.nextInt(10);
			}
		}
		System.out.println("Password 2: " + Aleatoria2);
		txtConfirPassword.typeAndTab(Aleatoria2);
	}
	public void checkBox() {
		checkbox.click();
	}
	public void abrir_cuenta() {
		btnAbrirCuenta.click();
	}
	public void correccion_error() {
		assertThat(MenInformativo.isCurrentlyVisible(), is(true));
//		txtPrimerNombre.click();
		txtPrimerNombre.clear();
		txtPrimerNombre.typeAndTab("Nombre2");
		getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 600)", "");
		btnAbrirCuenta.click();
	}
	public void error_contraseña() {
		assertThat(MenInformativoNoCoinciden.isCurrentlyVisible(), is(true));
//		txtConfirPassword.click();
		txtConfirPassword.clear();
		assertThat(MenInformativoRequerdio.isCurrentlyVisible(), is(true));
	}
	public void enhorabuena_apertura() {
		String labelv ="Enhorabuena por la apertura de una Cuenta Demo de XM";
		String strMensaje = MenInformativoPositivo.getText();
		assertThat(strMensaje, containsString(labelv));
	}
}
