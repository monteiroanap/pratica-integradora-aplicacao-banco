package modelo;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public boolean sacar(double valor){
        saldo = saldo - valor;
        return true;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente(){
        return cliente;
    }
}
