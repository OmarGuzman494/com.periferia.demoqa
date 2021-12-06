package com.periferia.demoqa.pageObjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GestionarAlertasPageObjects extends PageObject{
	
	@FindBy(xpath="//div[@class='card mt-4 top-card']//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']")
	static WebElementFacade btnMenuAlertFrame;
	
	@FindBy(xpath="//div[@class ='header-text'][text()='Alerts, Frame & Windows']")
	static WebElementFacade btnIngresarAlertasFrame;
	
	@FindBy(xpath="//ul[@class='menu-list']//span[text()='Alerts']")
	static WebElementFacade btnIngresarAlertas;
	
	@FindBy(xpath="//button[@id='alertButton']")
	static WebElementFacade btnVerAlerta;
	
	@FindBy(xpath="")
	static WebElementFacade btnCerrarAlerta;
	
	@FindBy(xpath="//button[@id='timerAlertButton']")
	static WebElementFacade btnAlertaDespues;
	
	@FindBy(xpath="//button[@id='confirmButton']")
	static WebElementFacade btnAlertaConfirmacion;
	
	@FindBy(xpath="//button[@id='promtButton']")
	static WebElementFacade btnAlertaAviso;
	
	@FindBy(xpath="//span[@id='confirmResult']")
	static WebElementFacade txtMensajeCuadroConfirmacion;
	
	@FindBy(xpath="//span[@id='promptResult']")
	static WebElementFacade txtMensajeCuadroAvisoAlerta;
	
	
	

	public WebElementFacade getBtnMenuAlertFrame() {
		return btnMenuAlertFrame;
	}

	public WebElementFacade getBtnIngresarAlertasFrame() {
		return btnIngresarAlertasFrame;
	}
	
	public WebElementFacade getBtnIngresarAlertas() {
		return btnIngresarAlertas;
	}

	public WebElementFacade getBtnVerAlerta() {
		return btnVerAlerta;
	}

	public WebElementFacade getBtnCerrarAlerta() {
		return btnCerrarAlerta;
	}

	public WebElementFacade getBtnAlertaDespues() {
		return btnAlertaDespues;
	}

	public WebElementFacade getBtnAlertaConfirmacion() {
		return btnAlertaConfirmacion;
	}

	public WebElementFacade getBtnAlertaAviso() {
		return btnAlertaAviso;
	}

	public WebElement getTxtMensajeCuadroConfirmacion() {
		return txtMensajeCuadroConfirmacion;
	}

	public WebElement getTxtMensajeCuadroAvisoAlerta() {
		return txtMensajeCuadroAvisoAlerta;
	}

	
}
