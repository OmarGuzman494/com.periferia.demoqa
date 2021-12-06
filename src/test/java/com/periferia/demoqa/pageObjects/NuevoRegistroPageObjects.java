package com.periferia.demoqa.pageObjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NuevoRegistroPageObjects extends PageObject {
	
	

	
		
	@FindBy(xpath="//div[@class='card-body']/h5[contains(text(),'Elements')]")
	static WebElementFacade BtnMenuElements;
	
	@FindBy(xpath="//span[@class='text' and contains(text(),'Web Tables')]")
	static WebElementFacade btnWebTables;
		
	@FindBy(xpath="//button[@id='addNewRecordButton']")
	static WebElementFacade BtnNuevoRegistro;
	
	@FindBy(xpath="//input[@id='firstName']")
	static WebElementFacade TxtFirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	static WebElementFacade TxtLastName;
	
	@FindBy(xpath="//input[@id='userEmail']")
	static WebElementFacade TxtEmail;
	
	@FindBy(xpath="//input[@id='age']")
	static WebElementFacade TxtAge;
	
	@FindBy(xpath="//input[@id='salary']")
	static WebElementFacade TxtSalary;
	
	@FindBy(xpath="//input[@id='department']")
	static WebElementFacade TxtDepartment;
	
	@FindBy(xpath="//button[@id='submit']")
	static WebElementFacade BtnEnviarRegistro;
	
	@FindBy(xpath="//div[@class='rt-tr-group']")
	static WebElementFacade RowRegistro;
	
	@FindBy(xpath="//div[@class='rt-tr-group']//span[contains(@id,'delete-record')]")
	static WebElementFacade BtnEliminarRegistro;
	
	
	public void borrarcache() {
		getDriver().manage().deleteAllCookies();
		
	}

	public WebElementFacade getBtnMenuElements() {
		return BtnMenuElements;
	}
	
	public WebElementFacade getBtnWebTables() {
		return btnWebTables;
	}
	
	public WebElementFacade getBtnNuevoRegistro() {
		return BtnNuevoRegistro;
	}

	public WebElementFacade getTxtFirstName() {
		return TxtFirstName;
	}

	public WebElementFacade getTxtLastName() {
		return TxtLastName;
	}

	public WebElementFacade getTxtEmail() {
		return TxtEmail;
	}

	public WebElementFacade getTxtAge() {
		return TxtAge;
	}

	public WebElementFacade getTxtSalary() {
		return TxtSalary;
	}

	public WebElementFacade getTxtDepartment() {
		return TxtDepartment;
	}

	public WebElementFacade getBtnEnviarRegistro() {
		return BtnEnviarRegistro;
	}

	public WebElementFacade getRowRegistro() {
		return RowRegistro;
	}

	public WebElementFacade getBtnEliminarRegistro() {
		return BtnEliminarRegistro;
	}

	

}
