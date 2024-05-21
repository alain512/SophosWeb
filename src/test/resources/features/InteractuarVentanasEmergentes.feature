#language : en
  @AlertsInteractions
Feature: Interactuar con ventanas emergentes
  "Como estudiante quiero abrir y aceptar una ventana emergente para pasar el taller de sophos"

  Background:
    Given que me encuentro en "https://demoqa.com/"

  @NormalAlert
  Scenario: Aceptar una ventana emergente simple
    When aperturo una ventana emergente
    Then aparece una ventana emergente con la leyenda "You clicked a button"
    And acepto la alerta

  @TimerAlert
  Scenario: Aceptar una ventana emergente con retraso de cinco segundos
    When aperturo una ventana emergente que tiene retraso de cinco segundos
    Then aparece una ventana emergente con la leyenda "This alert appeared after 5 seconds"
    And acepto la alerta

  @ConfirmationAlert
  Scenario: Aceptar una ventana emergente de confirmacion
    When aperturo una ventana emergente de confirmacion
    Then aparece una ventana emergente con la leyenda "Do you confirm action?"
    And acepto la alerta
    And se muestra "You selected Ok"

  @PromptAlert
  Scenario Outline: Aceptar una ventana emergente con prompt
    When aperturo una ventana emergente con prompt
    Then aparece una ventana emergente con la leyenda "Please enter your name"
    And registro mi nombre "<name>" en el prompt de la alert
    And acepto la alerta
    And se muestra "You entered <name>"

    Examples:
    | name |
    | Alain|