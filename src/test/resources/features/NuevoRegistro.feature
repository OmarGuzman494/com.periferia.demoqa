#Author: omarguzman73@gmail.com

@AgregarRegistros
Feature:  Ingresar a la pagina demoqa, seleccionar la opcion elements web tables y agregar un nuevo registro

   @AgregarNuevoRegistro
  Scenario Outline: seleccionar la opcion elements web tables y agregar un nuevo registro 
    Given Ingresar a la pagina web demoqa "<url>"
    And ingresar al menu Elements
    And ingresar a Web Tables
    When agregar un nuevo registro
    And diligenciar formulario de registro "<txtFirstName>", "<txtLasttName>", "<txtEmail>", "<txtAge>", "<txtSalary>", "<txtDepartment>"
    Then enviar registro
    And Salir de la pagina
    
     Examples: 
      | url                 | txtFirstName  |txtLasttName | txtEmail          | txtAge | txtSalary | txtDepartment | 
       ##@externaldata@src\test\resources\DataDriver\DataNuevoRegistro.xlsx@DatosUsuarios
|https://demoqa.com/|Wilson|Zastoque|jperdomo@gmail.com|37|3500000|QA|
|https://demoqa.com/|Ivana|Zarate|izarate@gmail.com|22|1780000|Analista|
|https://demoqa.com/|Luz Dary|Cabezas|ldcabezas@gmail.com|49|1562000|Pruebas|



@EliminarRegistro
  Scenario Outline: seleccionar la opcion elements web tables y eliminar un registro 
    Given Ingresar a la pagina web demoqa "<url>"
    And ingresar al menu Elements
    And ingresar a Web Tables
    When eliminar un registro
    Then Salir de la pagina
    
     Examples: 
      | url             |
       ##@externaldata@src\test\resources\DataDriver\DataNuevoRegistro.xlsx@Url
|https://demoqa.com/|
    
    
   
