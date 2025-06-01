package com.example.model;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    Conta() {

    }

    public Conta(Pessoa titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(getSaldoDisponivel() - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    public void sacar(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);
    }

    public double getSaldoDisponivel() {
        return getSaldo();
    }

}
