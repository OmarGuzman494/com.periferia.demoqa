package com.periferia.demoqa.steps;




import com.periferia.demoqa.pageObjects.NuevoRegistroPageObjects;
import utilidades.Utilidades;

public class NuevoRegistroSteps {
	
	NuevoRegistroPageObjects pageObjectsNuevoRegistro;
	Utilidades utilidades;
	
	String strEmailRegistro = "";

	public void ingresarPaginaWebDemoqa(String strUrl) {
		try {
			pageObjectsNuevoRegistro.openAt(strUrl);
			utilidades.esperaCargarPagina();
			pageObjectsNuevoRegistro.borrarcache();
			utilidades.tomarEvidencia();
		}catch (Exception e) {
			pageObjectsNuevoRegistro.openAt(strUrl);
			utilidades.tomarEvidencia();
			}
		
	}

	public void IngresarMenuElements() {
		utilidades.posicionarElementoScroll(pageObjectsNuevoRegistro.getBtnMenuElements());
		utilidades.bordearElemento(pageObjectsNuevoRegistro.getBtnMenuElements());
		utilidades.tomarEvidencia();
		utilidades.clickEnBotonEspecial(pageObjectsNuevoRegistro.getBtnMenuElements());
	}

	public void ingresarWebTables() {
		utilidades.posicionarElementoScroll(pageObjectsNuevoRegistro.getBtnWebTables());
		utilidades.bordearElemento(pageObjectsNuevoRegistro.getBtnWebTables());
		utilidades.desplazarScroll("700","400");
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsNuevoRegistro.getBtnWebTables());
	}

	public void agregarNuevoRegistro() {
		utilidades.bordearElemento(pageObjectsNuevoRegistro.getBtnNuevoRegistro());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsNuevoRegistro.getBtnNuevoRegistro());
	}

	public void diligenciarFormularioRegistro(String strFirstName, String strLastName, String strEmail, String strAge, String strSalary, String strDepartment) {
		utilidades.escribirTexto(pageObjectsNuevoRegistro.getTxtFirstName(),strFirstName);
		utilidades.escribirTexto(pageObjectsNuevoRegistro.getTxtLastName(),strLastName);
		utilidades.escribirTexto(pageObjectsNuevoRegistro.getTxtEmail(),strEmail);
		utilidades.escribirTexto(pageObjectsNuevoRegistro.getTxtAge(),strAge);
		utilidades.escribirTexto(pageObjectsNuevoRegistro.getTxtSalary(),strSalary);
		utilidades.escribirTexto(pageObjectsNuevoRegistro.getTxtDepartment(),strDepartment);
		strEmailRegistro = strEmail;
	}

	public void enviarRegistro() {
		utilidades.bordearElemento(pageObjectsNuevoRegistro.getBtnEnviarRegistro());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsNuevoRegistro.getBtnEnviarRegistro());
	}


	public void eliminarRegistro() {
		utilidades.bordearElemento(pageObjectsNuevoRegistro.getBtnEliminarRegistro());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsNuevoRegistro.getBtnEliminarRegistro());
	}
	
	public void salirDeLaPagina() {
		utilidades.tomarEvidencia();
		utilidades.cerrarPagina();
	}

	
}
