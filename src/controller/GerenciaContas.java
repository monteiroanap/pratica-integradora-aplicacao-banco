package controller;

import modelo.*;
import util.NumberGenerator;
import java.util.HashMap;
import java.util.Map;

public class GerenciaContas {
 private NumberGenerator numberGenerator;
 private Map<Integer, Conta> contas;

    public GerenciaContas() {
        numberGenerator = NumberGenerator.getInstance();
        contas = new HashMap<>();
    }
    public void novaContaCorrente(Cliente cliente){
        ContaCorrente conta = new ContaCorrente(numberGenerator.generate(),0, cliente);
        contas.put(conta.getNumero(), conta);
    }
    public void novaContaPoupanca(Cliente cliente){
        ContaPoupanca conta = new ContaPoupanca(numberGenerator.generate(),0, cliente);
        contas.put(conta.getNumero(), conta);
    }
    public void novaContaEspecial(Cliente cliente, double limite){
        ContaEspecial conta = new ContaEspecial(numberGenerator.generate(),0, cliente, limite);
        contas.put(conta.getNumero(), conta);
    }
    public void consultarDadosConta(Integer numeroConta){
        Conta conta = contas.get(numeroConta);
        if(conta == null){
            //excecao
            System.out.println("conta nao encontrada");
            return;
        }
        conta.toString();
    }
    public void removerConta(Integer numeroConta){
        Conta conta = contas.get(numeroConta);
        if(conta == null) {
            System.out.println("conta nao encontrada");
            //excessao
            return;
        }
        contas.remove(numeroConta);
    }
    public void depositar(Integer numeroConta, double valor){
        Conta conta = contas.get(numeroConta);
        if(conta == null){
            //excessao
            System.out.println("valor a depositar");
            return;
        }
        conta.depositar(valor);
    }
    public void sacar(Integer numeroConta, double valor){
        Conta conta =contas.get(numeroConta);
        if(conta == null){
            //excessao
            System.out.println("valor a depositar");
            return;
        }
        conta.sacar(valor);
    }
    public void transferir(Integer numeroContaOrigem, Integer numeroContaDestino, double valor){
        Conta contaOrigem = contas.get(numeroContaOrigem);
        Conta contaDestino = contas.get(numeroContaDestino);
        if(contaOrigem == null || contaOrigem == null){
            //excessao
            System.out.println("contra nao encontrada");
            return;
        }
        boolean sacado = contaOrigem.sacar(valor);
        if(sacado){
            contaDestino.depositar(valor);
        }

    }
}
