Feature: Yo como usuario de Utest
  quiero llenar un nuevo registro
  para acceder como usuario

  @CP_001
  Scenario Outline: Login de usuario
    Given el usuario ingresa a home page
    When el usuario hace login <correo> <password>
    Then el usuario podra ver su username <correo>

    Examples:
      | correo                  | password   |
      | caamilonesssc@gmial.com | Camilo123* |

    