package modelo;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        if(saldo > 0 && saldo >= valor){
            return super.sacar(valor);
        }
        return false;
    }

}
