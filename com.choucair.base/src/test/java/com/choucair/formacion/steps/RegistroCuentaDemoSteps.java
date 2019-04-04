package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.RegistroInicioPage;

import net.thucydides.core.annotations.Step;

public class RegistroCuentaDemoSteps {
	
	RegistroInicioPage registroInicioPage;
	
	@Step
	public void registro_inico() {
		registroInicioPage.open();
		registroInicioPage.VerificarHome();
	}
}
