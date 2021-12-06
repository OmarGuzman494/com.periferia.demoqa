package com.periferia.demoqa.steps;

import static org.junit.Assert.fail;

import com.periferia.demoqa.pageObjects.GestionarAlertasPageObjects;

import utilidades.Utilidades;

public class GestionarAlertasSteps {

	GestionarAlertasPageObjects pageObjectsGestionarAlertas;
	Utilidades utilidades;
	
	public void ingresarMenuAlertsFrame() {
		utilidades.desplazarScroll("700","400");
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnMenuAlertFrame());
		utilidades.tomarEvidencia();
		utilidades.clickEnBotonEspecial(pageObjectsGestionarAlertas.getBtnMenuAlertFrame());
		
	}

	public void ingresarAlertasFrame() {
		utilidades.desplazarScroll("700","400");
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnIngresarAlertasFrame());
		utilidades.tomarEvidencia();
		
	}

	public void ingresarAlerts() {
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnIngresarAlertas());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsGestionarAlertas.getBtnIngresarAlertas());
		
	}

	public void verAlerta() {
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnVerAlerta());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsGestionarAlertas.getBtnVerAlerta());
		utilidades.tomarEvidencia();
	}

	public void cerrarAlerta() {
		utilidades.validaAlerta();
	
	}

	public void alertaDespuesCincoSegundos() {
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnAlertaDespues());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsGestionarAlertas.getBtnAlertaDespues());
		utilidades.validaAlerta();
		utilidades.cambioDeFrameDefault();
	}

	public void alertaCuadroConfirmacion() {
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnAlertaConfirmacion());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsGestionarAlertas.getBtnAlertaConfirmacion());
		utilidades.validaAlerta();
	}

	public void validarMensajeCuadroConfirmnacion(String strMensajeCuadroConfirmacion, String strMensajeAlerta) {
		utilidades.aceptarAlertaPorMensaje(strMensajeCuadroConfirmacion);
		String mensaje = utilidades.extraerTextodeLabel(pageObjectsGestionarAlertas.getTxtMensajeCuadroConfirmacion());
		if(mensaje.contentEquals(strMensajeAlerta)) {
			utilidades.bordearElemento(pageObjectsGestionarAlertas.getTxtMensajeCuadroConfirmacion());
			utilidades.tomarEvidencia();
		}else {
			utilidades.tomarEvidencia();
			fail("El mensaje obtenido es diferente al esperado cuando se gestiona adecuadamente la alerta");
		}
	}
	
	public void AlertaCuadroAviso(String strName) {
		utilidades.bordearElemento(pageObjectsGestionarAlertas.getBtnAlertaAviso());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsGestionarAlertas.getBtnAlertaAviso());
		utilidades.diligenciarAlerta(strName);
	}

	public void validarRespuestaCuadroAvisoAlerta(String strName) {
		String mensaje = utilidades.extraerTextodeLabel(pageObjectsGestionarAlertas.getTxtMensajeCuadroAvisoAlerta());
		if(mensaje.contains(strName)) {
			utilidades.bordearElemento(pageObjectsGestionarAlertas.getTxtMensajeCuadroAvisoAlerta());
			utilidades.tomarEvidencia();
		}else {
			utilidades.tomarEvidencia();
			fail("El mensaje obtenido es diferente al esperado cuando se gestiona adecuadamente la alerta");
		}
		
	}

}
