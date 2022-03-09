# new feature
# Tags: optional

Feature: Consignar dinero en cuenta de ahorros
  Yo como usuario del banco x
  Quiero poder consignar dinero
  Para aumentar el saldo de mi cuenta de ahorros

  Scenario Outline: Consignar dinero
    Given tengo en mi cuenta un saldo ahorrado de <saldo>
    When realizo la consignacion de <aConsignar>
    Then el saldo final de mi cuenta despues de consignar es de <saldoFinal>
    Examples:
      |saldo|aConsignar|saldoFinal|
      |50000.00|100000.00|150000.00|
      |230000.00|370000.00|600000.00|
      |124300.00|198200.00|322500.00|