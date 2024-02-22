Feature: Quiero enviar un correo electronico con informacion

  @EnvioExitosoDeCorreo
  Scenario: Flujo exitoso de correo electronico con: Destinatario asunto descripcion y documento adjunto
    Given Inicia sesion y accede al correo
    When redacta agrega destinatario asunto descripcion documento adjunto y envie el correo
    Then valide en enviados el correo enviado