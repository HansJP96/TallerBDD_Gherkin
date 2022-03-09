# new feature
# Tags: optional

Feature: Retirar dinero de cuenta de ahorros
  Yo como usuario del banco x
  Quiero poder retirar dinero de mi cuenta
  Para utilizarlo en gastos personales

  Scenario: Retirar dinero
    Given tengo en mi cuenta un saldo maximo para retirar de 500000.00
    When realizo el retiro de 100000.00
    Then el saldo final de mi cuenta despues del retiro es de 400000.00

  Scenario: Retirar dinero con saldo insuficiente
    Given tengo en mi cuenta un saldo maximo para retirar de 100000.00
    When realizo el retiro de 150000.00
    Then me aparece un mensaje de error que dice "Saldo insuficiente"