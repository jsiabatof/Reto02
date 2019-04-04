package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.RegistroFormularioPage;

import net.thucydides.core.annotations.Step;

public class RegistroFormularioSteps {
	
	RegistroFormularioPage registroFormularioPage;
	
	@Step
	public void diligenciar_registro_cuenta_demo(List<List<String>> data, int id) {
		registroFormularioPage.primernombre(data.get(id).get(0).trim());
		registroFormularioPage.apellido(data.get(id).get(1).trim());
		registroFormularioPage.residencia(data.get(id).get(2).trim());
		registroFormularioPage.ciudad(data.get(id).get(3).trim());
		registroFormularioPage.telefono(data.get(id).get(4).trim());
		registroFormularioPage.correo(data.get(id).get(5).trim());
		registroFormularioPage.idioma(data.get(id).get(6).trim());
		registroFormularioPage.trading(data.get(id).get(7).trim());
		registroFormularioPage.cuenta(data.get(id).get(8).trim());
		registroFormularioPage.moneda(data.get(id).get(9).trim());
		registroFormularioPage.apalancamiento(data.get(id).get(10).trim());
		registroFormularioPage.inversion(data.get(id).get(11).trim());
		registroFormularioPage.password(data.get(id).get(12).trim());
		registroFormularioPage.confirmar_password(data.get(id).get(13).trim());
		registroFormularioPage.checkBox();
		registroFormularioPage.abrir_cuenta();
	}
	
	@Step
	public void verificar_ingresos_datos_exitoso() {
		registroFormularioPage.enhorabuena_apertura();
	}
	
	@Step
	public void correccion() {
		registroFormularioPage.correccion_error();
	}
	
	@Step
	public void contraseña_erronea() {
		registroFormularioPage.error_contraseña();
	}
	
	@Step
	public void diligenciar_registro_cuenta_demo_contraseña_aleatoria(List<List<String>> data2, int id) {
		registroFormularioPage.primernombre(data2.get(id).get(0).trim());
		registroFormularioPage.apellido(data2.get(id).get(1).trim());
		registroFormularioPage.residencia(data2.get(id).get(2).trim());
		registroFormularioPage.ciudad(data2.get(id).get(3).trim());
		registroFormularioPage.telefono(data2.get(id).get(4).trim());
		registroFormularioPage.correo(data2.get(id).get(5).trim());
		registroFormularioPage.idioma(data2.get(id).get(6).trim());
		registroFormularioPage.trading(data2.get(id).get(7).trim());
		registroFormularioPage.cuenta(data2.get(id).get(8).trim());
		registroFormularioPage.moneda(data2.get(id).get(9).trim());
		registroFormularioPage.apalancamiento(data2.get(id).get(10).trim());
		registroFormularioPage.inversion(data2.get(id).get(11).trim());
		registroFormularioPage.password_aleatoria();
		registroFormularioPage.confirmar_password_aleatoria();
		registroFormularioPage.checkBox();
		registroFormularioPage.abrir_cuenta();
	}

}
