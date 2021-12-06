package com.periferia.demoqa.definition;

import com.periferia.demoqa.steps.NuevoRegistroSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class NuevoRegistroDefinition {

	@Steps
	NuevoRegistroSteps stepsNuevoRegistro;
	
	
	@Given("Ingresar a la pagina web demoqa {string}")
	public void ingresar_a_la_pagina_web_demoqa(String strUrl) {
		stepsNuevoRegistro.ingresarPaginaWebDemoqa(strUrl);
	}

	@Given("ingresar al menu Elements")
	public void ingresar_al_menu_elements() {
		stepsNuevoRegistro.IngresarMenuElements();
	}
	
	@Given("ingresar a Web Tables")
	public void ingresar_a_Web_Tables() {
		stepsNuevoRegistro.ingresarWebTables();
	}

	@Given("agregar un nuevo registro")
	public void agregar_un_nuevo_registro() {
		stepsNuevoRegistro.agregarNuevoRegistro();
	}

	@Given("diligenciar formulario de registro {string}, {string}, {string}, {string}, {string}, {string}")
	public void diligenciar_formulario_de_registro(String strFirstName, String strLastName, String strEmail, String strAge, String strSalary, String strDepartment) {
		stepsNuevoRegistro.diligenciarFormularioRegistro(strFirstName, strLastName, strEmail, strAge, strSalary, strDepartment);
	}
	@When("enviar registro")
	public void enviar_registro() {
		stepsNuevoRegistro.enviarRegistro();
	}

	@Then("eliminar un registro")
	public void eliminar_un_registro() {
		stepsNuevoRegistro.eliminarRegistro();
	}
	
	@Then("Salir de la pagina")
	public void salir_de_la_pagina() {
		stepsNuevoRegistro.salirDeLaPagina();
	}

}
