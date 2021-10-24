Feature: Yo como usuario quiero obtener la información de mis fotos.

  Scenario: Consulta exitosa

    Given El usuario ha definido que quiere obtener la información de sus fotos
    When El usuario envía la solicitud
    Then El deberá obtener todos los datos solicitados con el codigo de respuesta 200.


  Scenario: Verificar título

    Given El usuario ha definido quiere verificar el titulo de id 1
    When El usuario envía la solicitud
    Then El deberá obtener el título "accusamus beatae ad facilis cum similique qui sunt"
