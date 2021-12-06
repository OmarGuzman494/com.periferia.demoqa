package utilidades;

import net.serenitybdd.core.Serenity;

import static org.junit.Assert.fail;

import java.text.ParseException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.text.SimpleDateFormat;
import com.periferia.demoqa.pageObjects.AgregarFechasPageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;


public class Utilidades extends PageObject{

	
	private static final Logger LOGGER = LoggerFactory.getLogger("Registro");
	private EnvironmentVariables environmentVariables; 
	private static final String WEBDRIVERTIMEOUT = "webdriver.timeouts.implicitlywait";
	AgregarFechasPageObjects pageObjectsAgregarFechas;
	
	
	public void esperaCargarPagina() {		
		int intTimer = 15;
		try {
			new WebDriverWait(getDriver(), intTimer).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
					.executeScript("return document.readyState").equals("complete"));			
		}catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo esperaCargarPagina " + e);
			}		
	}
	
	public void escribirTexto(WebElementFacade webElementFacade, String strTexto) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			WebElementFacade input = element(webElementFacade);
			waitFor(input).isEnabled();
			input.clear();
			input.type(strTexto);
		}catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo escribirTexto" + e);
		}
	}

	public void tomarEvidencia() {
		try {
			Serenity.takeScreenshot();
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo tomarEvidencia " + e);
		}
	}
	
	public int obtenerTiempoSerenity() {
		return (Integer.parseInt(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEBDRIVERTIMEOUT)))/1000;
	}
	
	public void bordearElemento(WebElement txtProductoASeleccionar) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed red'",
					element(txtProductoASeleccionar));
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.background='#cc8f94'", element(txtProductoASeleccionar)); 
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo bordearElemento " + e);
		}
	}
	
	
	public void bordearElemento(By webLocalizador) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed red'",
					element(webLocalizador));
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.background='#cc8f94'", element(webLocalizador)); 
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo bordearElemento " + e);
		}
	}

	public void bordearElementoBy(org.openqa.selenium.By by) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed red'",
					element(by));
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.background='#cc8f94'", element(by)); 
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo bordearElemento " + e);			
		
		}
	}
	
