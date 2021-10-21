# new feature
# Tags: optional


Feature: Yo como usuario quiero obtener la información de mis fotos.

  Scenario: Consulta exitosa

    Given El usuario ha definido quiere obtener la información de sus fotos
    When El usuario envía la solicitud
    Then El deberá obtener todos los datos solicitados.
