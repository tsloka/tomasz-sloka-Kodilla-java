package com.kodilla.good.patterns.challenges.product.order.service;

import com.kodilla.good.patterns.challenges.product.order.service.information.InformationProcess;

public class ProductOrderService {
    private TransactionOperation transactionOperation;
    private InformationProcess informationProcess;
    private TransactionRepository transactionRepository;

    public ProductOrderService(final TransactionOperation transactionOperation,
                               final InformationProcess informationProcess,
                               final TransactionRepository transactionRepository) {
        this.transactionOperation = transactionOperation;
        this.informationProcess = informationProcess;
        this.transactionRepository = transactionRepository;
    }

    public TransactionDto process (final TransactionOperation transactionOperation) {
        boolean isSold = transactionOperation.isCreated();
        if (isSold) {
            informationProcess.inform(transactionOperation.getPurchaser(), transactionOperation.getSeller(),transactionOperation);
            transactionRepository.createTransaction(transactionOperation);
            return new TransactionDto(transactionOperation.getSeller(),true);
        } else {
            return new TransactionDto(transactionOperation.getSeller(),false);
        }
    }

}
