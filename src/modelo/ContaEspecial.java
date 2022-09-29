package modelo;

public class ContaEspecial extends Conta{

    private double chequeEspecial;

    public ContaEspecial(int numero, double saldo, Cliente cliente, double chequeEspecial) {
        super(numero, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }


    @Override
    public boolean sacar(double valor) {
        if(saldo >= -chequeEspecial && (saldo - valor) >= -chequeEspecial){
            return super.sacar(valor);
        }
        return false;

    }
}
