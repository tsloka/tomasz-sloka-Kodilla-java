package com.kodilla.good.patterns.challenges.product.order.service;

import java.util.LinkedHashSet;

public class TransactionRepository {
    private TransactionOperation transactionOperation;
    private LinkedHashSet<TransactionOperation> transactions;

    public TransactionRepository(TransactionOperation transactionOperation, LinkedHashSet<TransactionOperation> transactions) {
        this.transactionOperation = transactionOperation;
        this.transactions = transactions;
    }

    public void createTransaction (TransactionOperation transactionOperation) {
        transactions.add(transactionOperation);
    }
}
