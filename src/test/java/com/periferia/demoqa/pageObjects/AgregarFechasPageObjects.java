package com.periferia.demoqa.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AgregarFechasPageObjects extends PageObject{

	
	@FindBy(xpath="//div[@class='card mt-4 top-card']//div[@class='card-body']/h5[text()='Widgets']")
	static WebElementFacade btnMenuWidgets;
	
	@FindBy(xpath="//span[@class='text' and contains(text(),'Date Picker')]")
	static WebElementFacade btnDatePicker;
	
	@FindBy(xpath="//input[@id='datePickerMonthYearInput']")
	static WebElementFacade txtSelectDate;
	
	@FindBy(xpath="//input[@id='dateAndTimePickerInput']")
	static WebElementFacade txtDateTime;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	static WebElementFacade cmbMes;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	static WebElementFacade cmbAhho;
	
	@FindBy(xpath="")
	static WebElementFacade btnDia;
	
	@FindBy(xpath="//div[contains(@class,'hasYearDropdown react-datepicker__current-month--hasMonthDropdown')]")
	static WebElementFacade CmbmesAhho;
	
	@FindBy(xpath="//span[@class='react-datepicker__month-read-view--selected-month']")
	static WebElementFacade CbmMesDataTime;
	
	@FindBy(xpath="//span[@class='react-datepicker__year-read-view--selected-year']")
	static WebElementFacade CmbAhhoDataTime;
	
	
	
	public WebElementFacade getBtnMenuWidgets() {
		return btnMenuWidgets;
	}

	public WebElementFacade getBtnDatePicker() {
		return btnDatePicker;
	}

	public WebElementFacade getTxtSelectDate() {
		return txtSelectDate;
	}

	public WebElementFacade getTxtDateTime() {
		return txtDateTime;
	}

	public WebElementFacade getCmbMes() {
		return cmbMes;
	}
	
	public WebElementFacade getCmbAhho() {
		return cmbAhho;
	}
	
	public WebElementFacade getBtnDia() {
		return btnDia;
	}

	public void setBtnDia(String day) {
		btnDia = find(By.xpath("(//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']//div[contains(@class,'*')])[1]".replace("*", day)));
		
	}

	public WebElementFacade getCmbmesAhho() {
		return CmbmesAhho;
	}
	
	public WebElementFacade getcmbMesDataTime() {
		return CbmMesDataTime;
	}

	public WebElementFacade getCmbAhhoDataTime() {
		return CmbAhhoDataTime;
	}
}
