#language : en
  Feature: Registrar cliente
    "Como estudiante quiero registrar clientes en la tabla para pasar el taller de sophos"

  @Registrar
  Scenario Outline: Registrar cliente exitosamente
    Given que me encuentro en "https://demoqa.com/"
    When registro al cliente en la tabla
    | firstName | lastName | email | age | salary | department |
    |<firstName>|<lastName>|<email>|<age>|<salary>|<department>|
    Then el cliente es registrado en la tabla

    Examples:
      | firstName | lastName | email         | age | salary  | department |
      | Alain     | Quintero | a.q@gmail.com | 34  | 6000000 | Systems    |
      | Alejandra | Moreno   | a.m@gmail.com | 31  | 5500000 | Proyects   |