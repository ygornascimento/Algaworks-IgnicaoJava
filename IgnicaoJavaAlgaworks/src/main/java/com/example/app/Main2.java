package com.example.app;

import com.example.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João da Silva", "12345678900");
        Pessoa pessoa2 = new Pessoa("Maria das Couves", "12345678900");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
//        System.out.println(pessoas);

        Pessoa pessoa3 = pessoas.get(1);
//        System.out.println(pessoa3);

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
