#language : en
Feature: Eliminar cliente
  "Como estudiante quiero eliminar clientes en la tabla para pasar el taller de sophos"

  @Eliminar
  Scenario Outline: Eliminar un cliente exitosamente
    Given que me encuentro en "https://demoqa.com/"
    When elimino al cliente asociado al email "<email>" en la tabla
    Then el cliente es eliminado de la tabla

    Examples:
      | email                 |
      | aquintero@example.com |
      | amoreno@example.com   |