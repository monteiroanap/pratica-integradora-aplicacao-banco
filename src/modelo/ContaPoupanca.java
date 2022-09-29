package modelo;

public class ContaPoupanca extends Conta{

    private static double taxa = 0.1;

    public ContaPoupanca(int numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        if(saldo >= valor + taxa){
           return super.sacar(valor + taxa);
        }
        return false;
    }
}
