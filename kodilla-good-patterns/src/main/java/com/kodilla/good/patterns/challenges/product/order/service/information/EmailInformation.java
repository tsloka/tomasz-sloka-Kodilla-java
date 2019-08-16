package com.kodilla.good.patterns.challenges.product.order.service.information;

import com.kodilla.good.patterns.challenges.product.order.service.TransactionOperation;
import com.kodilla.good.patterns.challenges.product.order.service.User;

public class EmailInformation implements InformationProcess {
    @Override
    public void inform(User buyer, User seller, TransactionOperation transactionOperation) {
        System.out.println("Information for buyer was sent by email.");
        System.out.println("Information for seller was sent by email.");
    }
}
