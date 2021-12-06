package com.periferia.demoqa.definition;

import com.periferia.demoqa.steps.GestionarAlertasSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GestionarAlertasDefinition {

	@Steps
	GestionarAlertasSteps stepsGestionarAlertas;
	
	
	
	@Given("ingresar al menu Alerts,Frame")
	public void ingresar_al_menu_alerts_frame() {
		stepsGestionarAlertas.ingresarMenuAlertsFrame();
	}

	@Given("ingresar a Alerts,Frame")
	public void ingresar_a_Alerts_Frame() {
		stepsGestionarAlertas.ingresarAlertasFrame();
	}
	
	@Given("ingresar a Alerts")
	public void ingresar_a_alerts() {
		stepsGestionarAlertas.ingresarAlerts(); 
	}

	@When("click en ver alerta")
	public void click_en_ver_alerta() {
		stepsGestionarAlertas.verAlerta();
	}

	@When("cerrar alerta")
	public void cerrar_alerta() {
		stepsGestionarAlertas.cerrarAlerta();
	}
	
	@When("click alerta despues cinco segundos")
	public void click_alerta_despues_cinco_segundos() {
		stepsGestionarAlertas.alertaDespuesCincoSegundos();
	}

	@When("click alerta cuadro confirmacion")
	public void click_alerta_cuadro_confirmacion() {
		stepsGestionarAlertas.alertaCuadroConfirmacion();
	}

	@When("validar mensaje cuadro confirmacion {string}, {string}")
	public void click_alerta_cuadro_confirmacion(String strMensajeCuadroConfirmacion, String strMensajeAlerta) {
		stepsGestionarAlertas.validarMensajeCuadroConfirmnacion(strMensajeCuadroConfirmacion, strMensajeAlerta);
	}

	@When("click alerta cuadro aviso {string}")
	public void click_alerta_cuadro_aviso(String strName) {
		stepsGestionarAlertas.AlertaCuadroAviso(strName);
	}

	@Then("validar respuesta cuadro aviso alerta {string}")
	public void validar_respuesta_cuadro_aviso_alerta(String strName) {
		stepsGestionarAlertas.validarRespuestaCuadroAvisoAlerta(strName);
	}

}
