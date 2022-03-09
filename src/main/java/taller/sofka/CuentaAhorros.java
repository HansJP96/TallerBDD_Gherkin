package taller.sofka;

public class CuentaAhorros {

    private float saldo;

    public CuentaAhorros(){
    }

    public CuentaAhorros(float saldo){
        this.saldo= saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void consignar(float ingreso){
        saldo = saldo + ingreso;
    }

    public void retirar (float retiro){
        if (retiro > saldo) throw new IllegalArgumentException("Saldo insuficiente");
        saldo = saldo - retiro;
    }
}
