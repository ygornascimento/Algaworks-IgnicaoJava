package com.example.app;

import com.example.atm.CaixaEletronico;
import com.example.model.*;
import com.example.pagamento.Boleto;
import com.example.pagamento.DocumentoPagavel;
import com.example.pagamento.Holerite;

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
        minhaConta.debitarTarifaMensal();
        minhaConta.creditarRendimentos(0.8);

        ContaEspecial suaConta = new ContaEspecial(titular2,222, 333, 0);
        suaConta.depositar(30_000);
//        suaConta.sacar(15_500);
//        suaConta.debitarTarifaMensal();

        DocumentoPagavel boletoEscola = new Boleto(titular2, 800);
        DocumentoPagavel salarioFuncionario = new Holerite(titular2, 100, 160);
        caixaEletronico.pagar(boletoEscola, suaConta);
        caixaEletronico.pagar(salarioFuncionario, suaConta);
        caixaEletronico.imprimirSaldo(suaConta);
        System.out.println("Boleto Pago: " + boletoEscola.estaPago());
        System.out.println("Holerite Pago: " + salarioFuncionario.estaPago());


    }
}