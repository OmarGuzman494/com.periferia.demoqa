#Author: omarguzman73@gmail.com

@GestionALertsFrame
Feature:  Ingresar a la pagina demoqa, seleccionar la opcion Alerts,Frame y gestionar las diferentes alertas


	@GestionAlertas
  Scenario Outline: Ingresar a Widgets,seleccionar la opcion Date Picker  y seleccionar fechas
    Given Ingresar a la pagina web demoqa "<url>"
    And ingresar al menu Alerts,Frame
    And ingresar a Alerts,Frame
    And ingresar a Alerts
    When click en ver alerta
    And cerrar alerta
    And click alerta despues cinco segundos
    And click alerta cuadro confirmacion
    And validar mensaje cuadro confirmacion "<strMensajeCuadroConfirmacion>", "<strMensajeAlerta>"
    And click alerta cuadro aviso "<strName>"
    Then validar respuesta cuadro aviso alerta "<strName>"
    And Salir de la pagina
    
   Examples: 
      | url             | strMensajeCuadroConfirmacion  | strMensajeAlerta  | strName  |
       ##@externaldata@src\test\resources\DataDriver\DataNuevoRegistro.xlsx@DatAlertas 
|https://demoqa.com/|Do you confirm action?|You selected Ok|Omar Guzman|

