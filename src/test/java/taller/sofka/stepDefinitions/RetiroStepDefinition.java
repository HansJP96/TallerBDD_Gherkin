package taller.sofka.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import taller.sofka.CuentaAhorros;


public class RetiroStepDefinition {
    private CuentaAhorros cuenta;
    private Exception error;

    @Given("tengo en mi cuenta un saldo maximo para retirar de {float}")
    public void tengo_en_mi_cuenta_un_saldo_maximo_para_retirar_de(Float saldo) {
        cuenta = new CuentaAhorros(saldo);
    }

    @When("realizo el retiro de {float}")
    public void realizo_el_retiro_de(Float valorRetiro) {
        try {
            cuenta.retirar(valorRetiro);
        } catch (IllegalArgumentException e){
            error = Assert.assertThrows(e.getClass(), ()->  cuenta.retirar(valorRetiro));
        }
    }

    @Then("el saldo final de mi cuenta despues del retiro es de {float}")
    public void el_saldo_final_de_mi_cuenta_despues_del_retiro_es_de(Float saldoUltimo) {
        Assert.assertEquals(saldoUltimo, cuenta.getSaldo(), 0.1);
    }

    @Then("me aparece un mensaje de error que dice {string}")
    public void me_aparece_un_mensaje_de_error_que_dice(String mensaje) {
        Assert.assertEquals(mensaje, error.getMessage());
    }
}
