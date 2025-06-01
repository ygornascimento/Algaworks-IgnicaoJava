package com.example.app;

import com.example.model.*;

public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("12345678900");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("00099988877");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);
        minhaConta.creditarRendimentos(0.8);

        ContaEspecial suaConta = new ContaEspecial(titular2,222, 333, 1_000);
        suaConta.depositar(15_000);
        suaConta.sacar(15_500);

        caixaEletronico.imprimirSaldo(suaConta);

    }
}