public void clickEnBoton(WebElementFacade webElementFacade) {
		
		try {
				WebDriverWait wait = new WebDriverWait(getDriver(), 15);
				wait.until(ExpectedConditions.elementToBeClickable(webElementFacade));
				((WebElement) webElementFacade).click();
	
		} catch (Exception e) {
			System.out.println(webElementFacade + " error: " + e.getMessage());
			LOGGER.error("ERROR: en la clase Utilidades en el método clickEnBoton: " + e);
		}
	}
	
	public void clickBoton(WebElementFacade boton) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 15);
			wait.until(ExpectedConditions.elementToBeClickable(boton));
			boton.click();

	} catch (Exception e) {
		System.out.println(boton + " error: " + e.getMessage());
		LOGGER.error("ERROR: en la clase Utilidades en el método clickEnBoton: " + e);
	}
		
	}

	public void posicionarElemento(WebElement txtProductoASeleccionar) {
		Actions actions=new Actions(getDriver());
		actions.moveToElement(txtProductoASeleccionar).perform();
		if(elementoExite(find(By.id("js-cookie-notification")), 1))
		{			
			System.out.println("MENSAJE");
					find(By.xpath("//*[@id='js-cookie-notification']//div[contains(@class,'button')]")).click();
					
		
		}	
	}
	
	public void desplazarScrollArriba() {
		try {
			((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo desplazarScrollArriba " + e);
		}
	}
	
	public void posicionarElementoScrollBy(org.openqa.selenium.By by) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoViewIfNeeded(true);",
					element(by));
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo posicionarElementoScroll " + e);
		}
	
	}
	
	public void posicionarElementoScroll(WebElementFacade webElementFacade) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoViewIfNeeded(true);",
					element(webElementFacade));
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo posicionarElementoScroll " + e);
		}
	
	}
	public boolean elementoExite(WebElementFacade webElemento, int iespera ) {
		try { 
			int contador=0;
				
				do {
					contador++;	
						System.out.println("Elemnto existe"+iespera);		
						if (webElemento.isCurrentlyVisible()) {
							return true;
						}
				waitFor(300).milliseconds();
				}while (contador<iespera);
				return false;
			} catch (Exception e) {
				 return false;
			 }
	}
	
	public void clickEnBotonEspecial(WebElement by) {
		try {
			waitFor(1).second();
			WebDriverWait wait = new WebDriverWait(getDriver(), 30);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		
			withAction().moveToElement(by).click().build().perform();

	} catch (Exception e) {
		System.out.println(by + " error: " + e.getMessage());
		LOGGER.error("ERROR: en la clase Utilidades en el método clickEnBotonEspecial: " + e);
	}
}
	
	public void clickEnBotonEspecialBy(org.openqa.selenium.By by) {
		try {
			waitFor(1).second();
			WebDriverWait wait = new WebDriverWait(getDriver(), 30);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		
			withAction().moveToElement((WebElement) by).click().build().perform();

	} catch (Exception e) {
		System.out.println(by + " error: " + e.getMessage());
		LOGGER.error("ERROR: en la clase UtilidadesWeb en el método clickEnBotonEspecial: " + e);
	}
}
	
	public void desplazarScroll(String x, String y) {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(" + x + "," + y + ")");
	}
	
	public void seleccionarOpcion(WebElementFacade webElementFacade, String stgOpcion) {
		try {
			WebElementFacade dropbox = element(webElementFacade);
			dropbox.selectByVisibleText(stgOpcion);
		} catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo seleccionarOpcion" + e);
		}
	}
	
	
	public String extraerTextodeLabel(WebElement webElement) {
		try {
			if (element(webElement).isCurrentlyVisible() && element(webElement).isCurrentlyEnabled()) {
				WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
				return element(webElement).getText().toString();
			}
			return "";
		} catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo extraerTextodeLabel " + e);
		}
		return null;
	}
	
	
	
	public void cerrarPagina() {
		getDriver().close();
		
	}

	public void finalizarEjecucionFallida(String strMensaje) {
		tomarEvidencia();
		fail(strMensaje);
	}

	public void seleccionarFechaCalendario(String strFecha) {
	 	 String date = strFecha;
	 try {
		 String date_dd_MM_yyyy[] = (date.split(" ")[0]).split("/");
		 String año =(date_dd_MM_yyyy[2]);
		 int month =  Integer.parseInt(date_dd_MM_yyyy[1]);
		 String dia = (date_dd_MM_yyyy[0]);
		 String mes ="";
				switch(month) {
				case 1:
					mes = "January";
						break;
				case 2:
					mes = "February";
					break;
				case 3:
					mes = "March";
					break;
				case 4:
					mes = "April";
					break;
				case 5:
					mes = "May";
				    break;
				case 6:
					mes = "June";
					break;
				case 7:
					mes = "July";
					break;
				case 8:
					mes = "August";
					break;	
				case 9:
					mes = "September";
					break;
				case 10:
					mes = "October";
					break;
				case 11:
					mes = "November";
					break;
				case 12:
					mes = "December";
					break;
				}  
				try {
					waitFor(300).millisecond();
				} catch (Exception e) {
					e.printStackTrace();
				}  
				
				 waitFor(300).millisecond();
				 seleccionarOpcion(pageObjectsAgregarFechas.getCmbMes(), mes);
				 waitFor(300).millisecond();
				 seleccionarOpcion(pageObjectsAgregarFechas.getCmbAhho(), año);
				 waitFor(300).millisecond();
				 WebElementFacade btnDia = find(By.xpath("(//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']//div[text()='*'])[1]".replace("*", dia)));
				 desplazarScroll("200","100");
				 posicionarElementoScroll(btnDia);
				 bordearElemento(btnDia);
				 clickEnBotonEspecial(btnDia);
				 tomarEvidencia();
				
	 }catch( Exception e) {
		 finalizarEjecucionFallida("Error en la clase Utilidades en el método seleccionarFechaInicioCalendario");
			}  
	 tomarEvidencia();
} 
	

	public void seleccionarFechaHoraCalendario(String strFechaHora) {
		String dateTime = strFechaHora;	
	 try {
		 String date_dd_MM_yyyy_hh_mm[] = (dateTime.split(" ")[0]).split("/");
		 String año =(date_dd_MM_yyyy_hh_mm[2]);
		 int month =  Integer.parseInt(date_dd_MM_yyyy_hh_mm[1]);
		 String dia = (date_dd_MM_yyyy_hh_mm[0]);
		 String time_dd_MM_yyyy_hh_mm[] = (dateTime.split(" ")[1]).split(":");
		 String hora = (time_dd_MM_yyyy_hh_mm[0]);
		 String minutos = (time_dd_MM_yyyy_hh_mm[1]);
		 String mes ="";
				switch(month) {
				case 1:
					mes = "January";
						break;
				case 2:
					mes = "February";
					break;
				case 3:
					mes = "March";
					break;
				case 4:
					mes = "April";
					break;
				case 5:
					mes = "May";
				    break;
				case 6:
					mes = "June";
					break;
				case 7:
					mes = "July";
					break;
				case 8:
					mes = "August";
					break;	
				case 9:
					mes = "September";
					break;
				case 10:
					mes = "October";
					break;
				case 11:
					mes = "November";
					break;
				case 12:
					mes = "December";
					break;
				}  
				try {
					waitFor(300).millisecond();
				} catch (Exception e) {
					e.printStackTrace();
				}  
				String strMesahhoData = mes +" "+ año;
				 waitFor(300).millisecond();
				
				String strMesahhoCalendario= extraerTextodeLabel(pageObjectsAgregarFechas.getCmbmesAhho());
				 if(strMesahhoCalendario.contentEquals(strMesahhoData)) {
					    WebElementFacade btnDia = find(By.xpath("(//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']//div[text()='*'])[1]".replace("*", dia)));
						posicionarElementoScroll(btnDia);
						bordearElemento(btnDia);
						clickEnBotonEspecial(btnDia);
						tomarEvidencia();
				 }else {
					 waitFor(300).millisecond();
					 clickEnBotonEspecial(pageObjectsAgregarFechas.getcmbMesDataTime());
					 WebElementFacade selectMes = find(By.xpath("//div[@class='react-datepicker__month-dropdown']/div[text()='*']".replace("*", mes)));
					 desplazarScroll("400","200");
					 bordearElemento(selectMes);
					 clickEnBoton(selectMes);
					 waitFor(300).millisecond();
					 tomarEvidencia();
					 clickEnBotonEspecial(pageObjectsAgregarFechas.getCmbAhhoDataTime());
					 WebElementFacade selecAhho = find(By.xpath("//div[@class='react-datepicker__year-dropdown']//div[text()='*']".replace("*", año)));
					 bordearElemento(selecAhho);
					 clickEnBotonEspecial(selecAhho);
					 waitFor(300).millisecond();
					 tomarEvidencia();
					 WebElementFacade btnDia = find(By.xpath("(//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']//div[text()='*'])[1]".replace("*", dia)));
					 bordearElemento(btnDia);
					 clickEnBoton(btnDia);
					 tomarEvidencia();
				 }
				 int minutosData = Integer.parseInt(minutos);
				 String selectMinuto = "";
				 if(minutosData<15) {
					 selectMinuto = "00";
				 }else if((minutosData>14) && (minutosData<30)){
					 selectMinuto = "15";
				 }else if((minutosData>29) && (minutosData<45)){
					 selectMinuto = "30";
				 }else if((minutosData>44) && (minutosData<60)){
					 selectMinuto = "45";
				 }
				 String horaMinutos =  hora + ":" + selectMinuto;
				WebElementFacade time = find(By.xpath("//ul[@class='react-datepicker__time-list']//li[text()='*']".replace("*", horaMinutos)));
				posicionarElementoScroll(time);
				bordearElemento(time);
				clickEnBotonEspecial(time);
				desplazarScrollArriba();
				tomarEvidencia();
				
	 }catch( Exception e) {
		 finalizarEjecucionFallida("Error en la clase Utilidades en el método seleccionarFechaHoraCalendario");
			}  
		
	} 
	
		 
	 public static java.util.Date ParseFecha(String fecha)
	    {
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(fecha);
	        } 
	        catch (ParseException ex) 
	        {
	            System.out.println(ex);
	        }
	        return fechaDate;
	    }
	
	 
	 public void cambioDeFrameDefault() {
			try {
				getDriver().switchTo().defaultContent();
			}catch(Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo cambioDeFrameDefault " + e);
			}
		}
		
		public void cambioDeFrame(int frame) {
			try {
				getDriver().switchTo().frame(frame);
			}catch(Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo cambioDeFrame" + e);
			}
		}
		
		
	 public void aceptarAlertaPorMensaje(String strMensajeAcertado){
			Alert alert;
			String mensaje = "";
			WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			try {
				wait.until(ExpectedConditions.alertIsPresent());
				alert = getDriver().switchTo().alert();
				if (alert.getText().contains(strMensajeAcertado)) {
					alert.accept();
				} else {
					mensaje = alert.getText();
					alert.dismiss();
					LOGGER.error("Se presentó una alerta no esperada");
					fail("Se presentó una alerta no esperada: " + mensaje);
				}
			} catch (Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo aceptarAlertaPorMensaje " + e);
			}
		}
		
	 public void diligenciarAlerta(String txtTextoAlerta){
			Alert alert;
			WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			try {
				wait.until(ExpectedConditions.alertIsPresent());
				alert = getDriver().switchTo().alert();
				alert.sendKeys(txtTextoAlerta);
				alert.accept();
			} catch (Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo diligenciarAlerta " + e);
			}
		}
	 
	 
		public boolean validaAlerta() {
			boolean booBandera = false;
			WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			try {
				wait.until(ExpectedConditions.alertIsPresent());
				booBandera = true;
			}catch(TimeoutException eTO) {
				booBandera = false;
			}
			return booBandera;
		}
		
}
