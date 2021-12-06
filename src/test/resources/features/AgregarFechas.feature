#Author: omarguzman73@gmail.com

@AgregarfehaYFechaTime
Feature:  Ingresar a la pagina demoqa, seleccionar la opcion Widgets -Date Picker y diligeciar fecha de inicio y fechatime

  @AgregarFecha
  Scenario Outline: Ingresar a Widgets,seleccionar la opcion Date Picker  y seleccionar fechas
    Given Ingresar a la pagina web demoqa "<url>"
    And ingresar al menu Widgets
    And ingresar a Date Picker
    When agregar una fecha "<txtFecha>"
    And seleccionar una fecha y hora "<txtFechaHora>"
    Then enviar registro
    And Salir de la pagina
    
      Examples: 
      | url             | txtFecha  | txtFechaHora  |
       ##@externaldata@src\test\resources\DataDriver\DataNuevoRegistro.xlsx@DataFechas
|https://demoqa.com/|24/12/2022|19/07/2023 23:57|
|https://demoqa.com/|7/10/2024|28/09/2025 09:05|
