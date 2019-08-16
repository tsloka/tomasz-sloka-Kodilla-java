package com.kodilla.good.patterns.challenges.product.order.service;

import com.kodilla.good.patterns.challenges.product.order.service.delivery.DeliveryMethod;

public final class TransactionOperation {
    private boolean isCreated;
    private User seller;
    private User purchaser;
    private boolean isPaid;
    private Product itemSold;
    private DeliveryMethod deliveryMethod;

    public TransactionOperation(User seller, User purchaser, Product itemSold, DeliveryMethod deliveryMethod) {
        this.seller = seller;
        this.purchaser = purchaser;
        this.itemSold = itemSold;
        this.deliveryMethod = deliveryMethod;
        isCreated = true;
        // method for money transfer initialisation returning isPaid = true;
    }

    public boolean isCreated() {
        return isCreated;
    }

    public User getSeller() {
        return seller;
    }

    public User getPurchaser() {
        return purchaser;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public Product getItemSold() {
        return itemSold;
    }


}
