Feature: Realizar un registro de manera exitosa en el sitio web test portal
  como usuario
  quiero ingresar al sitio web www.testportal.com y diligenciar unos datos
  para Realizar un registro
  @regresion

  @caso1
  Scenario: Ingresar al sitio web y diligenciar unos datos para veriricar un registro de usuario exitoso
    Given Ingresar al sitio web
    When  diligenciar los datos y registrar un usuario
   |   tipo      |  email             |   password  | nombre|   apellido  | escuela           |  pais      |  zona                              | telefono   |
   |   Education |  11113fr@gmail.com |   Pjairo123 |  juan |    henao    |   fray julio      |   Colombia | (GMT -05:00) Bogota, Lima, Quito   | 3016526985 |
    Then  Verificar el registro exitoso  "Welcome to the tests manager. Create new tests. Manage existing ones. Edit, delete, copy, filter and group them into categories."
