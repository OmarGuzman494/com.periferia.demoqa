package com.periferia.demoqa.definition;

import com.periferia.demoqa.steps.AgregarFechasSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class AgregarFechasDefinition {

	@Steps
	AgregarFechasSteps stepsAgregarFechas;
	
	
	@Given("ingresar al menu Widgets")
	public void ingresar_al_menu_widgets() {
		stepsAgregarFechas.ingresarMenuWidgets();
	}

	@Given("ingresar a Date Picker")
	public void ingresar_a_date_picker() {
		stepsAgregarFechas.ingresarDatePicker();
	}

	@When("agregar una fecha {string}")
	public void agregar_una_fecha(String strFecha) throws Exception {
		stepsAgregarFechas.agregarFecha(strFecha);
	}

	@When("seleccionar una fecha y hora {string}")
	public void seleccionar_una_fecha_y_hora(String strFechaHora) throws Exception {
		stepsAgregarFechas.seleccionarFechaHora(strFechaHora);
	}
	
}
