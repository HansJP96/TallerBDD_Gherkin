package taller.sofka.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import taller.sofka.CuentaAhorros;

public class ConsignacionStepDefinition{
    private CuentaAhorros cuenta;

    @Given("tengo en mi cuenta un saldo ahorrado de {float}")
    public void tengo_en_mi_cuenta_un_saldo_ahorrado_de(Float saldo) {cuenta = new CuentaAhorros(saldo);}

    @When("realizo la consignacion de {float}")
    public void realizo_la_consignacion_de(Float valorIngreso){cuenta.consignar(valorIngreso);}

    @Then("el saldo final de mi cuenta despues de consignar es de {float}")
    public void el_saldo_final_de_mi_cuenta_despues_de_consignar_es_de(Float saldoUltimo) {
        Assert.assertEquals(saldoUltimo,cuenta.getSaldo(),0.1);
    }

}
