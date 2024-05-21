#language : en
Feature: Seleccionar fecha
  "Como estudiante quiero seleccionar una fecha especifica para pasar el taller de sophos"

  #El detecta en que formato viene la fecha y selecciona la fecha en el campo acorde al formato
  #Formatos aceptados: MM/DD/AAAA  :  Mont DD, AAAA, HH:MM AM/PM
  @SelectDate
  Scenario Outline: Seleccionar fecha con formatos distintos exitosamente
    Given que me encuentro en "https://demoqa.com/"
    When selecciono la fecha "<date>"
    Then la fecha es mostrada

    Examples:
      | date                   |
      | 05/20/2024             |
      | Mayo 12, 2023 10:30 AM |