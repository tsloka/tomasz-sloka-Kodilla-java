package com.kodilla.good.patterns.challenges.product.order.service.information;

import com.kodilla.good.patterns.challenges.product.order.service.TransactionOperation;
import com.kodilla.good.patterns.challenges.product.order.service.User;

public interface InformationProcess {
    void inform(User buyer, User seller, TransactionOperation transactionOperation);
}
