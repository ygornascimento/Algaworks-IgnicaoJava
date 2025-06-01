package com.example.model;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta) {
        System.out.println("Conta: " + conta.getAgencia());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo Disponível: " + conta.getSaldoDisponivel());
    }
}
