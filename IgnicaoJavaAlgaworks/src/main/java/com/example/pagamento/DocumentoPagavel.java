package com.example.pagamento;

public interface DocumentoPagavel {
    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();
}
