#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Registro de cuenta Demo
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  datos requeridos, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un mensaje informativo. 

  @CasoExitoso1
  Scenario: Diligenciamiento exitoso del formulario Registro de cuenta Demo
    Given Que se necesita realizar la creación de una cuenta demo
    When se realizar el registro de la cuenta en el aplicativo web
    | Primer Nombre |  Apellido  | Pais de residencia |  Ciudad  | Telefono |     Correo     | Idioma preferido |                  Tipo de plataforma de trading                |              Tipo de cuenta              | Moneda base en cuenta | Apalancamiento | Cantidad de Inversion | Contraseña de la cuenta | Confirmación de contraseña |
    |    Camilo     |    Cruz    |       Chile  			|   Yopal  | 11231221 | vvvv1v@sss.com |      Español     | MT4 (forex, CFDs sobre índices bursátiles, metales, energías) |   XM Ultra Low Standard (1 lote=100,000) |          USD 				 |      1:200		  |         5.000				  | 		  As147852367 		  |        As147852367         |
    Then aparece un mensaje de enhorabuena
    
  @CasoExitoso2
  Scenario: Diligenciamiento erroneo con posterior corrección del formulario Registro de cuenta Demo
    Given Que se necesita realizar la creación de una cuenta demo
    When se realizar el registro de la cuenta en el aplicativo web
    | Primer Nombre |  Apellido  | Pais de residencia |  Ciudad  | Telefono |     Correo     | Idioma preferido |                  Tipo de plataforma de trading                           |              Tipo de cuenta              | Moneda base en cuenta | Apalancamiento | Cantidad de Inversion | Contraseña de la cuenta | Confirmación de contraseña |
    |      Ñoño     |    Perez   |      Colombia 			| Medellin | 11115921 | aaaaaa@rrr.com |      Español     | MT5 (forex, CFDs sobre acciones, índices bursátiles, metales y energías) |   XM Ultra Low Standard (1 lote=100,000) |          USD 			    |      1:200		 |         3.000				 | 			As369852147 		   |        As369852147         |
    Then aparece un mensaje erroneo el cual se corrige y se confirma la aparicion del enhorabuena
    
  @CasoError1
  Scenario: Diligenciamiento erroneo del formulario Registro de cuenta Demo Password no coinciden
    Given Que se necesita realizar la creación de una cuenta demo
    When se realizar el registro de la cuenta en el aplicativo web
    | Primer Nombre |  Apellido  | Pais de residencia |  Ciudad  | Telefono |     Correo     | Idioma preferido |                  Tipo de plataforma de trading                |              Tipo de cuenta              | Moneda base en cuenta | Apalancamiento | Cantidad de Inversion | Contraseña de la cuenta | Confirmación de contraseña |
    |    Nombre1    |  Apellido1 |      Colombia 			|  Ciudad1 | 11111111 | valor1@sss.com |      Español     | MT4 (forex, CFDs sobre índices bursátiles, metales, energías) |   XM Ultra Low Standard (1 lote=100,000) |          USD 				 |      1:200		  |         5.000				  | 			As789456123 		  |         As789456124        |
    Then verificar que se presente mensaje informativo
    
  @CasoError2
  Scenario: Diligenciamiento erroneo del formulario Registro de cuenta Demo Password aleatorias
    Given Que se necesita realizar la creación de una cuenta demo
    When se realizar el registro de la cuenta en el aplicativo web con contraseñas aleatorias
    | Primer Nombre |  Apellido  | Pais de residencia |  Ciudad  | Telefono |     Correo     | Idioma preferido |                  Tipo de plataforma de trading                |              Tipo de cuenta              | Moneda base en cuenta | Apalancamiento | Cantidad de Inversion |
    |    Nombre1    |  Apellido1 |      Colombia 			|  Ciudad1 | 11111111 | valor1@sss.com |      Español     | MT4 (forex, CFDs sobre índices bursátiles, metales, energías) |   XM Ultra Low Standard (1 lote=100,000) |          USD 				 |      1:200		  |         5.000				  |
    Then verificar que se presente mensaje informativo

