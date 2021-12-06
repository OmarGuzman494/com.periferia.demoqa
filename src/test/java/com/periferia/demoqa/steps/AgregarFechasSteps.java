package com.periferia.demoqa.steps;

import com.periferia.demoqa.pageObjects.AgregarFechasPageObjects;
import utilidades.Utilidades;


public class AgregarFechasSteps {

	AgregarFechasPageObjects pageObjectsAgregarFechas;
	Utilidades utilidades;
	

	public void ingresarMenuWidgets() {
		utilidades.desplazarScroll("700","400");
		utilidades.bordearElemento(pageObjectsAgregarFechas.getBtnMenuWidgets());
		utilidades.tomarEvidencia();
		utilidades.clickEnBotonEspecial(pageObjectsAgregarFechas.getBtnMenuWidgets());
		
	}

	public void ingresarDatePicker() {
		utilidades.desplazarScroll("700","400");
		utilidades.bordearElemento(pageObjectsAgregarFechas.getBtnDatePicker());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsAgregarFechas.getBtnDatePicker());
		
	}

	public void agregarFecha(String strFecha) throws Exception {
		utilidades.bordearElemento(pageObjectsAgregarFechas.getTxtSelectDate());
		utilidades.clickEnBotonEspecial(pageObjectsAgregarFechas.getTxtSelectDate());
		utilidades.seleccionarFechaCalendario(strFecha);
	}

	public void seleccionarFechaHora(String strFechaHora) throws Exception {
		utilidades.bordearElemento(pageObjectsAgregarFechas.getTxtDateTime());
		utilidades.clickBoton(pageObjectsAgregarFechas.getTxtDateTime());
		utilidades.seleccionarFechaHoraCalendario(strFechaHora);
	}
	
	
	
}
