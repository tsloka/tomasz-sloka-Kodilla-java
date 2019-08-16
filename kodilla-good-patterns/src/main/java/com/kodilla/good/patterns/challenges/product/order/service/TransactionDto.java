package com.kodilla.good.patterns.challenges.product.order.service;

public class TransactionDto {
    private User seller;
    private boolean isSold;

    public TransactionDto(final User seller, final boolean isSold) {
        this.seller = seller;
        this.isSold = isSold;
    }

    public User getSeller() {
        return seller;
    }

    public boolean isSold() {
        return isSold;
    }
}
