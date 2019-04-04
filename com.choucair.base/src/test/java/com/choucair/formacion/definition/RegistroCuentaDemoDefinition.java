package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.RegistroCuentaDemoSteps;
import com.choucair.formacion.steps.RegistroFormularioSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroCuentaDemoDefinition {
	
	@Steps
	RegistroCuentaDemoSteps registroCuentaDemoSteps;
	
	@Steps
	RegistroFormularioSteps registroFormularioSteps;
	
	@Given("^Que se necesita realizar la creación de una cuenta demo$")
	public void que_se_necesita_realizar_la_creación_de_una_cuenta_demo() {
		registroCuentaDemoSteps.registro_inico();
	}

	@When("^se realizar el registro de la cuenta en el aplicativo web$")
	public void se_realizar_el_registro_de_la_cuenta_en_el_aplicativo_web(DataTable dtDatos) {
		List<List<String>> data = dtDatos.raw();
		
		for(int i=1; i<data.size(); i++) {
			registroFormularioSteps.diligenciar_registro_cuenta_demo(data, i);
		}
	}
	
	@When("^se realizar el registro de la cuenta en el aplicativo web con contraseñas aleatorias$")
	public void se_realizar_el_registro_de_la_cuenta_en_el_aplicativo_web_con_contraseñas_aleatorias(DataTable dtDatos2) {
		List<List<String>> data2 = dtDatos2.raw();
		
		for(int i=1; i<data2.size(); i++) {
			registroFormularioSteps.diligenciar_registro_cuenta_demo_contraseña_aleatoria(data2, i);
		}
	}
	
	@Then("^aparece un mensaje de enhorabuena$")
	public void aparece_un_mensaje_de_enhorabuena() {
		registroFormularioSteps.verificar_ingresos_datos_exitoso();
	}
	
	@Then("^aparece un mensaje erroneo el cual se corrige y se confirma la aparicion del enhorabuena$")
	public void aparece_un_mensaje_erroneo_el_cual_se_corrige_y_se_confirma_la_aparicion_del_enhorabuena() {
		registroFormularioSteps.correccion();
		registroFormularioSteps.verificar_ingresos_datos_exitoso();
	}
	
	@Then("^verificar que se presente mensaje informativo$")
	public void verificar_que_se_presente_mensaje_informativo() {
		registroFormularioSteps.contraseña_erronea();
	}
}
